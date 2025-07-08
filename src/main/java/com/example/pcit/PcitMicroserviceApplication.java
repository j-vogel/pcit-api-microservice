package com.example.pcit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The main entry point for the Spring Boot application.
 * The @SpringBootApplication annotation enables auto-configuration,
 * component scanning, and other key Spring Boot features.
 */
@SpringBootApplication
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
