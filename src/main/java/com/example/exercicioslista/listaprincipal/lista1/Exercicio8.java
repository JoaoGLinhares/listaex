package com.example.exercicioslista.listaprincipal.lista1;

import java.util.Scanner;

public class Exercicio8 {
    public static void resolucao() {

        Scanner leia = new Scanner(System.in);

        double celsius;
        double fahrenheit;

        System.out.println("Leia os fahrenheit: ");
        fahrenheit = leia.nextDouble();

        celsius = ((fahrenheit - 32)/1.8);

        System.out.printf("Celsius: %.2f", celsius);
        
        leia.close();
    }
}