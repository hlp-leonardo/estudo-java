package com.loiane.cursojava.aula13;

public class OperadoresLogicos {

	public static void main(String[] args) {

		int val1 = 1;
		int val2 = 2;
		
		boolean resultado1 = (val1 == 1) && (val2 == 2);
		System.out.println("O valor 1 é igual a 1 e o valor 2 é igual a 2? " + resultado1);
		
		boolean resultado2 = (val1 == 1) || (val2 == 2);
		System.out.println("O valor 1 é igual a 1 ou o valor 2 é igual a 2? " + resultado1);
		
		boolean verdadeiro = true;
		boolean falso = false;
		System.out.println(verdadeiro && falso);
		System.out.println(verdadeiro || falso);
		System.out.println(verdadeiro ^ falso);
		System.out.println(!verdadeiro && falso);

	}

}
