package com.example.exercicioslista;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExercicioslistaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExercicioslistaApplication.class, args);

		Exercicio2.resolucao();
	}

}