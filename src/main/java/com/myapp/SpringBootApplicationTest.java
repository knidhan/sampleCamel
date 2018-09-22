package com.myapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath:contexts/SamplecamelContext.xml"})
public class SpringBootApplicationTest extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootApplicationTest.class, args);
		System.out.println("hello");

	}

}
