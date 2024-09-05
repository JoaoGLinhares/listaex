package com.example.exercicioslista.listaprincipal.lista3;

import java.util.Scanner;

public class Exercicio7L3{

        public static void resolucao3(){

            //Código de resolução: Exercicio7L3.resolucao3();

            Scanner leia = new Scanner(System.in);
    
            int largura;
            int altura;
    
            System.out.println("Altura: ");
            altura = leia.nextInt();
    
            System.out.println("Largura: ");
            largura = leia.nextInt();
    
            for (int j = 0; j < altura; j++) {
                for (int i = 0; i < largura; i++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            leia.close();
        }
    
    }