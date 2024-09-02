package com.example.exercicioslista.listaprincipal.lista2;

import java.util.Scanner;

public class Exercicio2L2{

    public static void resolucao2(){

         //Código de resolução: Exercicio2L2.resolucao2();

        Scanner leia = new Scanner (System.in);

        double n1, n2;

        System.out.print("Digite um numero: ");
        n1 = leia.nextDouble();

        System.out.print("Digite outro numero: ");
        n2 = leia.nextDouble();

        if (n1>n2) {
            System.out.print("O numero "+ n1+ " é maior que "+ n2);

        }if (n2<n1) {
            System.out.print("O numero "+ n2+ " é maior que "+ n1);

        }else {
            System.out.print("Os numeros são iguais");
            

        }

            leia.close();


    }
}
