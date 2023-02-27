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
import org.springframework.jndi.JndiObjectFactoryBean;
import org.springframework.jndi.JndiTemplate;
import org.springframework.transaction.jta.JtaTransactionManager;

@Configuration
@MapperScan(basePackages="com.so.mapper.mapperBizXa2", sqlSessionFactoryRef="xaSqlSessionFactory2") 
public class DatabaseConfigurationBizXa2 {

	@Bean(name="xaJndiTemplate2")
	public JndiTemplate xaJndiTemplate2() {
		JndiTemplate jndiTemplate = new JndiTemplate();
		Properties environment = new Properties();

		environment.setProperty("java.naming.factory.initial", "jeus.jndi.JNSContextFactory");
		jndiTemplate.setEnvironment(environment);

		return jndiTemplate;
	}
	
	@Bean(name="xaTransactionManager2")
	public JtaTransactionManager xaTransactionManager2(@Qualifier("xaJndiTemplate2") JndiTemplate xaJndiTemplate) {
		JtaTransactionManager transactionManager = new JtaTransactionManager();

		transactionManager.setJndiTemplate(xaJndiTemplate);

		return transactionManager;
	}
	
	@Bean(name="xaDataSource2")
	public JndiObjectFactoryBean xaDataSource2(@Qualifier("xaJndiTemplate2") JndiTemplate xaJndiTemplate) {
		JndiObjectFactoryBean jpfb = new JndiObjectFactoryBean();

		jpfb.setJndiName("bizXa2");
		jpfb.setJndiTemplate(xaJndiTemplate);

		return jpfb;
	}
	
	@Bean(name="xaSqlSessionFactory2")
	public SqlSessionFactory xaSqlSessionFactory2(@Qualifier("xaDataSource2") DataSource xaDataSource, ApplicationContext applicationContext) throws Exception {
		SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();

		factoryBean.setDataSource(xaDataSource);
		factoryBean.setConfigLocation(applicationContext.getResource("classpath:com/so/mapper/SoMapperConfigBizXa2.xml"));

		return factoryBean.getObject();
	}
	
	@Bean(name="xaSqlSessionTemplate2")
	public SqlSessionTemplate xaSqlSessionTemplate1(@Qualifier("xaSqlSessionFactory2") SqlSessionFactory xaSqlSessionFactory) throws Exception {
		return new SqlSessionTemplate(xaSqlSessionFactory);
	}

}
