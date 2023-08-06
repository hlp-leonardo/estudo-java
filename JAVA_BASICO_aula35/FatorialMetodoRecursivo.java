package com.loiane.cursojava.aula35;

public class FatorialMetodoRecursivo {

    public int fatorial(int num) {
        if (num == 0) {
            return 1;
        }
        return num * fatorial(num - 1);
    }
}
