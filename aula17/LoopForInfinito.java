package com.loiane.cursojava.aula17;

public class LoopForInfinito {
    public static void main(String[] args) {

        int i = 0;
        for (;; ) {
            System.out.println("Valor de i: " + i);
            i++;
        }
    }
}
