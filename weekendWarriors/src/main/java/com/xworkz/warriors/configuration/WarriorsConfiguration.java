package com.xworkz.warriors.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.warriors")
public class WarriorsConfiguration {
	public WarriorsConfiguration() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

}
