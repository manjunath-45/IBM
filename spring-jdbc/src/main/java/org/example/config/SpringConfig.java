package org.example.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages ="org.example.model")
public class SpringConfig {
    
	@Bean
	public  DataSource dataSource()
	{
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
        
		dataSource.setUrl("jdbc:mysql://localhost:3306/hr");
		dataSource.setUsername("root");
		dataSource.setPassword("7019974193");
		return dataSource;
	
	}
}
