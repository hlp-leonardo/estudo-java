package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Aula15Ex2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
// Lê um número digitado pelo usuário e diz se é dia de semana ou final de semana.		
		
		System.out.println("Digite o dia da semana [entre 1 e 7]: ");
		int diaSemana = scan.nextInt();
		
		switch (diaSemana) {
		case 2: 
		case 3: 
		case 4: 
		case 5: 
		case 6: System.out.println("É dia de semana."); break;
		case 1: 
		case 7: System.out.println("É fim de semana."); break;
		default : System.out.println("O número digitado não é válido.");
		}
		
	}

}
