package com.example.exercicioslista.listaprincipal.lista4;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio5L4 {

    public static void resolucao4() {

         //Código de resolução: Exercicio5L4.resolucao4();

            try (Scanner leia = new Scanner(System.in)) {
            ArrayList<String> listaDeCompras = new ArrayList<>();
            
            int opcao;
            String item;

            while (true) {
                System.out.println("Menu:");
                System.out.println("1. Inserir item");
                System.out.println("2. Ver lista");
                System.out.println("3. Sair");
                System.out.print("Escolha uma opção: ");
                
                opcao = leia.nextInt();
                leia.nextLine();

                if (opcao == 1) {
                    System.out.print("Digite o nome do item: ");
                    item = leia.nextLine();
                    listaDeCompras.add(item);

                } else if (opcao == 2) {
                    System.out.println("Lista de compras:");

                    if (listaDeCompras.isEmpty()) {
                        System.out.println("A lista está vazia.");

                    } else {
                        for (String Itemlista : listaDeCompras){
                            System.out.println(Itemlista);
                        }
                    }

                } else if (opcao == 3) {
                    System.out.println("Programa encerrado!");
                    break;

                } else {
                    System.out.println("Opção inválida. Tente novamente.");
                }
            }
        }
    }
}
