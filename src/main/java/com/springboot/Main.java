package com.springboot;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		System.out.println("Starting///");
		SpringApplication.run(Main.class, args);
		System.out.println("///Done");
	}

}
