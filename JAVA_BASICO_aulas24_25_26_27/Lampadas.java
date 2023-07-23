package com.loiane.cursojava.aula24_25_26_27;

//Aula 24 exercício 01

public class Lampadas {

    String marca;
    String modelo;
    int potencia;
    String cor;
    String tensao;

    public void exibirLampadas() {
        System.out.println("Informações da lâmpada:");
        System.out.println("Modelo: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Potência: " + this.potencia + "W");
        System.out.println("Cor: " + this.cor);
        System.out.println("Tensão: " + this.tensao);
    }

}
