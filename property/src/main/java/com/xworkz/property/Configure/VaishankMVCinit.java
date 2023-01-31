package com.xworkz.property.Configure;

import java.util.Arrays;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class VaishankMVCinit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {
	public VaishankMVCinit() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("running the getRootConfigClasses");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Running the getServletConfigClasses");
		Class[] servletConfigClasses = { VaishankBeanConfiguration.class };
		System.out.println("getServletConfigClasses" + Arrays.toString(servletConfigClasses));
		return servletConfigClasses;
	}

	@Override
	protected String[] getServletMappings() {
		String[] string = { "/" };
		System.out.println("getServletMappings" + Arrays.toString(string));
		return string;
	}

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		System.out.println("Running the configureDefaultServletHandling");
		WebMvcConfigurer.super.configureDefaultServletHandling(configurer);
	}

}
