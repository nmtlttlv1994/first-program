package com.learning.firstprogram;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class FirstProgramApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstProgramApplication.class, args);
		
	}
	public String welcome(){
		return "Welcome dude!!";
	}
}
