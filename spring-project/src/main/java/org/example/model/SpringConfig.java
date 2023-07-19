package org.example.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example.model")
public class SpringConfig {
     
	@Bean
	public Employee employee()
	{
		return new Employee(department());
	}
	
	@Bean
	public Department department()
	{
		return new Department(location());
	}
	
	@Bean
	public Location location()
	{
		return new Location();
		
	}
}
