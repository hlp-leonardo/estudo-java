package com.loiane.cursojava.aula34.exerciciosAula34;

public class Contador {

    private static int cont;

    public static void incrementar() {
        cont++;
    }

    public static void zerar() {
        cont = 0;
    }

    public static int retornarContador() {
        return cont;
    }

}