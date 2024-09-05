package com.example.exercicioslista.listaprincipal.lista3;

import java.util.Scanner;

public class Exercicio2L3{

    public static void resolucao3(){

        //Código de resolução: Exercicio2L3.resolucao3();

        Scanner leia = new Scanner(System.in);

        int n;

        System.out.print("Escreva um número: ");
        n = leia.nextInt();

        System.out.println("A tabuada de " + n + " é:"); 
        
        for (int tabuada = 1; tabuada <= 10; tabuada++) {
            System.out.println(n + " x " + tabuada + " = " + (n * tabuada));
        }

        leia.close();
    }
}
