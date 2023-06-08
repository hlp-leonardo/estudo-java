package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Aula15Ex1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
// Lê um número digitado pelo usuário e diz se é dia de semana ou final de semana.		
		
		System.out.println("Digite o dia da semana [entre 1 e 7]: ");
		int diaSemana = scan.nextInt();
		
		if (diaSemana == 1) {
			System.out.println("É Domingo, fim de semana.");
		} else if (diaSemana == 2) {
			System.out.println("É Segunda, dia de semana.");
		} else if (diaSemana == 3) {
			System.out.println("É Terça, dia de semana.");
		} else if (diaSemana == 4) {
			System.out.println("É Quarta, dia de semana.");			
		} else if (diaSemana == 5) {
			System.out.println("É Quinta, dia de semana.");			
		} else if (diaSemana == 6) {
			System.out.println("É Sexta, dia de semana.");
		} else if (diaSemana == 7) {
			System.out.println("É Sábado, fim de semana.");			
		} else {
			System.out.println("O número digitado não é válido.");
		}

		switch (diaSemana) {
		case 1: System.out.println("É Domingo, fim de semana."); break;
		case 2: System.out.println("É Segunda, dia de semana."); break;
		case 3: System.out.println("É Terça, dia de semana."); break;
		case 4: System.out.println("É Quarta, dia de semana."); break;
		case 5: System.out.println("É Quinta, dia de semana."); break;
		case 6: System.out.println("É Sexta, dia de semana."); break;
		case 7: System.out.println("É Sábado, fim de semana."); break;
		default : System.out.println("O número digitado não é válido.");
		}
		
	}

}
