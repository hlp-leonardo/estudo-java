package com.loiane.cursojava.aula17;

public class Aula17Exercicio09 {
    public static void main(String[] args) {

        System.out.println("### Imprime números ímpares entre 1 e 50 ###\n");

        int contador = 0;
        do {
            contador++;
            if (contador % 2 != 0) {
                System.out.println(contador);
            }
        } while (contador < 50);

    }
}
