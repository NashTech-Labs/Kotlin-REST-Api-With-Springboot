package com.knoldus.restAPI

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RestApiApplication

/**
 * The main class for running the REST API application.
 */
fun main(args: Array<String>) {

	/**
	 * The entry point of the application.
	 *
	 * @param args the command line arguments
	 */
	runApplication<RestApiApplication>(*args)
}
