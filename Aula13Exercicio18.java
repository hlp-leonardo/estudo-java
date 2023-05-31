package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class Aula13Exercicio18 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("### Calculo de tinta ###");
		
		System.out.print("\nDigite o tamnaho do arquivo: ");
		double arquivo = scan.nextDouble();
		
		System.out.print("\nDigite a sua velocidade de internet: ");
		double internet = scan.nextDouble();
		
		double calc = arquivo / internet;
		
		System.out.println("\nTempo de download será de: " + calc);
		
		System.out.print("\nFim do programa.");

	}

}
