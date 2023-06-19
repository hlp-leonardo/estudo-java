/*
Faça um Programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser
pintada. Considere que a cobertura da tinta é de 1 litro para cada 6 metros quadrados e que a tinta é vendida em latas
de 18 litros, que custam R$ 80,00 ou em galões de 3,6 litros, que custam R$ 25,00.
Informe ao usuário as quantidades de tinta a serem compradas e os respectivos preços em 3 situações:
comprar apenas latas de 18 litros;
comprar apenas galões de 3,6 litros;
misturar latas e galões, de forma que o desperdício de tinta seja menor. Acrescente 10% de folga e sempre
arredonde os valores para cima, isto é, considere latas cheias.
*/

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
