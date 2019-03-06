package com.cg.devops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DevopsApplication {

	public static void main(String[] args) {
		System.out.println("first docker file to create docker images");
		SpringApplication.run(DevopsApplication.class, args);
	}

}
