package com.example.exercicioslista.listaprincipal.lista4;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio8L4 {

    public static void resolucao4() {

        // Código de resolução: Exercicio8L4.resolucao4();

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
                System.out.println("4. Ver lista por preço: ");
                System.out.println("5. Sair");
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
                    if (listaDeCompras.isEmpty()) {
                        System.out.println("A lista está vazia.");
                    } else {
                        
                        for (int i = 0; i < listaDePrecos.size() - 1; i++) {
                            for (int j = i + 1; j < listaDePrecos.size(); j++) {
                                if (listaDePrecos.get(i) > listaDePrecos.get(j)) {
                                    
                                    double tempPreco = listaDePrecos.get(i);
                                    listaDePrecos.set(i, listaDePrecos.get(j));
                                    listaDePrecos.set(j, tempPreco);

                                    
                                    String tempItem = listaDeCompras.get(i);
                                    listaDeCompras.set(i, listaDeCompras.get(j));
                                    listaDeCompras.set(j, tempItem);
                                }
                            }
                        }

                        
                        System.out.println("Lista de compras por preço:");
                        for (int i = 0; i < listaDeCompras.size(); i++) {
                            System.out.println(listaDeCompras.get(i) + " - R$ " + listaDePrecos.get(i));
                        }
                    }

                } else if (opcao == 5) {
                    System.out.println("Programa encerrado!");
                    break;

                } else {
                    System.out.println("Opção inválida. Tente novamente.");
                }
            }
        }
    }
}
