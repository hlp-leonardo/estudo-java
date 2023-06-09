package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Aula15Exercicio10 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("### Turno de estudo ###");
		
		System.out.println("\nQual turno você estuda? Digite M-matutino, V-vespertino ou N-noturno: ");
		String turno = scan.next();
		
		if (turno.equalsIgnoreCase("M")) {
			System.out.println("\nBom Dia!");
			
		} else if (turno.equalsIgnoreCase("V")) {
			System.out.println("\nBoa Tarde!");
			
		} else if (turno.equalsIgnoreCase("N")) {
			System.out.println("\nBoa Noite!");
			
		} else {
			System.out.println("\nValor Inválido!");
		}

	}

}
