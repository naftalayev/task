package com.spring.task;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.spring.task")
public class IdozApplication {

	public static void main(String[] args) {
		SpringApplication.run(IdozApplication.class, args);
	
	}

	
}
