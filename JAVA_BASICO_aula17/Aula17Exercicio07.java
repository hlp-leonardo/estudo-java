package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Aula17Exercicio07 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("### Lê 5 números inteiros e informa qual é o maior ###");

        int numero = 0;
        int maiorNumero = 0;
        int cont = 0;

        do {
            System.out.println("Digite um número inteiro: ");
            numero = scan.nextInt();
            cont++;
            if (numero > maiorNumero) {
                maiorNumero = numero;
            }
        } while (cont <= 4);

        System.out.println("\nO maior número digitado foi: " + maiorNumero);

    }
}
