package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Aula15Exercicio02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número qualquer, positivo ou negativo: ");
		int num = scan.nextInt();
		
		if (num >= 0) {
			System.out.println("O número é positivo.");
		} else {
			System.out.println("O número é negativo.");
		}

	}

}
