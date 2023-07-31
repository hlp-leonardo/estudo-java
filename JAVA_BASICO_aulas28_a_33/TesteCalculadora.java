package com.loiane.cursojava.aula33;

public class TesteCalculadora {
    public static void main(String[] args) {

        MinhaCalculadora calc = new MinhaCalculadora();
        calc.soma(1, 2);
        calc.soma(5.5, 6.3);
        calc.soma(2, 4, 6);

        System.out.println(calc.soma(1, 2));
        System.out.println(calc.soma(5.5, 6.3));
        System.out.println(calc.soma(2, 4, 6));

    }

}
