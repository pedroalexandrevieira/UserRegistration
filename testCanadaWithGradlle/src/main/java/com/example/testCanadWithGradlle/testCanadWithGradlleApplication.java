package com.example.testCanadWithGradlle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
@ComponentScan(basePackages =
		{"com.example.testCanadWithGradlle.config", "com.example.testCanadWithGradlle.repository"})
public class testCanadWithGradlleApplication {

	public static void main(String[] args) {
		SpringApplication.run(testCanadWithGradlleApplication.class, args);
	}
}