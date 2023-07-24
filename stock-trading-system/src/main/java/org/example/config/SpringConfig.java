package org.example.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


import java.util.Properties;

import javax.sql.DataSource;

@Configuration
//@ComponentScan({"org.example.service;","org.example.model"})

@ComponentScan("org.example.service;")
public class SpringConfig {
	
	@Bean
	  public LocalSessionFactoryBean sessionFactoryBean() {
	    LocalSessionFactoryBean sessionFactoryBean = new LocalSessionFactoryBean();
	    sessionFactoryBean.setDataSource(dataSource());
	    sessionFactoryBean.setHibernateProperties(hibernateProperties());
	    sessionFactoryBean.setPackagesToScan("org.example.model");
	    return sessionFactoryBean;
	  }
	
	 @Bean
	  public DataSource dataSource() {
	    DriverManagerDataSource dataSource = new DriverManagerDataSource();
	    dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
	    dataSource.setUrl("jdbc:mysql://localhost:3306/hr");
	    dataSource.setUsername("root");
	    dataSource.setPassword("7019974193");
	    return dataSource;
	  }
	 
	 private Properties hibernateProperties() {
		    
		    Properties properties = new Properties();
		    properties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
		    properties.setProperty("hibernate.hbm2ddl.auto", "create");
		    properties.setProperty("show_sql", "true");
		    properties.setProperty("format_sql", "true");
		    return properties;
		  }
	
}
