package com.example.exercicioslista.listaprincipal.lista3;

import java.util.Scanner;

public class Exercicio6L3{

    public static void resolucao3()throws InterruptedException{

        //Código de resolução: Exercicio6L3.resolucao3();
        
    Scanner leia = new Scanner(System.in);

    int andar;

    System.out.print("Digite o número de andares: ");
    andar = leia.nextInt();
    
        
    for (int i = 1; i <= andar; i++) {

        for (int a = 0; a < andar - i; a++) {
            System.out.print(" ");
        }

        for (int b = 0; b < (2 * i - 1); b++) {
            System.out.print("*");
        }

        System.out.println();

        leia.close();
    
        }
    }
}

   