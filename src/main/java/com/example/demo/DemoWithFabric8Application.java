package com.example.demo;

import java.util.function.Function;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoWithFabric8Application {

	public static void main(String[] args) {
		SpringApplication.run(DemoWithFabric8Application.class, args);
	}

    @Bean
    Function<String, String> toUpperCase() {
        return valus -> valus.toUpperCase();
    }
}
