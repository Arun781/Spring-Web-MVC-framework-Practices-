package com.xworkz.die.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz.die")
public class CarConfiguration {

public CarConfiguration() {
	System.out.println("Created "+this.getClass().getSimpleName());
}
@Bean
public ViewResolver viewResolver() {
	InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver("/",".jsp");
	return internalResourceViewResolver;
}
}
