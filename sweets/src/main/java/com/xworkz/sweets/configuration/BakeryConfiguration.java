package com.xworkz.sweets.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz.sweets")
public class BakeryConfiguration {
	public BakeryConfiguration() {
		System.out.println("Created the BakeryConfiguration....");
	}
	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver("/",".jsp");
		return internalResourceViewResolver;
	}
}
