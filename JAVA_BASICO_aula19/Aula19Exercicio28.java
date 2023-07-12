package JavaBasico;

import java.util.Scanner;

public class Aula19Exercicio28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[5];
        int[] vetorB = new int[5];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º valor: ");
            vetorA[i] = scan.nextInt();
            vetorB[vetorA.length - i - 1] = vetorA[i];
        }

        System.out.print("Números do vetor A invertidos: ");
        for (int resultado : vetorB) {
            System.out.print(" " + resultado);
        }
    }
}
