package com.example.exercicioslista.listaprincipal.lista1;

import java.util.Scanner;

public class Exercicio1{
    
    public static void resolucao(){

        //Código de resolução: Exercicio1.resolucao();

        Scanner leia = new Scanner(System.in);

        int n1;
        int n2;

        System.out.println("Digite o primeiro numero: ");
        n1 = leia.nextInt();
        System.out.println("Digite o segundo numero: ");
        n2 = leia.nextInt();

        System.out.println("O resultado da soma é: " + (n1+n2));

        leia.close();

    }
}
