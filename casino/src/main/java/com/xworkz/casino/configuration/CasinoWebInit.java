package com.xworkz.casino.configuration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class CasinoWebInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {
	public CasinoWebInit() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Running the getRootConfigClasses........");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Running the getServletConfigClasses........");
		Class[] config = { CasinoConfiguration.class };
		return config;
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("Running the getServletMappings........");
		return new String[] { "/" };
	}

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		System.out.println("Running the configureDefaultServletHandling........");
		configurer.enable();
	}

}
