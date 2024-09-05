package com.example.exercicioslista.listaprincipal.lista3;

import java.util.Scanner;
import java.io.Console;

public class Exercicio4L3{

    public static void resolucao3(){

        //Código de resolução: Exercicio4L3.resolucao3();


        int numeroPalpite;
        String cad_numero; 

        Scanner leia = new Scanner(System.in);
        Console console = System.console();

        System.out.println("Digite um número: ");
        
        char [] numeroArray2 = console.readPassword();
        cad_numero = new String(numeroArray2);
        int numero = Integer.parseInt(cad_numero);

        do{
            System.out.println("Tente adivinhar o número digitado: ");
            numeroPalpite = leia.nextInt();

            if (numeroPalpite == numero) {
                System.out.println("Parabéns! Você acertou.");
                

            } else if (numeroPalpite == (numero - 1) || numeroPalpite == (numero + 1) ){
                System.out.println("Está quente!");

            } else {
                System.out.println("Tá frio!");
            }

        }while(numeroPalpite != numero);

        leia.close();      

    }
}