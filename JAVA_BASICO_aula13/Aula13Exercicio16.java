package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class Aula13Exercicio16 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("### Calculo de tinta ###");
		
		System.out.print("\nDigite o tamnaho da área a ser pintada, em metros quadrados: ");
		double area = scan.nextDouble();
		
		double litros = area / 3;
		double latas = Math.ceil(area / 18);
		double precoTotal = latas * 80;
		
		System.out.print("\nÁrea a pintar: " + area);
		System.out.print("\nQuantidade de litros de tinta necessários: " + litros);
		System.out.print("\nTotal de latas a comprar: " + latas);
		System.out.println("\nTotal a pagar: " + precoTotal);
		
		System.out.print("\nFim do programa.");

	}

}
