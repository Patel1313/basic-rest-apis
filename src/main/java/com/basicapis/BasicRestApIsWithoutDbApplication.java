package com.basicapis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static java.lang.System.*;

@SpringBootApplication
public class BasicRestApIsWithoutDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasicRestApIsWithoutDbApplication.class, args);
		out.println("Application is Running at: http://localhost:1312");
	}

}
