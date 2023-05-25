package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class Aula13Exercicio13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("### Calculo de peso ideal ###");
		
		System.out.print("\nDigite o sexo [M/F]: ");
		String sexo = scan.next();
		
		System.out.print("\nDigite a sua altura: ");
		double altura = scan.nextDouble();
		
		if (sexo.equalsIgnoreCase("M")) {
			double calc1 = (72.7 * altura) - 58;
			System.out.println("\nSeu peso ideal é: " + calc1);
		} else {
			double calc2 = (62.1 * altura) - 44.7;
			System.out.println("\nSeu peso ideal é: " + calc2);
		}		

		System.out.print("\nFim do programa.");

	}

}
