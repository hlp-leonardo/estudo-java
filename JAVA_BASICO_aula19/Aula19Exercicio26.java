package JavaBasico;

import java.util.Scanner;

public class Aula19Exercicio26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("### Compara os números de A com B e mostra o resultado (A>B=1 | A==B=0 | A<B=-1) ###");

        int[] vetorA = new int[5];
        int[] vetorB = new int[5];
        int[] vetorC = new int[5];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número A: ");
            vetorA[i] = scan.nextInt();
            System.out.print("Digite o " + (i + 1) + "º número B: ");
            vetorB[i] = scan.nextInt();
            if (vetorA[i] > vetorB[i]) {
                vetorC[i] = 1;
            } else if (vetorA[i] == vetorB[i]) {
                vetorC[i] = 0;
            } else {
                vetorC[i] = -1;
            }
        }

        System.out.println();

        int cont = 0;
        for (int resultado : vetorC) {
            System.out.println((cont + 1) + "º resultado: " + resultado);
            cont++;
        }
    }
}
