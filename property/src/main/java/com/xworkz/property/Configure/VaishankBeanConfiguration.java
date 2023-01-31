package com.xworkz.property.Configure;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.property")
public class VaishankBeanConfiguration {
	public VaishankBeanConfiguration() {
		System.out.println("Created "+this.getClass().getSimpleName());
	}
}
