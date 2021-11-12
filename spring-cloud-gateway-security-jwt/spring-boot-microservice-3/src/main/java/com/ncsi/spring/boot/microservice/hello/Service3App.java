package com.ncsi.spring.boot.microservice.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Service3App {

	public static void main(String[] args) {
		SpringApplication.run(Service3App.class, args);
	}

	@GetMapping("/service3/{name}")
	public ResponseEntity<String> greetUser(@PathVariable String name) {
		return new ResponseEntity<String>("Hello, " + name, HttpStatus.OK);
	}

}