package com.loiane.cursojava.aula19;

import java.util.Scanner;

public class Aula19Exercicio30 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length];
        int contB = 0, contC = 0;

        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            vetorA[i] = scan.nextInt();
            if (vetorA[i] % 2 == 0) {
                vetorB[contB] = vetorA[i];
                contB++;
            } else {
                vetorC[contC] = vetorA[i];
                contC++;
            }
        }

        System.out.print("Vetor A: ");
        for (int resultado : vetorA) {
            System.out.print(resultado + " ");
        }
        System.out.print("\nVetor B (pares): ");
        for (int resultado : vetorB) {
            System.out.print(resultado + " ");
        }
        System.out.print("\nVetor C (impares): ");
        for (int resultado : vetorC) {
            System.out.print(resultado + " ");
        }

    }
}
