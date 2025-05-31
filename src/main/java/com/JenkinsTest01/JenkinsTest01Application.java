package com.JenkinsTest01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsTest01Application {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsTest01Application.class, args);
		System.out.println("jenkin Project CICD pipeline started");
	}

}
