package com.loiane.cursojava.aula24_25_26_27;

public class ContasCorrente {

    int agencia;
    int conta;
    String nomeCliente;
    boolean contaEspecial;
    String tipoContaEspecial;
    double saldo;
    double limiteSaque;

    public void exibirInfoConta() {
        System.out.println("Agência: " + this.agencia);
        System.out.println("Conta: " + this.conta);
        System.out.println("Nome do cliente: " + this.nomeCliente);
        String verificaConta = String.valueOf(this.contaEspecial);
        if (verificaConta.equalsIgnoreCase("true")) {
            System.out.println("Conta especial? Sim");
            System.out.println("Tipo da conta: " + this.tipoContaEspecial);
        } else {
            System.out.println("Conta especial? Não");
        }
        System.out.println("Saldo em conta: R$" + this.saldo);
        System.out.println("Limite de saque: R$" + this.limiteSaque);
        System.out.println();
    }

}
