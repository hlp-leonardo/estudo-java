package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Aula17Exercicio02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("### Lê nome e senha de usuário ###");

        //com For
        System.out.print("\nDigite o nome de usuário For: ");
        String nomeDeUsuarioFor = scan.nextLine();

        System.out.print("\nDigite a senha de usuário For: ");
        String senhaDeUsuarioFor = scan.nextLine();
        for (; nomeDeUsuarioFor.equalsIgnoreCase(senhaDeUsuarioFor); ) {
            System.out.println("\nSenha inválida. A senha não pode ser igual ao nome de usuário.");
            System.out.print("Digite a senha de usuário For: ");
            senhaDeUsuarioFor = scan.nextLine();
        }

        System.out.print("\nNome de usuário For escolhido: " + nomeDeUsuarioFor);
        System.out.print("\nSenha de usuário For escolhida: " + senhaDeUsuarioFor);

        System.out.println("\n - - - - - - - - - - - - - - - - - - - - - - - - -");

        // com While
        System.out.print("Digite o nome de usuário While: ");
        String nomeDeUsuarioWhile = scan.nextLine();

        System.out.print("\nDigite a senha de usuário While: ");
        String senhaDeUsuarioWhile = scan.nextLine();
        while (nomeDeUsuarioWhile.equalsIgnoreCase(senhaDeUsuarioWhile)) {
            System.out.println("\nSenha inválida. A senha não pode ser igual ao nome de usuário.");
            System.out.print("Digite a senha de usuário While: ");
            senhaDeUsuarioWhile = scan.nextLine();
        }

        System.out.print("\nNome de usuário While escolhido: " + nomeDeUsuarioWhile);
        System.out.print("\nSenha de usuário While escolhida: " + senhaDeUsuarioWhile);

        System.out.println("\n - - - - - - - - - - - - - - - - - - - - - - - - -");

        //com Do While
        System.out.print("Digite o nome de usuário Do While: ");
        String nomeDeUsuarioDoWhile = scan.nextLine();

        System.out.print("\nDigite a senha de usuário Do While: ");
        String senhaDeUsuarioDoWhile = scan.nextLine();
        if (nomeDeUsuarioDoWhile.equalsIgnoreCase(senhaDeUsuarioDoWhile)) {
            do {
                System.out.println("\nSenha inválida. A senha não pode ser igual ao nome de usuário.");
                System.out.print("Digite a senha de usuário Do While: ");
                senhaDeUsuarioDoWhile = scan.nextLine();
            } while (nomeDeUsuarioDoWhile.equalsIgnoreCase(senhaDeUsuarioDoWhile));
        }
        System.out.print("\nNome de usuário Do While escolhido: " + nomeDeUsuarioDoWhile);
        System.out.print("\nSenha de usuário Do While escolhida: " + senhaDeUsuarioDoWhile);

    }
}
