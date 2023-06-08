package com.loiane.cursojava.aula11;

public class VariaveisChar {

	public static void main(String[] args) {
		
		char o = 'o';
		char i = 'i';
		
		System.out.println("" + o + i);
		
		char o2 = 111;
		char i2 = 105;
		
		System.out.println("" + o2 + i2);
		
		// Incluindo uma interrogação no resultado do print
		char o3 = 'o';
		char i3 = 'i';
		char interrogacao = '\u003F';
		
		System.out.println("" + o3 + i3 + interrogacao);
		
		// Print sem colocar o comando ""
		char o4 = 'o';
		char i4 = 'i';
		
		System.out.println(o4 + i4);

	}

}
