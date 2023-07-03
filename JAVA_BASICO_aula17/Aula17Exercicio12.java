package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Aula17Exercicio12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("### Lê um número e mostra sua tabuada ###");

        String continuar = "S";

        while (continuar.equals("S")) {
            System.out.print("\nDigite um número para ver sua tabuada: ");
            int numero = scan.nextInt();
            int contador = 1;

            do {
                int tabuada = numero * contador;
                System.out.println(numero + " x " + contador + " = " + tabuada);
                contador++;
            } while (contador <= 10);

            System.out.println(" - - - - - - - - - - - - - - - -");

            System.out.print("Deseja ver a tabuada de outro número? Digite (S) para confirmar ou (N) para sair: ");
            continuar = scan.next().toUpperCase();
            while (!continuar.equals("S") && !continuar.equals("N")) {
                System.out.println("\nResposta inválida.");
                System.out.print("Deseja ver a tabuada de outro número? Digite (S) para confirmar ou (N) para sair: ");
                continuar = scan.next().toUpperCase();
            }

        }

    }
}
