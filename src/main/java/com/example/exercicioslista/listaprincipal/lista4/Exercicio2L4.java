package com.example.exercicioslista.listaprincipal.lista4;

public class Exercicio2L4{

    public static void resolucao4(){

        //Código de resolução: Exercicio2L4.resolucao4();

        double[] vendas = {100.0, 200.0, 50.0, 300.0, 150.0, 250.0};
        double menorValor = vendas[0];
        double maiorValor = vendas[0];
      
        for (int i = 1; i < vendas.length; i++) {
          if (vendas[i] < menorValor) {
            menorValor = vendas[i];
          } else if (vendas[i] > maiorValor) {
            maiorValor = vendas[i];
          }
        }
      
        System.out.println("O menor valor é: R$ " + menorValor);
        System.out.println("O maior valor é: R$ " + maiorValor);
      }

}
