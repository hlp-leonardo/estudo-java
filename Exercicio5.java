package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("### Conversor de Metros para Centímetros ###");
		
		System.out.println("\nDigite a quantidade de Metros: ");
		double metros = scan.nextDouble();
		double calc1 = metros * 100;
		System.out.println("A conversão de " + metros + "m em centímetros é: " + calc1 + "cm");
		
		System.out.println("\n### Conversor de Centímetros para Metros ###");
		
		System.out.println("\nDigite a quantidade de Centímetros: ");
		double centimetros = scan.nextDouble();
		double calc2 = centimetros / 100;
		System.out.println("A conversão de " + centimetros + "cm em centímetros é: " + calc2 + "m");
		
		System.out.println("Fim do programa.");

	}

}
