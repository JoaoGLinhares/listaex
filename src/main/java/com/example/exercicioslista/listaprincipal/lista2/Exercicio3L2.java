package com.example.exercicioslista.listaprincipal.lista2;

import java.util.Scanner;

public class Exercicio3L2 {

    public static void resolucao2() {
        Scanner leia = new Scanner(System.in);

        int idade;
        String deficiente, gestante;

        System.out.print("Qual a sua idade? ");
        idade = leia.nextInt();

        System.out.print("Possui alguma condição especial? (sim/não): ");
        deficiente = leia.next();

        System.out.print("Você está grávida? (sim/não): ");
        gestante = leia.next();


        if (idade > 65 || deficiente.equals("sim") || gestante.equals("sim")) {
            System.out.println("fila preferencial devido a idade ou condição especial!");
        } else {
            System.out.println("fila normal!");
        }

        leia.close();
    }
}
