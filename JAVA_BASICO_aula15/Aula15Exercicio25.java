package com.loiane.cursojava.aula15;

import java.util.Scanner;
import java.util.jar.JarOutputStream;

public class Aula15Exercicio25 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("### Interrogatorio criminal ###");

        int qtdSim = 0;

        System.out.println("\nTelefonou para a vítima? [S/N]");
        String pergunta1 = scan.nextLine().toUpperCase();

        if (pergunta1.equals("S")) {
            qtdSim += 1;
        }

        System.out.println("Esteve no local do crime? [S/N]");
        String pergunta2 = scan.nextLine().toUpperCase();

        if (pergunta2.equals("S")) {
            qtdSim += 1;
        }

        System.out.println("Mora perto da vítima? [S/N]");
        String pergunta3 = scan.nextLine().toUpperCase();

        if (pergunta3.equals("S")) {
            qtdSim += 1;
        }

        System.out.println("Devia para a vítima? [S/N]");
        String pergunta4 = scan.nextLine().toUpperCase();

        if (pergunta4.equals("S")) {
            qtdSim += 1;
        }

        System.out.println("Já trabalhou com a vítima? [S/N]");
        String pergunta5 = scan.nextLine().toUpperCase();

        if (pergunta5.equals("S")) {
            qtdSim += 1;
        }

        if (qtdSim == 2) {
            System.out.println("\nSuspeito");
        } else if (qtdSim >= 3 && qtdSim <= 4) {
            System.out.println("\nCúmplice");
        } else if (qtdSim == 5) {
            System.out.println("\nAssassino");
        } else {
            System.out.println("\nInocente");
        }

    }
}
