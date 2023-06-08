package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Aula15Exercicio08 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("### Compara preços de produtos e mostra o mais barato ###");
		
		System.out.println("\nDigite o preço do 1º produto: ");
		double preco1 = scan.nextDouble();
		
		System.out.println("Digite o preço do 2º produto: ");
		double preco2 = scan.nextDouble();
		
		System.out.println("Digite o preço do 3º produto: ");
		double preco3 = scan.nextDouble();
		
		if (preco1 <= preco2 && preco1 <= preco3) {
			System.out.println("\nO 1º produto é o mais barato.");
		} else if (preco2 <= preco1 && preco2 <= preco3) {
			System.out.println("\nO 2º produto é o mais barato.");
		} else if (preco3 <= preco1 && preco3 <= preco2) {
			System.out.println("\nO 3º produto é o mais barato.");
		} else if (preco1 == preco2 && preco1 == preco3) {
			System.out.println("\nOs preços são iguais.");
		}

	}

}
