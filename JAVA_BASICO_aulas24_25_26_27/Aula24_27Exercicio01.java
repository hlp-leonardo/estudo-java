package com.loiane.cursojava.aula24_25_26_27;

public class Aula24_27Exercicio01 {
    public static void main(String[] args) {

        Lampadas lampada1 = new Lampadas();
        lampada1.marca = "GE";
        lampada1.modelo = "A60";
        lampada1.potencia = 7;
        lampada1.cor = "Amarela";
        lampada1.tensao = "Bivolt";

        Lampadas lampada2 = new Lampadas();
        lampada2.marca = "Lumix";
        lampada2.modelo = "LA12";
        lampada2.potencia = 6;
        lampada2.cor = "Azul";
        lampada2.tensao = "127";


        lampada1.exibirLampadas();
        System.out.println();
        lampada2.exibirLampadas();

    }

}
