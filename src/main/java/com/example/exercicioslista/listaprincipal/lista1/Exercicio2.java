package com.example.exercicioslista.listaprincipal.lista1;

import java.util.Scanner;

public class Exercicio2 {

    public static void resolucao() {
      
        Scanner leia = new Scanner(System.in);
        
        System.out.print("Digite seu nome: ");
        String nome = leia.nextLine();

        System.out.print("Digite seu sobrenome: ");
        String sobrenome = leia.nextLine();
       
        System.out.println("Olá, " + nome + " " + sobrenome + "!");

        leia.close();
    }
}
