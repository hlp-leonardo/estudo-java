package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Aula17Exercicio04 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("### Comparação de crescimento da população ###");

        // com For
        int populacaoPaisAFor = 80000;
        double populacaoPaisBFor = 200000;
        int qtdAnosFor = 0;

        for (int contFor = 0; populacaoPaisAFor < populacaoPaisBFor; contFor++) {
            populacaoPaisAFor += (populacaoPaisAFor * 3) / 100;
            populacaoPaisBFor += (populacaoPaisBFor * 1.5) / 100;
            if (populacaoPaisAFor >= populacaoPaisBFor) {
                qtdAnosFor = contFor;
            }
        }

        System.out.println("\nO país 'A For' tem 80.000 habitantes e uma crescimento anual de 3%.");
        System.out.println("O país 'B For' tem 200.000 habitantes e uma crescimento anual de 1.5%.");
        System.out.println("Sendo assim, dentro de " + qtdAnosFor + " anos o país 'A For' terá igualado ou superado a quantidade de habitantes do país 'B For'.");
        System.out.println("População de 'A For' em " + qtdAnosFor + " anos: " + populacaoPaisAFor);
        System.out.println("População de 'B For' em " + qtdAnosFor + " anos: " + populacaoPaisBFor);

        System.out.println("\n - - - - - - - - - - - - - - - - - - - - - - -");

        // com While
        int populacaoPaisAWhile = 80000;
        double populacaoPaisBWhile = 200000;
        int qtdAnosWhile = 0;

        while (populacaoPaisAWhile < populacaoPaisBWhile) {
            populacaoPaisAWhile += (populacaoPaisAWhile * 3) / 100;
            populacaoPaisBWhile += (populacaoPaisBWhile * 1.5) / 100;
            qtdAnosWhile++;
        }

        System.out.println("\nO país 'A While' tem 80.000 habitantes e uma crescimento anual de 3%.");
        System.out.println("O país 'B While' tem 200.000 habitantes e uma crescimento anual de 1.5%.");
        System.out.println("Sendo assim, dentro de " + qtdAnosWhile + " anos o país 'A While' terá igualado ou superado a quantidade de habitantes do país 'B While'.");
        System.out.println("População de 'A While' em " + qtdAnosWhile + " anos: " + populacaoPaisAWhile);
        System.out.println("População de 'B While' em " + qtdAnosWhile + " anos: " + populacaoPaisBWhile);

        System.out.println("\n - - - - - - - - - - - - - - - - - - - - - - -");

        // com Do While
        int populacaoPaisADoWhile = 80000;
        double populacaoPaisBDoWhile = 200000;
        int qtdAnosDoWhile = 0;

        do {
            populacaoPaisADoWhile += (populacaoPaisADoWhile * 3) / 100;
            populacaoPaisBDoWhile += (populacaoPaisBDoWhile * 1.5) / 100;
            qtdAnosDoWhile++;
        } while (populacaoPaisADoWhile < populacaoPaisBDoWhile);

        System.out.println("\nO país 'A Do While' tem 80.000 habitantes e uma crescimento anual de 3%.");
        System.out.println("O país 'B Do While' tem 200.000 habitantes e uma crescimento anual de 1.5%.");
        System.out.println("Sendo assim, dentro de " + qtdAnosDoWhile + " anos o país 'A Do While' terá igualado ou superado a quantidade de habitantes do país 'B Do While'.");
        System.out.println("População de 'A Do While' em " + qtdAnosDoWhile + " anos: " + populacaoPaisADoWhile);
        System.out.println("População de 'B Do While' em " + qtdAnosDoWhile + " anos: " + populacaoPaisBDoWhile);

        System.out.println("\n - - - - - - - - - - - - - - - - - - - - - - -");

    }
}
