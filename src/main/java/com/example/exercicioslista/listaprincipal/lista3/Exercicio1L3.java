package com.example.exercicioslista.listaprincipal.lista3;

import java.util.Scanner;

public class Exercicio1L3{

    public static void resolucao3(){

        //Código de resolução: Exercicio1L3.resolucao3();

        Scanner leia = new Scanner(System.in);
        int segundos = 0;

        while (true) {
            System.out.println("Escreva um número em segundos entre 1 e 59: ");
            segundos = leia.nextInt();  

            if (segundos >= 1 && segundos <= 59) {
                break;
            } else {
                System.out.println("Erro! O número deve estar entre 1 e 59.");
            }
        }

        System.out.println("Cronômetro iniciado:");
        
            for (int seg = segundos; seg > 0; seg--) {
                System.out.println(seg + " segundos restantes");
                
                try {
                Thread.sleep(1000);

        }catch (InterruptedException e) {
            System.out.println("O cronômetro foi interrompido.");
        }

    }

        System.out.println("Tempo esgotado!");

        leia.close();
    }

}
