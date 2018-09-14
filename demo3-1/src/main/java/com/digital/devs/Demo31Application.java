package com.digital.devs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class Demo31Application extends SpringBootServletInitializer{
	
	public static void main(String[] args) {
		SpringApplication.run(Demo31Application.class, args);
	}
	 @Override
	    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	        return application.sources(Demo31Application.class);
	    }

}
