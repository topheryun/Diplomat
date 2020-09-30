package com.sbuhack.mediatorapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = {
        org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class}
        )
public class MediatorappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MediatorappApplication.class, args);
	}

}
