package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;


@SpringBootApplication
public class DiplomaProjectsManagementAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiplomaProjectsManagementAppApplication.class, args);
	}

}
