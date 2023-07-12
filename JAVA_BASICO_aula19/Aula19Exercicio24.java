package JavaBasico;

import java.util.Scanner;

public class Aula19Exercicio24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[6];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número inteiro: ");
            vetorA[i] = scan.nextInt();
        }

        System.out.println();

        boolean palindromo = true;
        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] != vetorA[vetorA.length - 1 - i]) {
                palindromo = false;
                break;
            }
        }

        if (palindromo) {
            System.out.println("Os números digitados formam um palíndromo.");
        } else {
            System.out.println("Os números digitados não formam um palíndromo.");
        }
    }
}
