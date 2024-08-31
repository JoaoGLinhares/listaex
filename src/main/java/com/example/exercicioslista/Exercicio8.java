package com.example.exercicioslista;

import java.util.Scanner;

public class Exercicio8 {
    public static void resolucao() {

        Scanner sc = new Scanner(System.in);

        double celsius;
        double fahrenheit;

        System.out.println("Leia os fahrenheit: ");
        fahrenheit = sc.nextDouble();

        celsius = ((fahrenheit - 32)/1.8);

        System.out.printf("Celsius: %.2f", celsius);
        
        sc.close();
    }
}