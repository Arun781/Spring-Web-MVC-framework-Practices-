package com.xworkz.arun.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.arun")
public class BioConfiguration {
public BioConfiguration() {
	System.out.println("Created "+this.getClass().getSimpleName());
}
}
