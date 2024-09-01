package com.example.exercicioslista.listaprincipal.lista2;

import java.util.Scanner;

public class Exercicio1L2 {

    public static void resolucao2(){

        Scanner leia = new Scanner(System.in);

        int numero;

        System.out.print("Digite um número inteiro: ");
        numero = leia.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é par.");
        } else {
            System.out.println("O número " + numero + " é ímpar.");
        }

        leia.close();
    }
}

