package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Aula15Exercicio09 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("### Numeros inteiros em ordem decrescente ###");
		
		System.out.println("\nDigite o 1º número: ");
		int num1 = scan.nextInt();
		
		System.out.println("Digite o 2º número: ");
		int num2 = scan.nextInt();
		
		System.out.println("Digite o 3º número: ");
		int num3 = scan.nextInt();
		
		if (num1 > num2 && num2 > num3) {
			System.out.println("\nNumeros digitados em ordem decrescente: " + num1 + ", " + num2 + ", " + num3);
		} else if (num1 > num2 && num3 > num2) {
			System.out.println("\nNumeros digitados em ordem decrescente: " + num1 + ", " + num3 + ", " + num2);
		} else if (num1 > num2 && num2 == num3) {
			System.out.println("\nNumeros digitados em ordem decrescente: " + num1 + ", " + num2 + ", " + num3);
		} else if (num2 > num1 && num1 > num3) {
			System.out.println("\nNumeros digitados em ordem decrescente: " + num2 + ", " + num1 + ", " + num3);
		} else if (num2 > num1 && num1 < num3) {
			System.out.println("\nNumeros digitados em ordem decrescente: " + num2 + ", " + num3 + ", " + num1);
		} else if (num2 > num1 && num1 == num3) {
			System.out.println("\nNumeros digitados em ordem decrescente: " + num2 + ", " + num1 + ", " + num3);
		} else if (num3 > num1 && num1 > num2) {
			System.out.println("\nNumeros digitados em ordem decrescente: " + num3 + ", " + num1 + ", " + num2);
		} else if (num3 > num1 && num1 < num2) {
			System.out.println("\nNumeros digitados em ordem decrescente: " + num3 + ", " + num2 + ", " + num1);
		} else if (num3 > num1 && num1 == num2) {
			System.out.println("\nNumeros digitados em ordem decrescente: " + num3 + ", " + num1 + ", " + num2);
		} else {
			System.out.println("\nOs 3 números são iguais: " + num1 + ", " + num2 + ", " + num3);
		}

	}

}
