package com.loiane.cursojava.aula24_25_26_27;

public class OrientacaoObjetosMetodos {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.numeroModelo = 1;
        carro1.marca = "Volkswagen";
        carro1.modelo = "Fusca";
        carro1.ano = 1985;
        carro1.cor = "Verde";
        carro1.numeroPortas = 2;
        carro1.numeroPassageiros = 5;
        carro1.capacidadeTanque = 30;
        carro1.consumoCombustivel = 8;

        Carro carro2 = new Carro();
        carro2.numeroModelo = 2;
        carro2.marca = "Fiat";
        carro2.modelo = "Uno";
        carro2.ano = 2010;
        carro2.cor = "Branco";
        carro2.numeroPortas = 4;
        carro2.numeroPassageiros = 5;
        carro2.capacidadeTanque = 45;
        carro2.consumoCombustivel = 12;

        carro1.exibirInformacoes();
        System.out.println();
        carro2.exibirInformacoes();

    }
}
