package com.example.res;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.example.res.obiekty")
public class RezerwationApplication {

	public static void main(String[] args) {
		SpringApplication.run(RezerwationApplication.class, args);
	}

}
