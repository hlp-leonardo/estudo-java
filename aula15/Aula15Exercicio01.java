package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Aula15Exercicio01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o 1º número inteiro: ");
		int n1 = scan.nextInt();
		
		System.out.println("Digite o 2º número inteiro: ");
		int n2 = scan.nextInt();
		
		if (n1 > n2) {
			System.out.println("O 1º número é o maior.");
		} else if (n1 == n2) {
			System.out.println("Os números são iguais.");
		} else {
			System.out.println("O 2º número é o maior.");
		}

	}

}
