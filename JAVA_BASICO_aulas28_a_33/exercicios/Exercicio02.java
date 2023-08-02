package com.loiane.cursojava.aula33.exerciciosAula28_33;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ContaCorrente cliente1 = new ContaCorrente();
        cliente1.setNumeroDaConta(13579);
        cliente1.setSenhaDaConta(1234);
        cliente1.setSaldo(572.23);
        cliente1.setEspecial(true);
        cliente1.setLimite(500);

        System.out.println("### Banco Banquinho ###");
        System.out.println(cliente1.getNumeroDaConta());
        System.out.println(cliente1.getSenhaDaConta());

        int verificaConta, verificaSenha;
        do {
            System.out.print("Digite o número da sua conta: ");
            verificaConta = scan.nextInt();
            if (verificaConta == cliente1.getNumeroDaConta()) {
                System.out.print("Digite sua senha: ");
                verificaSenha = scan.nextInt();
                while (verificaSenha != cliente1.getSenhaDaConta()) {
                    System.out.println("Senha incorreta.");
                    System.out.print("Digite sua senha: ");
                    verificaSenha = scan.nextInt();
                }
                if (verificaSenha == cliente1.getSenhaDaConta()) {
                    break;
                }
            }

        } while (verificaConta != cliente1.getNumeroDaConta());

        int opcoesDeOperacao;
        String resposta;
        boolean continuar = true;
        while (continuar == true) {

            System.out.println("===================");
            System.out.println("Informe o número da operação que desejada realizar:");
            System.out.println("1 - Saque. \n2 - Depósito. \n3 - Saldo. \n4 - Limite especial");
            System.out.print("Informe a opção escolhida: ");
            opcoesDeOperacao = scan.nextInt();

            if (opcoesDeOperacao == 1) {
                System.out.println("===================");
                System.out.print("Informe o valor do saque: R$");
                cliente1.sacar(scan.nextDouble());
            }

            if (opcoesDeOperacao == 2) {
                System.out.println("===================");
                System.out.print("Informe o valor do depósito: R$");
                cliente1.depositar(scan.nextDouble());
            }

            if (opcoesDeOperacao == 3) {
                System.out.println("===================");
                System.out.println("Saldo atual: R$" + cliente1.getSaldo());
            }

            if (opcoesDeOperacao == 4) {
                System.out.println("===================");
                if (cliente1.getEspecial() == true) {
                    System.out.println("Limite especial disponível: R$" + cliente1.getLimite());
                } else {
                    System.out.println("A conta não possui limite especial.");
                }
            }

            System.out.println("===================");
            System.out.println("Deseja realizar mais alguma operação?");
            System.out.print("Digite (S) para continuar ou (N) para sair: ");
            resposta = scan.next();

            if (resposta.equalsIgnoreCase("n")){
                continuar = false;
            }
        }

        System.out.println();
        System.out.println("Fim do atendimento. Obrigado.");

    }
}
