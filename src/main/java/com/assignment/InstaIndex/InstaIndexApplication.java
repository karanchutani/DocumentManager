package com.assignment.InstaIndex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class InstaIndexApplication {

	public static void main(String[] args) {
		SpringApplication.run(InstaIndexApplication.class, args);
	}

}
