package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Aula15Exercicio05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("### Calculo de média ###");
		
		System.out.println("\nDigite a 1ª nota do aluno: ");
		double nota1 = scan.nextDouble();
		
		System.out.println("Digite a 2ª nota do aluno: ");
		double nota2 = scan.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		if (media == 10) {
			System.out.println("\nMédia: " + media + ", aluno aprovado com distinção.");
		} else if (media >= 7) {
			System.out.println("\nMédia: " + media + ", aluno aprovado.");
		} else {
			System.out.println("\nMédia: " + media + ", aluno reprovado.");
		}

	}

}
