package com.loiane.cursojava.aula17;

public class Aula17Exercicio06 {
    public static void main(String[] args) {

        System.out.println("### Imprime números de 1 a 20 ###");

        for (int numeros = 1; numeros <= 20; numeros++) {

            System.out.println(numeros);

        }

        for (int numeros = 1; numeros <= 20; numeros++) {
                System.out.print(numeros + ", ");
            if (numeros == 20) {
                System.out.print(numeros + ".");
            }


        }

    }
}
