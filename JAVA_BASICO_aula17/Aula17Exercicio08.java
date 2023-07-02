package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Aula17Exercicio08 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("### Lê 5 números inteiros e informa a soma e a média ###");

        int numero1 = 0;
        int numero2 = 0;
        int numero3 = 0;
        int numero4 = 0;
        int numero5 = 0;

        for (int contador = 0; contador <= 4; contador++) {
            if (contador == 0) {
                System.out.println("Digite o 1º número inteiro: ");
                numero1 = scan.nextInt();
            } else if (contador == 1) {
                System.out.println("Digite o 2º número inteiro: ");
                numero2 = scan.nextInt();
            } else if (contador == 2) {
                System.out.println("Digite o 3º número inteiro: ");
                numero3 = scan.nextInt();
            } else if (contador == 3) {
                System.out.println("Digite o 4º número inteiro: ");
                numero4 = scan.nextInt();
            } else {
                System.out.println("Digite o 5º número inteiro: ");
                numero5 = scan.nextInt();
            }
        }

        int somaDosNumeros = numero1 + numero2 + numero3 + numero4 + numero5;
        System.out.println("\nSoma dos números digitados: " + somaDosNumeros);

        int mediaDosNumeros = somaDosNumeros / 5;
        System.out.println("\nMédia dos números digitados: " + mediaDosNumeros);

    }
}
