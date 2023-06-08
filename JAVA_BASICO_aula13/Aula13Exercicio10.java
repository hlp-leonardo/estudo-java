package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class Aula13Exercicio10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("### Conversão de Celsius para Fahrenheit ###");
		
		System.out.println("\nDigite a temperatura em Fahrenheit:");
		double celsius = scan.nextDouble();
		
		double fah = ((celsius * 9) / 5) + 32;
		
		System.out.println("\n" + celsius + " Celsius em Fahrenheit é: " + fah);
		
		System.out.print("\nFim do programa.");
	}

}
