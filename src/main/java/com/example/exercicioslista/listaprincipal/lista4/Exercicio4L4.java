package com.example.exercicioslista.listaprincipal.lista4;

public class Exercicio4L4{

    public static void resolucao4() {

        //Código de resolução: Exercicio4L4.resolucao4();

        int[] lista = {3, 5, 6, 7, 8, 10, 22, 55, 110};
        int quantidadePares = 0;

        for (int numero : lista) {
          if (numero % 2 == 0) {
            quantidadePares++;
          }
        }

        System.out.println("A quantidade de números pares na lista é: " + quantidadePares);
    }

}
