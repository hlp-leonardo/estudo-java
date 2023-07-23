package com.loiane.cursojava.aula24_25_26_27;

public class Aula24_27Exercicio05 {
    public static void main(String[] args) {

        ContasCorrente conta1 = new ContasCorrente();
        conta1.agencia = 9055;
        conta1.conta = 135790246;
        conta1.nomeCliente = "João";
        conta1.contaEspecial = false;
        conta1.tipoContaEspecial = "N/A";
        conta1.saldo = 1050;
        conta1.limiteSaque = 500;

        ContasCorrente conta2 = new ContasCorrente();
        conta2.agencia = 6134;
        conta2.conta = 246813579;
        conta2.nomeCliente = "Maria";
        conta2.contaEspecial = true;
        conta2.tipoContaEspecial = "Prime";
        conta2.saldo = 2350;
        conta2.limiteSaque = 800;

        conta1.exibirInfoConta();
        conta2.exibirInfoConta();

    }
}
