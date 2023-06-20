package com.loiane.cursojava.aula17;

public class LoopFor2 {
    public static void main(String[] args) {

        for (int i = 0, j = 10; i < j; i++, j--) {
            // declara 2 variáveis dentro do loop; cria a condição; faz o incremento de i e decremento de j
            System.out.println("i = " + i + ", j = " + j);
        }

        System.out.println("\n");

        // outro exemplo, as duas formas chegam ao mesmo resultado
        int count = 0;
        for (; count < 10; ) {
            System.out.println("Valor de count: " + count);
            count += 2;
        }

        System.out.println("\n");

        for (int count2 = 0; count2 < 10; count2 = count += 2) {
            System.out.println("Valor de count2: " + count2);
        }
    }
}
