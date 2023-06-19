package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Aula15Exercicio12_erro {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("### Folha de pagamento ###");
		
		System.out.println("\nInforme o valor da hora de trabalho: ");
		double valHora = scan.nextDouble();
		System.out.println("\nInforme a quantidade de horas trabalhadas: ");
		double horasTrabalhadas = scan.nextDouble();
		
		double salBruto = valHora * horasTrabalhadas;
		
		double calcInss = (salBruto * 10) / 100;
		double calcSindicato = (salBruto * 3) / 100;
		double calcFgts = (salBruto * 11) / 100;
		
		double calcIr = 0;
		int porIr = 0;
		
		if (salBruto <= 900) {
			calcIr = 0;
			porIr = 0;

		} else if (salBruto <= 1500) {
			calcIr = (salBruto * 5) / 100;
			porIr = 5;

		} else if (salBruto <= 2500) {
			calcIr = (salBruto * 10) / 100;
			porIr = 10;

		} else if (salBruto > 2500) {
			calcIr = (salBruto * 20) / 100;
			porIr = 20;
	
		} 
		
		double totalDescontos = calcInss + calcSindicato + calcIr;
		double salLiquido = salBruto - totalDescontos;
		
		System.out.println("\n - - - - - - - - - - - - - - - - -");
		System.out.println("Salário Bruto:		R$" + salBruto);
		System.out.println("(-) IR (" + porIr + "%):		R$" + calcIr);
		System.out.println("(-) INSS ( 10%):	R$" + calcInss);
		System.out.println("(-) Sindicato ( 3%):	R$" + calcSindicato);
		System.out.println("FGTS (11%):		R$" + calcFgts);
		System.out.println("Total de descontos:	R$" + totalDescontos);
		System.out.println("Salário Liquido:	R$" + salLiquido);
		System.out.println(" - - - - - - - - - - - - - - - - -");
		
	}
}
