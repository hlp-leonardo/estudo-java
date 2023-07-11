package com.loiane.cursojava.aula19;

public class Aula19Exercicio22 {
    public static void main(String[] args) {

        int[] vetorA = new int[10];
        int qtdZero = 0, qtdUm = 0;

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = (int)Math.round(Math.random() * 1);
            if (vetorA[i] == 0) {
                qtdZero++;
            } else {
                qtdUm++;
            }
        }

        System.out.println("Números zeros e uns gerados aleatóriamente:");
        for (int i : vetorA) {
            System.out.print(i + ", ");
        }

        System.out.println();
        System.out.println("O cógido gerou o número 'zero' " + qtdZero + " vezes e o número 'um' " + qtdUm + " vezes.");

    }
}
