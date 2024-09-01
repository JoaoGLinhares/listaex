package com.example.exercicioslista.listaprincipal.lista2;

import java.util.Scanner;

public class Exercicio5L2 {

    public static void resolucao2() {
        Scanner leia = new Scanner(System.in);

        String loginCorreto = "Joao";
        String senhaCorreta = "1234";
        String login;
        String senha;

        System.out.print("Digite seu login: ");
        login = leia.nextLine();

        System.out.print("Digite sua senha: ");
        senha = leia.nextLine();

        if (!login.equals(loginCorreto)) {
            System.out.println("Login incorreto.");
        } else if (!senha.equals(senhaCorreta)) {
            System.out.println("Senha incorreta.");
        } else {
            System.out.println("Login e senha corretos. Acesso permitido.");
        }

        leia.close();
    }

}
