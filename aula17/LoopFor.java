package com.loiane.cursojava.aula17;

public class LoopFor {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
        // declara a variável dentro do loop; cria a condição; faz o incremento
            System.out.println("i tem valor: " + i);
        }

        System.out.println("\n");

        for (int i = 5; i > 0; i--) {
        // declara a variável dentro do loop; cria a condição; faz o decremento
            System.out.println("i tem valor: " + i);
        }

    }
}
