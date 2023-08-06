package com.loiane.cursojava.aula35;

import com.loiane.cursojava.aula34.exerciciosAula34.Calculadora;

public class TesteCalculadorsFatorial {

    public static void main(String[] args) {

        int fatorialNR = CalculadoraFatorial.fatorialNaoRecursivo(5);
        System.out.println(fatorialNR);

        int fatorialR = CalculadoraFatorial.fatorualRecursivo(5);
        System.out.println(fatorialR);

    }
}
