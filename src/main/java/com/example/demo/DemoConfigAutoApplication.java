package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DemoConfigAutoApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(com.example.demo.SgtPeppers.class);
		SgtPeppers pepper = context.getBean(SgtPeppers.class);
		pepper.play();
		
		context.close();
	}
}
