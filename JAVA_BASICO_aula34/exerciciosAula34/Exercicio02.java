package com.loiane.cursojava.aula34.exerciciosAula34;

public class Exercicio02 {
    public static void main(String[] args) {

        int exibir = Calculadora.somar(1,9);
        System.out.println("Soma: " + exibir);

        exibir = Calculadora.subtrair(exibir, 4);
        System.out.println("Subtração: " + exibir);

        exibir = Calculadora.multiplicar(exibir, 5);
        System.out.println("Multiplicação: " + exibir);

        exibir = Calculadora.dividir(exibir, 6);
        System.out.println("Divisão: " + exibir);

        double exibir2 = Calculadora.potencia(exibir, 3);
        System.out.print("Potência: " + exibir2);

    }

}
