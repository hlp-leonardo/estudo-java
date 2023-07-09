package com.loiane.cursojava.aula19;

import java.util.Scanner;

public class Aula19Exercicio05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Digite o valor para a posição " + i + ": ");
            vetorA[i] = scan.nextInt();
            vetorB[i] = vetorA[i] * i;
        }

        System.out.print("Valores do vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + ", ");
        }

        System.out.println();
        System.out.print("Valores do vetor B: ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + ", ");
        }
    }
}
