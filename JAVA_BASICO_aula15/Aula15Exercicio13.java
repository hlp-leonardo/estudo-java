package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Aula15Exercicio13 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("### Lê um número e exibe o dia da semana correspondente ###");
		
		System.out.println("\nDigite o número: ");
		int dia = scan.nextInt();
		
		if (dia == 1) {
			System.out.println("1 - Domingo");

		} else if (dia == 2) {
			System.out.println("2 - Segunda");

		} else if (dia == 3) {
			System.out.println("3 - Terça");

		} else if (dia == 4) {
			System.out.println("4 - Quarta");
	
		} else if (dia == 5) {
			System.out.println("5 - Quinta");
	
		} else if (dia == 6) {
			System.out.println("6 - Sexta");
	
		} else if (dia == 7) {
			System.out.println("7 - Sábado");
	
		} else {
			System.out.println("Valor inválido.");
			
		}
		
	}
}
