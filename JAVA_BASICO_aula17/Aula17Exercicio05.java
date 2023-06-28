package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Aula17Exercicio05 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("### Comparação de crescimento da população ###");

        int inicioPrograma = 1;

        do {
            System.out.print("\nInforme a população atual do primeiro país: ");
            double populacaoPrimeiroPais = scan.nextDouble();
            System.out.print("\nInforme a taxa de crescimento anual do primeiro país: ");
            double taxaCrescimentoPrimeiroPais = scan.nextDouble();

            System.out.print("\nInforme a população atual do segundo país: ");
            double populacaoSegundoPais = scan.nextDouble();
            System.out.print("\nInforme a taxa de crescimento anual do segundo país: ");
            double taxaCrescimentoSegundoPais = scan.nextDouble();

            int qtdAnos = 0;
            if (populacaoPrimeiroPais < populacaoSegundoPais) {
                for (qtdAnos = 0; populacaoPrimeiroPais < populacaoSegundoPais; qtdAnos++) {
                    populacaoPrimeiroPais += (populacaoPrimeiroPais * taxaCrescimentoPrimeiroPais) / 100;
                    populacaoSegundoPais += (populacaoSegundoPais * taxaCrescimentoSegundoPais) / 100;
                }
            } else {
                for (qtdAnos = 0; populacaoSegundoPais < populacaoPrimeiroPais; qtdAnos++) {
                    populacaoPrimeiroPais += (populacaoPrimeiroPais * taxaCrescimentoPrimeiroPais) / 100;
                    populacaoSegundoPais += (populacaoSegundoPais * taxaCrescimentoSegundoPais) / 100;
                }
            }

            System.out.println("\n - - - - - - - - - - - - - - - - - - - -");
            System.out.println("O país com a menor população levará " + qtdAnos + " anos para alcançar o país com a maior população.");

            System.out.println("\nDeseja fazer um novo calculo ou sair do programa?");
            System.out.println("Digite 1 para continuar.");
            System.out.println("ou");
            System.out.println("Digite 2 para sair.");
            inicioPrograma = scan.nextInt();

        } while (inicioPrograma == 1);

        System.out.println("\nObrigado.");

    }
}
