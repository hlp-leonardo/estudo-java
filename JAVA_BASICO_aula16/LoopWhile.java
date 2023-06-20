package com.loiane.cursojava.aula16;

public class LoopWhile {
    public static void main(String[] args) {

        int i = 1; // normalmente, é utilizada a letra i para contador
        int max = 10;

        System.out.println("Contando até " + max);

        while (i <= max) {
            System.out.println("Valor de i: " + i);
            i++; // a mesma coisa que "i += 1" ou "i = i + 1"
        }

        System.out.println("Fim do Loop While.");

    }

}
