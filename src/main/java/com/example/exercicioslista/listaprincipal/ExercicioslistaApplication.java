package com.example.exercicioslista.listaprincipal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.exercicioslista.listaprincipal.lista1.Exercicio1;
import com.example.exercicioslista.listaprincipal.lista1.Exercicio8;

@SpringBootApplication
public class ExercicioslistaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExercicioslistaApplication.class, args);

		Exercicio1.resolucao();
	}

}