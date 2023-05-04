package com.tenpo.fee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class FeeApplication {
	public static void main(String[] args) {
		SpringApplication.run(FeeApplication.class, args);
	}
}
