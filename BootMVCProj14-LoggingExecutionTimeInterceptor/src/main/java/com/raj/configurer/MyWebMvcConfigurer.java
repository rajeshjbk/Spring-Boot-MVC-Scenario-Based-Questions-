package com.raj.configurer;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.raj.interceptor.AuthInterceptor;
import com.raj.interceptor.LoggingInterceptor;

@Configuration
public class MyWebMvcConfigurer implements WebMvcConfigurer{

	 @Override
	    public void addInterceptors(InterceptorRegistry registry) {

	        // Authentication interceptor
	        registry.addInterceptor(new AuthInterceptor())
	                .addPathPatterns("/dashboard")
	                .excludePathPatterns("/login");

	        // Logging interceptor (apply everywhere)
	        registry.addInterceptor(new LoggingInterceptor())
	                .addPathPatterns("/**");
	    }
}
