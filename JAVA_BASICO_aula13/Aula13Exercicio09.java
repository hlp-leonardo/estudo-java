package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class Aula13Exercicio09 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("### Conversão de Fahrenheit para Celsius ###");
		
		System.out.println("\nDigite a temperatura em Fahrenheit:");
		double fah = scan.nextDouble();
		
		double celsius = 5 * ((fah - 32) / 9);
		
		System.out.println("\n" + fah + " Fahrenheit em Celsius é: " + celsius);
		
		System.out.print("\nFim do programa.");

	}

}
