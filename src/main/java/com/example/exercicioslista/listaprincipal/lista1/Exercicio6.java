package com.example.exercicioslista.listaprincipal.lista1;

import java.util.Scanner;

public class Exercicio6{

    public static void resolucao(){

        //Código de resolução: Exercicio6.resolucao();
       
        Scanner leia = new Scanner(System.in);
        int distanciaKM;
        int combustivelGasto;

        int consumoMedio;

        System.out.println("Digite a distância percorrida em KM: ");
        distanciaKM = leia.nextInt();

        System.out.println("Digite o total de combustivel gasto: ");
        combustivelGasto = leia.nextInt();

        consumoMedio = distanciaKM/combustivelGasto;

        System.out.println("O consumo médio do veiculo é: " + consumoMedio + " km/l");

        leia.close();

    }
}