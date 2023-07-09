package com.loiane.cursojava.aula19;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Aula19Exercicio16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int numero = 0;
        int somaNumerosMenoresQue15 = 0;
        int somaNumero15 = 0;
        double mediaNumerosMaioresQue15 = 0;
        int contadorMaiorQue15 = 0;
        double calculoDaMedia = 0;

        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numero = scan.nextInt();
            if (numero < 15) {
                somaNumerosMenoresQue15 += numero;
            } else if (numero == 15) {
                somaNumero15++;
            } else {
                mediaNumerosMaioresQue15 += numero;
                contadorMaiorQue15++;
            }
            System.out.println();
        }

        calculoDaMedia = mediaNumerosMaioresQue15 / contadorMaiorQue15;
        DecimalFormat calculoDaMediaFormatado = new DecimalFormat("#.##");

        System.out.println("- - - - - - - - - - - - - - - - - - - -");
        System.out.println("Soma de elementos inferiores a 15: " + somaNumerosMenoresQue15);
        System.out.println("Quantidade de elementos iguais a 15: " + somaNumero15);
        System.out.println("Média dos elementos superiores a 15: " + calculoDaMediaFormatado.format(calculoDaMedia));
        System.out.println("- - - - - - - - - - - - - - - - - - - -");

    }
}
