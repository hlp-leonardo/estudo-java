package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Aula15Exercicio11_erro {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("### Cálculo de reajuste salarial ###");
		
		System.out.println("\nInforme o salário atual do colaborador: ");
		double sal = scan.nextDouble();
		
		int per = 0;
		double calc = 0;
		double novoSal = 0;
		
		if (sal <= 280) {
			double calc = (sal * 20) / 100;
			double novoSal = sal + calc;
			int per = 20;
			
		} else if (sal > 280 && sal <= 700) {
			double calc = (sal * 15) / 100;
			double novoSal = sal + calc;
			int per = 15;
			
		} else if (sal > 700 && sal <= 1500) {
			double calc = (sal * 10) / 100;
			double novoSal = sal + calc;
			int per = 10;
			
		} else if (sal > 1500) {
			double calc = (sal * 5) / 100;
			double novoSal = sal + calc;
			int per = 5;
			
		}
		
		System.out.println("\n - - - - - - - - - - - - - - -");
		System.out.println("- Salário antes do reajuste: R$" + sal);
		System.out.println("- Percentual de aumento aplicado: " + per + "%");
		System.out.println("- Valor do aumento: R$" + calc);
		System.out.println("- Novo salário, após o aumento: R$" + novoSal);
		
	}
}
