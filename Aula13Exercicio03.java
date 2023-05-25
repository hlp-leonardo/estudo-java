package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class Aula13Exercicio03 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("### Soma de dois números inteiros###");
		
		System.out.println("Digite o primeiro número: ");
		int primeiroNumero = entrada.nextInt();
		System.out.println("Digite o primeiro número: ");
		int segundoNumero = entrada.nextInt();
		System.out.println("A soma de " + primeiroNumero + " + " + segundoNumero + " é: " + (primeiroNumero + segundoNumero));
		
		System.out.println("\n### Soma de dois números, inteiros ou decimais###");
		
		System.out.println("Digite o primeiro número: ");
		double num1 = entrada.nextDouble();
		System.out.println("Digite o primeiro número: ");
		double num2 = entrada.nextDouble();
		System.out.println("A soma de " + num1 + " + " + num2 + " é: " + (num1 + num2));

	}

}
