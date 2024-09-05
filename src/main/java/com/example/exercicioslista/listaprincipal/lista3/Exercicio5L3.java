package com.example.exercicioslista.listaprincipal.lista3;

import java.util.Scanner;
import java.io.Console;

public class Exercicio5L3{

        public static void resolucao3(){

        //Código de resolução: Exercicio5L3.resolucao3();


        Scanner leia = new Scanner(System.in);
        Console console = System.console();
        
        String cad_login, cad_senha;
        int chances = 3;

                System.out.println("Para realizar um cadastro preencha os campos a seguir.");
                System.out.print("Digite um usuário: ");
                cad_login = leia.nextLine();

                System.out.print("Digite uma senha: ");
                cad_senha = leia.nextLine();

                System.out.println("Cadastro realizado com sucesso!");

        boolean loginCorreto = false;

                System.out.println("\nInsira seus dados para realizar o login. ");

        while (!loginCorreto) {
        
        String login, senha;

                System.out.print("\nDigite o seu usuário: ");
                login = leia.nextLine();

                System.out.print("Digite sua senha: ");

        char [] senhaArray2 = console.readPassword();
        senha = new String(senhaArray2);

        if (cad_login.equals(login) && cad_senha.equals(senha)) {
                System.out.println("Login realizado com sucesso.");

                loginCorreto = true;

        }else if (!cad_login.equals(login) && chances != 0){
                System.out.println("O login informado não esta correto, tente novamente.");
                chances--;

        }else if (!cad_senha.equals(senha)&& chances != 0){    
                System.out.println("A senha informada não esta correta, tente novamente.");
                chances--;

        }if(chances ==1){
                System.out.println("Última tentativa, mais um erro seu acesso será bloqueado!");
                
        }if(chances == 0){   
                System.out.println("Seu acesso foi bloqueado.");
        break;
                        }

        
        }

        leia.close();
              }
       }