package com.loiane.cursojava.aula12;

import java.util.Locale;
import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Digite seu nome completo: ");
		String nomeCompleto = scan.nextLine();
		System.out.println("Seu nome completo é: " + nomeCompleto);

		System.out.println("\nDigite o seu primeiro nome: ");
		String primeiroNome = scan.next();
		System.out.println("Seu primeiro nome é: " + primeiroNome);
		
		System.out.println("\nDigite sua idade: ");
		int idade = scan.nextInt();
		System.out.println("Sua idade é: " + idade);
		
		System.out.println("\nDigite sua altura: ");
		double altura = scan.nextDouble();
		System.out.println("sua altura é: " + altura);
		
		System.out.println("\nDigite seu primeiro nome, sua idade e sua altura: ");
		String primeiroNome2 = scan.next();
		int idade2 = scan.nextInt();
		double altura2 = scan.nextDouble();
		System.out.println("Seu primeiro nome é: " + primeiroNome2 + "\nSua idade é: " + idade2 + "\nSua altura é: " + altura2);	
		
	}

}
