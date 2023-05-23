package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("### Calculo de média de notas ###");
		
		System.out.println("\nDigite a primeira nota: ");
		double primeiraNota = scan.nextDouble();
		System.out.println("Digite a segunda nota: ");
		double segundaNota = scan.nextDouble();
		System.out.println("Digite a terceira nota: ");
		double terceiraNota = scan.nextDouble();
		System.out.println("Digite a quarta nota: ");
		double quartaNota = scan.nextDouble();
		
		double media = (primeiraNota + segundaNota + terceiraNota + quartaNota) / 4;
		
		System.out.println("\nA média do aluno é: " + media);
		
		System.out.println("Fim do programa.");

	}

}
