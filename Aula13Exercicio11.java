package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class Aula13Exercicio11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("### Calculo de números inteiros e reais ###");
		
		System.out.println("\nDigite o primeiro número inteiro:");
		int num1 = scan.nextInt();
		
		System.out.println("\nDigite o segundo número inteiro:");
		int num2 = scan.nextInt();
		
		System.out.println("\nDigite um número real:");
		double num3 = scan.nextDouble();
		
		double calc1 = (num1 * 2) * (num2 / 2);
		double calc2 = (num1 * 3) + num3;
		double calc3 = Math.pow(num3, 3);
		
		System.out.println("\nO produto do dobro do primeiro com metade do segundo é: " + calc1);
		
		System.out.println("\nA soma do triplo do primeiro com o terceiro é: " + calc2);
		
		System.out.println("\nO terceiro elevado ao cubo é: " + calc3);
		
		System.out.print("\nFim do programa.");

	}

}
