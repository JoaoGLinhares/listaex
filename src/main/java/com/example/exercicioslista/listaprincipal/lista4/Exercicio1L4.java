package com.example.exercicioslista.listaprincipal.lista4;

public class Exercicio1L4{

    public static void resolucao4(){

    //Código de resolução: Exercicio1L4.resolucao4();

    double[] vendas = {100.0, 200.0, 50.0, 300.0, 150.0, 250.0};
    double totalVendas = 0.0;

    for (double venda : vendas) {
      totalVendas += venda;
    }
    System.out.println("O total de vendas do dia é: R$ " + totalVendas);

    }

}