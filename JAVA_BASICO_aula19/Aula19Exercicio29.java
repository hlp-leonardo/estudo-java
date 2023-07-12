package JavaBasico;

import java.util.Scanner;

public class Aula19Exercicio29 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[3];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length * 2];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número de A: ");
            vetorA[i] = scan.nextInt();
            vetorC[i] = vetorA[i];

            System.out.print("Digite o " + (i + 1) + "º número de B: ");
            vetorB[i] = scan.nextInt();
            vetorC[vetorA.length + i] = vetorB[i];
        }

        System.out.print("Vetor A: ");
        for (int resultado : vetorA) {
            System.out.print(resultado + " ");
        }
        System.out.print("\nVetor B: ");
        for (int resultado : vetorB) {
            System.out.print(resultado + " ");
        }
        System.out.print("\nVetor C (A+B): ");
        for (int resultado : vetorC) {
            System.out.print(resultado + " ");
        }

        // outra forma, separando o loop de A e B para manter a ordem dos números digitados

        System.out.println("\n");

        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número de A: ");
            vetorA[i] = scan.nextInt();
            vetorC[i] = vetorA[i];
        }
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número de B: ");
            vetorB[i] = scan.nextInt();
            vetorC[vetorA.length + i] = vetorB[i];
        }

        System.out.print("Vetor A: ");
        for (int resultado : vetorA) {
            System.out.print(resultado + " ");
        }
        System.out.print("\nVetor B: ");
        for (int resultado : vetorB) {
            System.out.print(resultado + " ");
        }
        System.out.print("\nVetor C (A+B): ");
        for (int resultado : vetorC) {
            System.out.print(resultado + " ");
        }

    }
}
