package com.loiane.cursojava.aula34.exerciciosAula34;

public class Calculadora {

    public static int somar(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtrair(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    public static int dividir(int num1, int num2) {
        return num1 / num2;
    }

    public static double potencia(double num1, double num2) {
        return Math.pow(num1, num2);
    }

    public static int fatorial(int num) {
        if (num == 0 || num < 0) {
            System.out.println("Número inválido.");
            return 1;
        }
        int total = 1;
        System.out.print(num + "! = ");
        for (int i = num; i >= 1; i--) {
            total *= i;
            if (i > 1) {
                System.out.print(i + " x ");
            } else {
                System.out.print(i);
            }
        }
        System.out.println(" = " + total);
        return total;
    }
}
