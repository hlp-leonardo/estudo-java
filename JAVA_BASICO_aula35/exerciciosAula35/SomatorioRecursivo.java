package com.loiane.cursojava.aula35.exerciciosAula35;

public class SomatorioRecursivo {

    public static int somatorio(int num) {
        if (num == 1) {
            return 1;
        }
        return num + somatorio(num - 1);
    }

}
