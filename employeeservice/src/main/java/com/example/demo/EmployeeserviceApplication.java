package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EmployeeserviceApplication {

	public static void main(String[] args) {
		System.out.println("From Employee service...");
		SpringApplication.run(EmployeeserviceApplication.class, args);
	}
}
