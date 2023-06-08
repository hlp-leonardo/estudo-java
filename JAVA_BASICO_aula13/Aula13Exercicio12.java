package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class Aula13Exercicio12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("### Calculo de peso ideal ###");
		
		System.out.print("\nDigite a sua altura: ");
		double altura = scan.nextDouble();
		
		double calc = (72.7 * altura) - 58;
				
		System.out.println("\nSeu peso ideal é: " + calc);
		
		System.out.print("\nFim do programa.");

	}

}
