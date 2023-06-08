package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class Aula13Exercicio07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("### Calculo da área de um quadrado ###");
		
		System.out.println("\nDigite o valor de um dos lados do quadrado: ");
		double lado = scan.nextDouble();
		double area = lado * 2;
		System.out.println("\nA área do quadrado é: " + area + ", o dobro da área é: " + (area * 2));
		
		System.out.println("\nFim do programa.");

	}

}
