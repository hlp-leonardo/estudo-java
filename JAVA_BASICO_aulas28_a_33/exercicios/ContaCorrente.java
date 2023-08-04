package com.loiane.cursojava.aula33.exerciciosAula28_33;

public class ContaCorrente {

    private int numeroDaConta;
    private int senhaDaConta;
    private double saldo;
    private boolean especial;
    private double limite;


    protected void sacar(double saque) {
        if (this.saldo >= saque) {
            this.saldo -= saque;
            System.out.println("O saque de R$" + saque + " foi realizado com sucesso.");
        } else {
            if (this.especial == true) {
                if ((this.saldo + this.limite) >= saque) {
                    this.saldo -= saque;
                    System.out.println("O saque de R$" + saque + " foi realizado utilizando o limite especial.");
                    if (this.getSaldo() < 0) {
                        this.limite += this.getSaldo();
                    }
                } else {
                    System.out.println("O saque de R$" + saque + " não pode ser realizado.");
                }
            } else {
                System.out.println("O saque de R$" + saque + " não pode ser realizado.");
            }
        }
    }

    protected void depositar(double deposito) {
        this.saldo += deposito;
        System.out.println("O depósito de R$" + deposito + " foi realizado com sucesso.");
    }

    protected int getNumeroDaConta() {
        return this.numeroDaConta;
    }

    protected int setNumeroDaConta(int numerarConta) {
        this.numeroDaConta = numerarConta;
        return this.numeroDaConta;
    }

    public int getSenhaDaConta() {
        return senhaDaConta;
    }

    public int setSenhaDaConta(int senhaDaConta) {
        this.senhaDaConta = senhaDaConta;
        return senhaDaConta;
    }

    protected double getSaldo() {
        return this.saldo;
    }

    protected double setSaldo( double saldo) {
        this.saldo = saldo;
        return this.saldo;
    }

    protected boolean getEspecial() {
        if (especial == true) {
            return true;
        } else {
            return false;
        }
    }

    protected boolean setEspecial(boolean especial) {
        this.especial = especial;
        return especial;
    }

    protected double getLimite() {
        return this.limite;
    }

    protected double setLimite( double limite) {
        this.limite = limite;
        return limite;
    }

}
