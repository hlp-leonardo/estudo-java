package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Aula15Exercicio06 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("### Compara números inteiros ###");
		
		System.out.println("\nDigite o 1º número inteiro: ");
		int n1 = scan.nextInt();
		
		System.out.println("Digite o 2º número inteiro: ");
		int n2 = scan.nextInt();
		
		if (n1 > n2) {
			System.out.println("\nO 1º número é maior.");
		} else if (n1 == n2) {
			System.out.println("\nOs números são iguais.");
		} else {
			System.out.println("\nO 2º número é maior.");
		}

	}

}
