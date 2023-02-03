package com.xworkz.casino.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.casino")
public class CasinoConfiguration {
public CasinoConfiguration() {
	System.out.println("Created "+this.getClass().getSimpleName());
}
}
