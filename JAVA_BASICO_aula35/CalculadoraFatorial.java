package com.loiane.cursojava.aula35;

public class CalculadoraFatorial {

    public static int fatorialNaoRecursivo(int num) {
        if (num == 0) {
            return 1;
        }
        int total = 1;
        for (int i = num; i >= 1; i--) {
            total *= i;
        }
        return total;
    }

    public static int fatorualRecursivo(int num) {
        if (num == 0) {
            return 1;
        }
        return num * fatorualRecursivo(num - 1);
    }
}
