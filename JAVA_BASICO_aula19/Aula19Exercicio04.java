package com.loiane.cursojava.aula19;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Aula19Exercicio04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        double[] vetorB = new double[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Digite o valor para a posição " + (i + 1) + ": ");
            vetorA[i] = scan.nextInt();
            vetorB[i] = Math.sqrt(vetorA[i]);
        }

        System.out.print("Valores do vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + ", ");
        }

        DecimalFormat formataValor = new DecimalFormat("#,###.###");
        System.out.println();
        System.out.print("Valores do vetor B: ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(formataValor.format(vetorB[i]) + "; ");
        }
    }
}
