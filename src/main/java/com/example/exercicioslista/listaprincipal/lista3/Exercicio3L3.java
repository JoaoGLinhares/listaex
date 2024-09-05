package com.example.exercicioslista.listaprincipal.lista3;

import java.util.Scanner;

public class Exercicio3L3{

    public static void resolucao3(){

        //Código de resolução: Exercicio3L3.resolucao3();

        Scanner leia = new Scanner(System.in);

        int n1, n2, troca;

        System.out.println("Escreva um numero: ");
        n1 = leia.nextInt();

        System.out.println("Escreva outro numero: ");
        n2 = leia.nextInt();

        if (n1 > n2){
        troca = n1;
        n1 = n2;
        n2 = troca;
        }

        System.out.println("Números pares entre " + n1 + " e " + n2 + ":");

        for (int par = n1; par <= n2; par++){

            if (par % 2 == 0){
                System.out.println(par);
            }
        }

        leia.close();
    }
}