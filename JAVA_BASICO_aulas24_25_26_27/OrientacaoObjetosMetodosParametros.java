package com.loiane.cursojava.aula24_25_26_27;

public class OrientacaoObjetosMetodosParametros {
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
        double autonomiaCarro1 = carro1.obterAutonomia();
        double qtdCombustivelCarro1 = carro1.calcularCombustivel(10);

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
        double autonomiaCarro2 = carro2.obterAutonomia();
        double qtdCombustivelCarro2 = carro2.calcularCombustivel(10);

        carro1.exibirInformacoes();
        carro1.obterAutonomia();
        System.out.println(autonomiaCarro1 + " Km | ('return' do Método 'obterAutonomia' + Variável 'autonomiaCarro1' + Print)");
        System.out.println("Quantidade de litros para andar 10Km: " + qtdCombustivelCarro1 + " L | ('return' do Método 'calcularCombustivel' + Parâmetro 'Km' + Variável 'qtdCombustivelCarro1' + Print)");

        System.out.println("\n - - - - - - - - - - - - - - - - - - - -\n");

        carro2.exibirInformacoes();
        carro2.obterAutonomia();
        System.out.println(autonomiaCarro2 + " Km | ('return' do Método 'obterAutonomia' + Variável 'autonomiaCarro2' + Print)");
        System.out.println("Quantidade de litros para andar 10Km: " + qtdCombustivelCarro2 + " L | ('return' do Método 'calcularCombustivel' + Parâmetro 'Km' + Variável 'qtdCombustivelCarro2' + Print)");

    }
}
