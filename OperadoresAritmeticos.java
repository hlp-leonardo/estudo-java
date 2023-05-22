package com.loiane.cursojava.aula13;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		
		int resultado = 1 + 2;
		System.out.println("Soma de 1+2: " + resultado);
		
		resultado = resultado -1;
		System.out.println("Resultado anterior -1: " + resultado);
		
		resultado = resultado * 2;
		System.out.println("Resultado anterior *2: " + resultado);
		
		resultado = resultado / 2;
		System.out.println("Resultado anterior /2: " + resultado);
		
		resultado = resultado + 8;
		System.out.println("Resultado anterior +8: " + resultado);
		
		resultado = resultado % 7;
		System.out.println("Resto da divisão do resultado por 7: " + resultado);
		
		resultado++;
		System.out.println("Resultado++: " + resultado);
		
		++resultado;
		System.out.println("++Resultado: " + resultado);
		
		resultado += 1;
		System.out.println("Resultado += 1: " + resultado);
		
		resultado--;
		System.out.println("Resultado--: " + resultado);
		
		--resultado;
		System.out.println("--Resultado: " + resultado);
		
		resultado -= 1;
		System.out.println("Resultado -= 1: " + resultado);
		
		String primeiroNome = "Esta é ";
		String segundoNome = "uma String concatenada.";
		String terceiroNome = primeiroNome + segundoNome;
		System.out.println(terceiroNome);
		

	}

}
