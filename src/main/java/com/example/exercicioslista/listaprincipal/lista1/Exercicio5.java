package com.example.exercicioslista.listaprincipal.lista1;

import java.util.Scanner;

public class Exercicio5 {
    public static void resolucao() {
       
        Scanner leia = new Scanner(System.in);
        double comprimento;
        double largura;
        double area;
        double precoMetroQuadrado;
        double preco;

        System.out.println("Escreva o comprimento: ");
        comprimento = leia.nextDouble();

        System.out.println("Escreva a largura: ");
        largura = leia.nextDouble();

        area = largura * comprimento;

        System.out.println("Escreva o preço por metro quadrado: ");
        precoMetroQuadrado = leia.nextDouble();

        preco = precoMetroQuadrado * area;
        System.out.println("O valor do terreno é: R$ " + preco);

        leia.close();

    }
}