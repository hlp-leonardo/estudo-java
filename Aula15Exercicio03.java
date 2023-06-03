package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Aula15Exercicio03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite F ou M para ler o sexo correspondente: ");
		String sexo = scan.next();
		
		if (sexo.equalsIgnoreCase("M")) {
			System.out.println("Sexo Masculino.");
		}	else if (sexo.equalsIgnoreCase("F")) {
				System.out.println("Sexo Feminino.");
		} 	else {
				System.out.println("Opção inválida.");
		}

	}

}
