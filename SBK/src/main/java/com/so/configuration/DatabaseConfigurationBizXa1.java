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
@MapperScan(basePackages="com.so.mapper.mapperBizXa1", sqlSessionFactoryRef="xaSqlSessionFactory1") 
public class DatabaseConfigurationBizXa1 {

	@Bean(name="xaJndiTemplate1")
	public JndiTemplate xaJndiTemplate1() {
		JndiTemplate jndiTemplate = new JndiTemplate();
		Properties environment = new Properties();

		environment.setProperty("java.naming.factory.initial", "jeus.jndi.JNSContextFactory");
		jndiTemplate.setEnvironment(environment);

		return jndiTemplate;
	}
	
	@Bean(name="xaTransactionManager1")
	public JtaTransactionManager xaTransactionManager1(@Qualifier("xaJndiTemplate1") JndiTemplate xaJndiTemplate) {
		JtaTransactionManager transactionManager = new JtaTransactionManager();

		transactionManager.setJndiTemplate(xaJndiTemplate);

		return transactionManager;
	}
	
	@Bean(name="xaDataSource1")
	public JndiObjectFactoryBean xaDataSource1(@Qualifier("xaJndiTemplate1") JndiTemplate xaJndiTemplate) {
		JndiObjectFactoryBean jpfb = new JndiObjectFactoryBean();

		jpfb.setJndiName("bizXa1");
		jpfb.setJndiTemplate(xaJndiTemplate);

		return jpfb;
	}
	
	@Bean(name="xaSqlSessionFactory1")
	public SqlSessionFactory xaSqlSessionFactory1(@Qualifier("xaDataSource1") DataSource xaDataSource, ApplicationContext applicationContext) throws Exception {
		SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();

		factoryBean.setDataSource(xaDataSource);
		factoryBean.setConfigLocation(applicationContext.getResource("classpath:com/so/mapper/SoMapperConfigBizXa1.xml"));

		return factoryBean.getObject();
	}
	
	@Bean(name="xaSqlSessionTemplate1")
	public SqlSessionTemplate xaSqlSessionTemplate1(@Qualifier("xaSqlSessionFactory1") SqlSessionFactory xaSqlSessionFactory) throws Exception {
		return new SqlSessionTemplate(xaSqlSessionFactory);
	}
	

}
