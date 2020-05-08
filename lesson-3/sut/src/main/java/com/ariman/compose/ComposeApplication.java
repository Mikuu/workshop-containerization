package com.ariman.compose;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class ComposeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComposeApplication.class, args);
	}

}
