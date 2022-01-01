package com.smari.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * This example demonstrate JPA unidirectional relationship between two entities, This does not cover unit testing and Exception handling.
 * The REST endpoints are developed for the CRUD operations.
 * @author smari
 */
@SpringBootApplication
public class JpaOnetooneUnidirectionalApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaOnetooneUnidirectionalApplication.class, args);
	}

}
