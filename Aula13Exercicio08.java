package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class Aula13Exercicio08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("### Calculo de salário mensal ###");
		
		System.out.println("\nInsira o valor da sua hora de trabalho:");
		double sal = scan.nextDouble();
		
		System.out.println("\nInsira a quantidade de horas trabalhadas por mês:");
		double horas = scan.nextDouble();
		
		double calc = sal * horas; 
		
		System.out.println("\nSeu salário mensal é de R$" + calc);
		
		System.out.println("\nFim do programa.");

	}

}
