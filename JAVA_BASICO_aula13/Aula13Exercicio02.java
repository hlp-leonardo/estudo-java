package com.loiane.cursojava.aula13;

import java.util.Locale;
import java.util.Scanner;

public class Aula13Exercicio02 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Digite um número inteiro: ");
		int num1 = scan.nextInt();
		System.out.println("O número inteiro digitado foi: " + num1);
		
		System.out.println("\nDigite um número decimal: ");
		double num2 = scan.nextDouble();
		System.out.println("O número decimal digitado foi: " + num2);
		System.out.print("Fim do programa.");
		
	}
	
}
