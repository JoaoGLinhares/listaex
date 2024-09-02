package com.example.exercicioslista.listaprincipal.lista1;

import java.util.Scanner;

public class Exercicio3{

    public static void resolucao(){

        //Código de resolução: Exercicio3.resolucao();

        Scanner leia = new Scanner(System.in);
        

        double valorEmReal;
        double dolar = 5.25;

        System.out.print("Escreva o valor em real: ");
        valorEmReal = leia.nextDouble();

        System.out.printf("O valor em dólar é: $ %.2f",(dolar*valorEmReal));

        leia.close();
    }

        }