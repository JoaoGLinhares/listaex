package com.example.exercicioslista.listaprincipal.lista4;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio7L4 {

    public static void resolucao4() {

        // Código de resolução: Exercicio7L4.resolucao4();

            try (Scanner leia = new Scanner(System.in)) {
            ArrayList<String> listaDeCompras = new ArrayList<>();
            ArrayList<Double> listaDePrecos = new ArrayList<>();

            int opcao;
            String item;
            double preco;

            while (true) {
                System.out.println("Menu:");
                System.out.println("1. Inserir item");
                System.out.println("2. Ver lista");
                System.out.println("3. Remover item");
                System.out.println("4. Sair");
                System.out.print("Escolha uma opção: ");
                
                opcao = leia.nextInt();
                leia.nextLine();

                if (opcao == 1) {
                    System.out.print("Digite o nome do item: ");
                    item = leia.nextLine();
                    System.out.print("Digite o preço do item: ");
                    preco = leia.nextDouble();
                    leia.nextLine();
                    listaDeCompras.add(item);
                    listaDePrecos.add(preco);

                } else if (opcao == 2) {
                    System.out.println("Lista de compras:");

                    if (listaDeCompras.isEmpty()) {
                        System.out.println("A lista está vazia.");
                    } else {
                        for (int i = 0; i < listaDeCompras.size(); i++) {
                            System.out.println(listaDeCompras.get(i) + " - R$ " + listaDePrecos.get(i));
                        }
                    }

                } else if (opcao == 3) {
                    System.out.print("Digite o nome do item a ser removido: ");
                    item = leia.nextLine();

                    int index = listaDeCompras.indexOf(item);
                    if (index != -1) {
                        listaDeCompras.remove(index);
                        listaDePrecos.remove(index);
                        System.out.println("Item removido com sucesso.");
                    } else {
                        System.out.println("Item não encontrado.");
                    }

                } else if (opcao == 4) {
                    System.out.println("Programa encerrado!");
                    break;

                } else {
                    System.out.println("Opção inválida. Tente novamente.");
                }
            }
        }
    }
}
