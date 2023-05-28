package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class Aula13Exercicio15 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("### Calculo de salário líquido ###");
		
		System.out.print("\nDigite o valor ganho por hora de trabalho: ");
		double salHora = scan.nextDouble();
		
		System.out.print("\nDigite a quantidade de horas trabalhadas no mês: ");
		double horas = scan.nextDouble();
		
		double salBruto = salHora * horas;
		double ir = (salBruto * 11) / 100;
		double inss = (salBruto * 8) / 100;
		double sindicato = (salBruto * 5) / 100;
		double salLiquido = salBruto - (ir + inss + sindicato);
		
		System.out.print("\n+ Salário Bruto: R$" + salBruto);
		System.out.print("\n- IR (11%): R$" + ir);
		System.out.print("\n- INSS (8%): R$" + inss);
		System.out.print("\n- Sindicato (5%): R$" + sindicato);
		System.out.println("\n= Salário Liquido: R$" + salLiquido);
		
		System.out.print("\nFim do programa.");

	}

}
