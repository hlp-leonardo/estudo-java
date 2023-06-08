package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Aula15Exercicio07 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("### Compara números inteiros ###");
		
		System.out.println("\nDigite o 1º número inteiro: ");
		int n1 = scan.nextInt();
		
		System.out.println("Digite o 2º número inteiro: ");
		int n2 = scan.nextInt();
		
		System.out.println("Digite o 3º número inteiro: ");
		int n3 = scan.nextInt();
		
		if (n1 > n2 && n1 > n3) {
			System.out.println("\nO 1º número é maior.");
		} else if (n2 > n1 && n2 > n3) {
			System.out.println("\nO 2º número é maior.");
		} else if (n3 > n1 && n3 > n2) {
			System.out.println("\nO 3º número é maior.");
		}
		
		if (n1 < n2 && n1 < n3) {
			System.out.println("\nO 1º número é menor.");
		} else if (n2 < n1 && n2 < n3) {
			System.out.println("\nO 2º número é menor.");
		} else if (n3 < n1 && n3 < n2) {
			System.out.println("\nO 3º número é maior.");
		}

	}

}
