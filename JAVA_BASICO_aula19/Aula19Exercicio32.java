package com.loiane.cursojava.aula19;

import java.util.Scanner;

public class Aula19Exercicio32 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numerosParaTabuada = new int[3];
        int calculoTabuada = 0;

        for (int i = 0; i < numerosParaTabuada.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numerosParaTabuada[i] = scan.nextInt();
        }

        System.out.println();

        for (int iTabuada = 0; iTabuada < numerosParaTabuada.length; iTabuada++) {
            System.out.print("Tabuada de " + numerosParaTabuada[iTabuada] + ": \n");

            for (int contadorTabuada = 1; contadorTabuada <= 10; contadorTabuada++) {
                calculoTabuada = numerosParaTabuada[iTabuada] * (contadorTabuada);
                System.out.println(numerosParaTabuada[iTabuada] + " x " + (contadorTabuada) + " = " + calculoTabuada);
            }

            System.out.println("- - - - - - -");

        }

    }
}
