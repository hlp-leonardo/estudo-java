package com.loiane.cursojava.aula14;

import java.util.Scanner;

public class Aula14Ex2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
/*
Informe que o produto está barato se o preço for de R$10(inclusive) ou menos.
Informe que deve pedir desconto se o preço estiver entre R$10 e R$15.
Informe que deve pesquisar mais preços se esviver entre R$15(inclusive) e R$17.
Informe que está muito caro se for maior que R$17(inclusive).		
*/		
		
		System.out.println("Digite o preço do produto para saber se vale a pena: ");
		double preco = scan.nextDouble();
		
		if (preco <= 10) {
			System.out.println("O produto está barato, vale a pena comprar.");
		} else if (preco > 10 && preco < 15) {
			System.out.println("O produto está dentro do preço normal, tente pedir um desconto.");
		} else if (preco >= 15 && preco < 17) {
			System.out.println("O produto acima do preço de mercado, é melhor pesquisar mais.");
		} else {
			System.out.println("O produto está muito caro, não vale a pena comprar.");
		}

	}

}
