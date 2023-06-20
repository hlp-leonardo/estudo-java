package com.loiane.cursojava.aula17;

public class LoopForSemCorpo {
    public static void main(String[] args) {

        // mais utilizado para somar valores
        int soma = 0;
        for (int i = 0; i < 5; soma += i++);
        System.out.println("O valor da soma é " + soma);
        // quando não utilizamos as chaves, somente a primeira linha após o for é executada
    }
}
