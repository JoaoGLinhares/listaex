package com.example.exercicioslista.listaprincipal.lista4;

public class Exercicio3L4{

    public static void resolucao4(){

        //Código de resolução: Exercicio3L4.resolucao4();

        double[] vendas = {100.0, 200.0, 50.0, 300.0, 150.0, 250.0};
        double totalVendas = 0.0;

        for (double venda : vendas) {
          totalVendas += venda;
        }

        double ticketMedio = totalVendas / vendas.length;
      
        System.out.println("O ticket médio de vendas do dia é: R$ " + ticketMedio);
      }

}
