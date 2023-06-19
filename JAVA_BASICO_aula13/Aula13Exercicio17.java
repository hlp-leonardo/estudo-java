package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class Aula13Exercicio17 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("### Calculo de tinta ###");
		
		System.out.print("\nDigite o tamnaho da área a ser pintada, em metros quadrados: ");
		double area = scan.nextDouble();
		
		double qtdLitros = area / 6;
		//double litrosComFolga = Math.ceil(litros + (litros * 10 / 100));
		
		double qtdLatasArredondadas = Math.ceil(qtdLitros / 18);
		double precoLata = qtdLatasArredondadas * 80;
		System.out.println("\n- Quantidade de litros de tinta necessários: " + qtdLitros);
		System.out.println("\n- Total a pagar comprando " + qtdLatasArredondadas + " latas de 18 litros: R$" + precoLata);

		double qtdGalao = Math.ceil(qtdLitros / 3.6);
		double precoGalao = qtdGalao * 25;
		System.out.println("\n- Quantidade de litros de tinta necessários: " + qtdLitros);
		System.out.println("\n- Total a pagar comprando " + qtdGalao + " gaslões de 3,6 litros: R$" + precoGalao);
		
		double diferencaEmLitros = (qtdLatasArredondadas * 18) - qtdLitros;
		
		long qtdLatasReal = (long) qtdLitros / 18;
		
		double complementoEmGaloes = Math.ceil(diferencaEmLitros / 3.6);
		System.out.println("\n- Total de latas e galões a comprar: " + qtdLatasReal + " latas e " + complementoEmGaloes + " galões.");
		System.out.println("\n- Total a pagar misturando latas e galões: R$" + (precoLata + precoGalao));

	}

}
