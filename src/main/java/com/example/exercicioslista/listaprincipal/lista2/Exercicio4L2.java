package com.example.exercicioslista.listaprincipal.lista2;

import java.util.Scanner;

public class Exercicio4L2 {

    public static void resolucao2() {
        Scanner leia = new Scanner(System.in);

        int idade;

        System.out.print("Digite a sua idade: ");
        idade = leia.nextInt();

        if (idade < 16) {
            System.out.println("Você não pode entrar no evento.");
        } else if (idade >= 16 && idade < 18) {
            System.out.println("Você só pode entrar no evento acompanhado pelos responsáveis.");
        } else {
            System.out.println("Pode entrar no evento.");
        }

        leia.close();
    }
}
