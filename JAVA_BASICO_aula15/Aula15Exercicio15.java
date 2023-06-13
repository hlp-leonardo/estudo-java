package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Aula15Exercicio15 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("### Informar se os valores podem formar um triângulo ###");
		
		System.out.println("\nDigite o 1ª lado: ");
		int lado1 = scan.nextInt();
		System.out.println("\nDigite o 2ª lado: ");
		int lado2 = scan.nextInt();
		System.out.println("\nDigite o 3ª lado: ");
		int lado3 = scan.nextInt();
		
		if (((lado1 + lado2) > lado3) || ((lado1 + lado3) > lado2) || ((lado2 + lado3) > lado1)) {

			if (lado1 == lado2 && lado1 == lado3 && lado2 == lado3) {
				System.out.println("Os valores digitados formam um triângulo equilátero.");

			} else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
				System.out.println("Os valores digitados formam um triângulo escaleno.");

			} else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
				System.out.println("Os valores digitados formam um triângulo isósceles.");
	
			} 
			
		} else {
			System.out.println("\nOs valores digitados não formam um triângulo.");
	
		} 
		
	}
}
