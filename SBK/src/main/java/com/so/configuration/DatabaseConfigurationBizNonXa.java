package com.so.configuration;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jndi.JndiObjectFactoryBean;
import org.springframework.jndi.JndiTemplate;

@Configuration
@MapperScan(basePackages="com.so.mapper.mapperBizNonXa", sqlSessionFactoryRef="nonXaSqlSessionFactory")
public class DatabaseConfigurationBizNonXa {
	
	@Bean
	public JndiTemplate jndiTemplate() {
		JndiTemplate jndiTemplate = new JndiTemplate();
		Properties environment = new Properties();

		environment.setProperty("java.naming.factory.initial", "jeus.jndi.JNSContextFactory");
		jndiTemplate.setEnvironment(environment);

		return jndiTemplate;
	}
	
	@Bean(name="nonXaDataSource")
	public JndiObjectFactoryBean nonXaDataSource(JndiTemplate jndiTemplate) { 
		JndiObjectFactoryBean jpfb = new JndiObjectFactoryBean();
		
		jpfb.setJndiName("bizNonXa");
		jpfb.setJndiTemplate(jndiTemplate);
		
		return jpfb;
	}
	
	@Bean(name="nonXaTransactionManager")
	public DataSourceTransactionManager nonXaTransactionManager(@Qualifier("nonXaDataSource") DataSource nonXaDataSource) {
		DataSourceTransactionManager transactionManager = new DataSourceTransactionManager(nonXaDataSource);
		
		return transactionManager;
	}

	@Bean(name="nonXaSqlSessionFactory")
	public SqlSessionFactory nonXaSqlSessionFactory(@Qualifier("nonXaDataSource") DataSource nonXaDataSource, ApplicationContext applicationContext) throws Exception {
		SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
		
		factoryBean.setDataSource(nonXaDataSource);
		factoryBean.setConfigLocation(applicationContext.getResource("classpath:com/so/mapper/SoMapperConfigBizNonXa.xml"));
		
		return factoryBean.getObject();
	}
	
	@Bean(name="nonXaSqlSessionTemplate")
	public SqlSessionTemplate nonXaSqlSessionTemplate(@Qualifier("nonXaSqlSessionFactory") SqlSessionFactory nonXaSqlSessionFactory) throws Exception {
		return new SqlSessionTemplate(nonXaSqlSessionFactory);
	}
	
}