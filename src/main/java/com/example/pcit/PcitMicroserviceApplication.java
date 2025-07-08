package com.example.pcit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * The main entry point for the Spring Boot application.
 */
// We are explicitly telling Spring to scan all sub-packages of "com.example.pcit"
// This ensures it finds the Controller, Service, and Config classes.
// The package name has been corrected for standard practice.
@SpringBootApplication
@ComponentScan(basePackages = "com.example.pcit")
public class PcitMicroserviceApplication {

	/**
	 * The main method which uses Spring Boot's SpringApplication.run() method
	 * to launch the application.
	 * @param args Command line arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(PcitMicroserviceApplication.class, args);
	}

}
