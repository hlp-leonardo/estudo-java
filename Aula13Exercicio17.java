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
		
		double litros = area / 6;
		double litrosComFolga = Math.ceil(litros + (litros * 10 / 100));
		
		double lata = Math.ceil(litrosComFolga / 18);
		double precoLata = lata * 80;

		double galao = Math.ceil(litrosComFolga / 3.6);
		double precoGalao = galao * 25;
		
/*
me perdi nesse ponto, não consegui, com o que sei até o momento e mesmo pesquisando na internet, 
achar um modo de calcular a quantidade de latas + galões
		
*/
		double quantidadeLatas = Math.ceil(litrosComFolga / (18 * 6));
        double areaRestante = litrosComFolga % (18 * 6);
        double quantidadeGaloes = areaRestante / (3.6 * 6);
        
        if (areaRestante % (3.6 * 6) != 0) {
            quantidadeGaloes++;
        }
        
        double totalLataGalao = (quantidadeLatas * 80) + (quantidadeGaloes * 3.6);
		
		System.out.println("\n- Área a pintar: " + area);
		System.out.println("\n- Quantidade de litros de tinta necessários: " + litrosComFolga);
		System.out.println("\n- Total a pagar comprando " + lata + " latas de 18 litros: R$" + precoLata);
		System.out.println("\n- Total a pagar comprando " + galao + " gaslões de 3,6 litros: R$" + precoGalao);
		System.out.println("\n- Total de latas e galões a comprar: " + quantidadeLatas + " latas e " + quantidadeGaloes + " galões.");
		System.out.println("\n- Total a pagar misturando latas e galões: R$" + totalLataGalao);
		
		System.out.print("\nFim do programa.");

	}

}
