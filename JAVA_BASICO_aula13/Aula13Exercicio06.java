package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class Aula13Exercicio06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("### Calculo de área de um círculo ###");
		
		System.out.println("Digite o ráio do círculo para saber sua área: ");
		double raio = scan.nextDouble();
		
		double area = Math.PI * (raio * raio);
				
		System.out.println("\nA área de um círculo com raio de " + raio + " é: " + area);
		
		System.out.println("\nFim do programa.");

	}

}
