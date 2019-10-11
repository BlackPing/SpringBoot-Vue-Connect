package com.blackping.BootExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@SpringBootApplication
public class Application {
//	@Bean
//	public CharacterEncodingFilter characterEncodingFilter() {
//	    final CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
//	    characterEncodingFilter.setEncoding("UTF-8");
//	    characterEncodingFilter.setForceEncoding(true);
//	    return characterEncodingFilter;
//	}
//	
	@Bean
	public ViewResolver getViewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/static/");
		resolver.setSuffix(".html");
		return resolver;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
