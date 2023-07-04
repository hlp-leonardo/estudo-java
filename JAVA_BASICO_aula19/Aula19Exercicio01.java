package com.loiane.cursojava.aula19;

public class Aula19Exercicio01 {
    public static void main(String[] args) {

        int[] vetorA = new int[5];

        vetorA[0] = 10;
        vetorA[1] = 20;
        vetorA[2] = 30;
        vetorA[3] = 40;
        vetorA[4] = 50;

        int[] vetorB = new int[5];

        vetorB[0] = vetorA[0];
        vetorB[1] = vetorA[1];
        vetorB[2] = vetorA[2];
        vetorB[3] = vetorA[3];
        vetorB[4] = vetorA[4];

        for (int contador : vetorB) {
            System.out.println(contador);
        }

    }
}
