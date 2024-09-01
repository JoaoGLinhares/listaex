package com.example.exercicioslista.listaprincipal.lista2;

import java.util.Scanner;

public class Exercicio6L2 {
    
    public static void resolucao2() {

         Scanner leia = new Scanner(System.in);

         String nome;
         double n1, n2, media;
         double notaBaixa, recuperacao, mediaRecuperacao;

         System.out.println("Nome do aluno: ");
         nome = leia.nextLine();

         System.out.println("Nota 1: ");
         n1 = leia.nextDouble();

         System.out.println("Nota 2: ");
         n2 = leia.nextDouble();

         media = (n1+n2)/2;
         if(media >= 6){
            System.out.println("Aprovado!");
         }
         else{
            System.out.println("Recuperação!");
            notaBaixa = (n1<n2)? n1:n2;

            System.out.println("Insira a nota da recuperação: ");
            recuperacao = leia.nextDouble();
            
            mediaRecuperacao = (recuperacao + Math.max(n1,n2)/2);
            if(mediaRecuperacao>=6){
                System.out.println("Aprovado!");
            }
            else{
                System.out.println("Reprovado!");
            }
         }

    leia.close();
    }     

}
