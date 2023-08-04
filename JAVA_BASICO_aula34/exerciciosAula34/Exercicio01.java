package com.loiane.cursojava.aula34.exerciciosAula34;

public class Exercicio01 {

    static void imprimirValor(){
        System.out.println(Contador.retornarContador());
    }

    public static void main(String[] args) {

        imprimirValor();

        Contador.incrementar();
        imprimirValor();

        Contador.zerar();
        imprimirValor();

        Contador.incrementar();
        Contador.incrementar();
        Contador.incrementar();
        imprimirValor();

        Contador.retornarContador();
        imprimirValor();

    }

}
