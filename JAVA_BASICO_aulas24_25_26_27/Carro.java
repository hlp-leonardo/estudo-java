package com.loiane.cursojava.aula24_25_26_27;

public class Carro {
    int numeroModelo;
    String marca;
    String modelo;
    int ano;
    String cor;
    int numeroPortas;
    int numeroPassageiros;
    double capacidadeTanque;
    double consumoCombustivel;
    double autonomia;

    void exibirInformacoes() {
        System.out.println("Número do Modelo: " + this.numeroModelo);
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano de fabricação: " + this.ano);
        System.out.println("Cor: " + this.cor);
        System.out.println("Número de portas: " + this.numeroPortas);
        System.out.println("Número de passageiros: " + this.numeroPassageiros);
        System.out.println("Capacidade do tanque (L): " + this.capacidadeTanque);
        System.out.println("Consumo de combustível (Km/l): " + this.consumoCombustivel);
        System.out.println("Autonomia: " + (this.capacidadeTanque * this.consumoCombustivel) + " Km | (Método 'void' + Print)");
    }

    double obterAutonomia() {
        System.out.print("Autonomia: ");

        return capacidadeTanque * consumoCombustivel;
    }

    double calcularCombustivel(double km) {
        double qtdCombustivel = km / consumoCombustivel;

        return qtdCombustivel;
    }

}
