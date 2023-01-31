package com.xworkz.laser.configuration;

import java.util.Arrays;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringMVCinit 
extends AbstractAnnotationConfigDispatcherServletInitializer 
implements WebMvcConfigurer {
	public SpringMVCinit() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Running the getRootConfigClasses");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Created getServletConfigClasses");
		Class [] config = { SpringBeanConfiguration.class };
		System.out.println("getServletConfigClasses:-"+Arrays.toString(config));
		return config;
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("Running the getServletMappings");
		String [] string = {"/"};
		System.out.println("getServletMappings :-"+Arrays.toString(string));
		return string;
	}
	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		System.out.println("Running the configureDefaultServletHandling");
		WebMvcConfigurer.super.configureDefaultServletHandling(configurer);
	}

}
