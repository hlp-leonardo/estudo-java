package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class Aula13Exercicio14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("### Calculo de multa ###");
		
		System.out.print("\nDigite a quantidade de quilos pescados: ");
		double peso = scan.nextDouble();
		
		if (peso <= 50) {
			System.out.println("\nA quantidade de quilos de peixes pescados, " + peso + "kg, está dentro do limite permitido pelo estado de SP, que é de 50kg.");
			System.out.println("Não há multas a pagar.");
		} else {
			double excesso = peso - 50;
			double multa = excesso * 4;
			System.out.println("\nA quantidade de quilos de peixes pescados, " + peso + "kg, excede o limite permitido pelo estado de SP, que é de 50kg.");
			System.out.println("O limite foi ultrapassado em " + excesso + "kg e a multa a ser paga é de R$" + multa);
		}

		System.out.print("\nFim do programa.");
	}

}
