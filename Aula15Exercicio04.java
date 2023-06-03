package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Aula15Exercicio04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite uma letra para saber se é uma vogal ou consoante: ");
		String letra = scan.next().toUpperCase();
		
		if (letra.matches("[A-Z]")) {
			if (letra.equals("A") | letra.equals("E") | letra.equals("I") | letra.equals("O") | letra.equals("U")) {
				System.out.println("A letra digitada é uma vogal.");
			}	else {
					System.out.println("A letra digitada é uma consoante.");
			}
		}	else {
				System.out.println("Opção inválida.");	
		}

	}

}
