package com.example.exercicioslista.listaprincipal.lista2;

import java.util.Scanner;

public class Exercicio8L2{

    public static void resolucao2(){

         //Código de resolução: Exercicio8L2.resolucao2();

        Scanner leia = new Scanner(System.in);

        int acertos = 0;
        int erros = 0;
        int resposta;

        System.out.println("Qual é a soma de 2 + 2?");
        System.out.println("1) 3");
        System.out.println("2) 4");
        System.out.println("3) 5");
        System.out.println("4) 6");
        resposta = leia.nextInt();

        if (resposta == 4) {
            System.out.println("Correto!");
            acertos++;
        } else {
            System.out.println("Incorreto.");
            erros++;
        }

        if (erros >= 3) {
            System.out.println("Você perdeu o jogo.");
            leia.close();
            return;
        }

        System.out.println("Qual é a multiplicação de 3 x 3?");
        System.out.println("1) 6");
        System.out.println("2) 7");
        System.out.println("3) 8");
        System.out.println("4) 9");
        resposta = leia.nextInt();

        if (resposta == 9) {
            System.out.println("Correto!");
            acertos++;
        } else {
            System.out.println("Incorreto.");
            erros++;
        }

        if (erros >= 3) {
            System.out.println("Você perdeu o jogo.");
            leia.close();
            return;
        }

        System.out.println("Qual é a subtração de 10 - 4?");
        System.out.println("1) 5");
        System.out.println("2) 6");
        System.out.println("3) 7");
        System.out.println("4) 8");
        resposta = leia.nextInt();

        if (resposta == 6) {
            System.out.println("Correto!");
            acertos++;
        } else {
            System.out.println("Incorreto.");
            erros++;
        }

        if (erros >= 3) {
            System.out.println("Você perdeu o jogo.");
            leia.close();
            return;
        }

        System.out.println("Qual é a divisão de 12 / 3?");
        System.out.println("1) 3");
        System.out.println("2) 4");
        System.out.println("3) 5");
        System.out.println("4) 6");
        resposta = leia.nextInt();

        if (resposta == 4) {
            System.out.println("Correto!");
            acertos++;
        } else {
            System.out.println("Incorreto.");
            erros++;
        }

        if (erros >= 3) {
            System.out.println("Você perdeu o jogo.");
            leia.close();
            return;
        }

        System.out.println("Qual é o dobro de 5?");
        System.out.println("1) 8");
        System.out.println("2) 9");
        System.out.println("3) 10");
        System.out.println("4) 11");
        resposta = leia.nextInt();

        if (resposta == 10) {
            System.out.println("Correto!");
            acertos++;
        } else {
            System.out.println("Incorreto.");
            erros++;
        }

        if (erros < 3) {
            System.out.println("Você acertou " + acertos + " de 5 perguntas.");
        } else {
            System.out.println("Você perdeu o jogo.");
        }

        leia.close();
    }
}
