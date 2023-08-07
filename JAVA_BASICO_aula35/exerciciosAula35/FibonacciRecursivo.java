package com.loiane.cursojava.aula35.exerciciosAula35;

public class FibonacciRecursivo {

    public static int fibonacci(int numero) {
        if (numero < 2) {
            return 1;
        }
        int calc = numero;
        return fibonacci(numero - 1) + fibonacci(calc - 2);
    }
}
