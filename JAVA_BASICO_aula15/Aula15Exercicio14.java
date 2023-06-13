package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Aula15Exercicio14 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("### Lê e calcula notas dos alunos ###");
		
		System.out.println("\nDigite a 1ª nota: ");
		double nota1 = scan.nextDouble();
		System.out.println("\nDigite a 2ª nota: ");
		double nota2 = scan.nextDouble();
		
		double calcNota = (nota1 + nota2) / 2;
		
		if (calcNota >= 9 && calcNota <= 10) {
			System.out.println("\n1ª nota do Aluno: " + nota1);
			System.out.println("2ª nota do Aluno: " + nota2);
			System.out.println("Média do aluno: " + calcNota);
			System.out.println("Conceito: A");
			System.out.println("Aluno APROVADO.");

		} else if (calcNota >= 7.5 && calcNota < 9) {
			System.out.println("\n1ª nota do Aluno: " + nota1);
			System.out.println("2ª nota do Aluno: " + nota2);
			System.out.println("Média do aluno: " + calcNota);
			System.out.println("Conceito: B");
			System.out.println("Aluno APROVADO.");

		} else if (calcNota >= 6 && calcNota < 7.5) {
			System.out.println("\n1ª nota do Aluno: " + nota1);
			System.out.println("2ª nota do Aluno: " + nota2);
			System.out.println("Média do aluno: " + calcNota);
			System.out.println("Conceito: C");
			System.out.println("Aluno APROVADO.");

		} else if (calcNota >= 4 && calcNota < 6) {
			System.out.println("\n1ª nota do Aluno: " + nota1);
			System.out.println("2ª nota do Aluno: " + nota2);
			System.out.println("Média do aluno: " + calcNota);
			System.out.println("Conceito: D");
			System.out.println("Aluno REPROVADO.");
	
		} else if (calcNota >= 0 && calcNota < 4) {
			System.out.println("\n1ª nota do Aluno: " + nota1);
			System.out.println("2ª nota do Aluno: " + nota2);
			System.out.println("Média do aluno: " + calcNota);
			System.out.println("Conceito: E");
			System.out.println("Aluno REPROVADO.");
	
		} 
		
	}
}
