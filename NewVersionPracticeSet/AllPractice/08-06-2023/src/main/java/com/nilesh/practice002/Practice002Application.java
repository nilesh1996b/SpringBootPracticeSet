package com.nilesh.practice002;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.nilesh.util", "com.nilesh.practice002"})
public class Practice002Application {

	public static void main(String[] args) {
		SpringApplication.run(Practice002Application.class, args);
	}

}
