package com.loiane.cursojava.aula19;

import java.util.Scanner;

public class Aula19Exercicio17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[5];
        int idade = 0;
        int qtdPessoasMaiores35 = 0;

        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Digite a idade da " + (i + 1) + "ª pessoa: ");
            idade = scan.nextInt();
            if (idade > 35) {
                qtdPessoasMaiores35++;
            }
        }

        if (qtdPessoasMaiores35 == 0) {
            System.out.println("\nDas idades digitadas, nenhuma pessoa tem mais de 35 anos.");
        } else if (qtdPessoasMaiores35 == 1) {
            System.out.println("\nDas idades digitadas, apenas uma pessoa tem mais de 35 anos.");
        } else {
            System.out.println("\nDas idades digitadas, " + qtdPessoasMaiores35 + " pessoas têm mais de 35 anos.");
        }

    }
}
