package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Aula17Exercicio01 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Loop utilizando While:
        int numeroWhile = 0;
        while (numeroWhile < 1 || numeroWhile > 10) {
            System.out.print("Digite um número inteiro entre 1 e 10: ");
            numeroWhile = scan.nextInt();
        } while (numeroWhile < 1 || numeroWhile > 10);

        System.out.println("\n(while) O número digitado foi: " + numeroWhile);
        System.out.println(" - - - - - - - - - - - - - - -\n");


        // Loop utilizando Do While:
        int numeroDoWhile = 0;
        do {
            System.out.print("Digite um número inteiro entre 11 e 20: ");
            numeroDoWhile = scan.nextInt();
        } while (numeroDoWhile < 11 || numeroDoWhile > 20);

        System.out.println("\n(do while) O número digitado foi: " + numeroDoWhile);
        System.out.println(" - - - - - - - - - - - - - - -");


        // Loop utilizando For:
        int numeroFor = 0;
        for (; numeroFor < 21 || numeroFor > 30; ) {
            System.out.print("Digite um número inteiro entre 21 e 30: ");
            numeroFor = scan.nextInt();
        }

        System.out.println("\n(for) O número digitado foi: " + numeroFor);
        System.out.println(" - - - - - - - - - - - - - - -");

    }
}
