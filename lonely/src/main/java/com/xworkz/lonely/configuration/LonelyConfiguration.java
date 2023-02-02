package com.xworkz.lonely.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.lonely")
public class LonelyConfiguration {
	public LonelyConfiguration() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
}
