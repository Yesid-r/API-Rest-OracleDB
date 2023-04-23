package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class TestParcialApiOracleApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestParcialApiOracleApplication.class, args);
	}
	@GetMapping("/test")
	public String test() {
		return "Prueba servicio GET";
	}

}
