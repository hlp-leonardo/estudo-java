package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Aula17Exercicio10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("### Lê 2 números inteiros, imprime todos os números inteiros entre eles e a soma desses números ###");

        System.out.print("\nDigite o 1º número inteiro: ");
        int numero1 = scan.nextInt();

        System.out.print("\nDigite o 2º número inteiro: ");
        int numero2 = scan.nextInt();

        int somaNumerosNoMeio = 0;

        System.out.println("\n - - - - - - - - - -");

        if (numero1 < numero2) {
            for (int calc = numero1 + 1; calc < numero2; calc++) {
                somaNumerosNoMeio += calc;
                System.out.println(calc);
            }
        } else {
            for (int calc = numero2 + 1; calc < numero1; calc++) {
                somaNumerosNoMeio += calc;
                System.out.println(calc);
            }
        }

        System.out.print("Soma dos numeros: " + somaNumerosNoMeio);

    }
}
