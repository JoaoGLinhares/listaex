package com.example.exercicioslista.listaprincipal.lista2;

import java.util.Scanner;

public class Exercicio7L2{

    public static void resolucao2(){

         //Código de resolução: Exercicio7L2.resolucao2();

        Scanner leia = new Scanner(System.in);

        int n1,n2;

        System.out.print("Digite o número: ");
        n1 = leia.nextInt();

        System.out.print("Digite o número divisor: ");
        n2 = leia.nextInt();

        if (n2 != 0 && n1 % n2 == 0) {
            System.out.println("O número " + n1 + " é divisível por " + n2);
        }else {
            System.out.println("O número " + n1 + " não é divisível por " + n2);
        }

        leia.close();
    }
}
