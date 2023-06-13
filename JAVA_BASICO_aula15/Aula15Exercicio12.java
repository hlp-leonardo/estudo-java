package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Aula15Exercicio12 {

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
		
		if (salBruto <= 900) {
			double calcIr = 0;
			double totalDescontos = calcInss + calcSindicato + calcIr;
			double salLiquido = salBruto - totalDescontos;
			System.out.println("\n - - - - - - - - - - - - - - -");
			System.out.println("Salário Bruto:		R$" + salBruto);
			System.out.println("(-) IR (Isento):	R$" + calcIr);
			System.out.println("(-) INSS ( 10%):	R$" + calcInss);
			System.out.println("(-) Sindicato ( 3%):	R$" + calcSindicato);
			System.out.println("FGTS (11%):		R$" + calcFgts);
			System.out.println("Total de descontos:	R$" + totalDescontos);
			System.out.println("Salário Liquido:	R$" + salLiquido);
			System.out.println(" - - - - - - - - - - - - - - -");
			
		} else if (salBruto <= 1500) {
			double calcIr = (salBruto * 5) / 100;
			double totalDescontos = calcInss + calcSindicato + calcIr;
			double salLiquido = salBruto - totalDescontos;
			System.out.println("\n - - - - - - - - - - - - - - - - -");
			System.out.println("Salário Bruto:		R$" + salBruto);
			System.out.println("(-) IR (5%):		R$" + calcIr);
			System.out.println("(-) INSS ( 10%):	R$" + calcInss);
			System.out.println("(-) Sindicato ( 3%):	R$" + calcSindicato);
			System.out.println("FGTS (11%):		R$" + calcFgts);
			System.out.println("Total de descontos:	R$" + totalDescontos);
			System.out.println("Salário Liquido:	R$" + salLiquido);
			System.out.println(" - - - - - - - - - - - - - - - - -");
			
		} else if (salBruto <= 2500) {
			double calcIr = (salBruto * 10) / 100;
			double totalDescontos = calcInss + calcSindicato + calcIr;
			double salLiquido = salBruto - totalDescontos;
			System.out.println("\n - - - - - - - - - - - - - - - - -");
			System.out.println("Salário Bruto:		R$" + salBruto);
			System.out.println("(-) IR (10%):		R$" + calcIr);
			System.out.println("(-) INSS ( 10%):	R$" + calcInss);
			System.out.println("(-) Sindicato ( 3%):	R$" + calcSindicato);
			System.out.println("FGTS (11%):		R$" + calcFgts);
			System.out.println("Total de descontos:	R$" + totalDescontos);
			System.out.println("Salário Liquido:	R$" + salLiquido);
			System.out.println(" - - - - - - - - - - - - - - - - -");
			
		} else if (salBruto > 2500) {
			double calcIr = (salBruto * 20) / 100;
			double totalDescontos = calcInss + calcSindicato + calcIr;
			double salLiquido = salBruto - totalDescontos;
			System.out.println("\n - - - - - - - - - - - - - - - - -");
			System.out.println("Salário Bruto:		R$" + salBruto);
			System.out.println("(-) IR (20%):		R$" + calcIr);
			System.out.println("(-) INSS ( 10%):	R$" + calcInss);
			System.out.println("(-) Sindicato ( 3%):	R$" + calcSindicato);
			System.out.println("FGTS (11%):		R$" + calcFgts);
			System.out.println("Total de descontos:	R$" + totalDescontos);
			System.out.println("Salário Liquido:	R$" + salLiquido);
			System.out.println(" - - - - - - - - - - - - - - - - -");
			
		} 
		
	}
}
