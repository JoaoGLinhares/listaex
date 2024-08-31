package com.example.exercicioslista;

import java.util.Scanner;

public class Exercicio4 {
    public static void resolucao(){
        Scanner leia = new Scanner(System.in);

        int num1;

        System.out.println("Escreva o número: ");
        num1 = leia.nextInt();

        System.out.println("Seu sucessor é: "+(num1 + 1));
        System.out.println("Seu antecessor é: "+(num1 - 1));

    }

}