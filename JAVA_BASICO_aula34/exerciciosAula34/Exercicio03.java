package com.loiane.cursojava.aula34.exerciciosAula34;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numFatorial;
        System.out.print("Digite um número para ver seu fatorial: ");
        numFatorial = Calculadora.fatorial(scan.nextInt());

        System.out.println();

    }
}
