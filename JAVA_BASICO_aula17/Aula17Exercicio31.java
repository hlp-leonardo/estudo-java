package com.loiane.cursojava.aula17;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Aula17Exercicio31 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        DecimalFormat formataNumero = new DecimalFormat("#.00");

        System.out.println("### Caixa registradora rudimentar ###");

        int iniciarCaixa = 1;

        while (iniciarCaixa == 1) {

            System.out.println("\n- - - - - - - - - - - - - - -");
            System.out.println("Digite 0 para finalizar e somar os valores.");

            double precoDoProduto = 0;
            int numeroDoProduto = 0;
            double somaDosProdutos = 0;

            do {
                numeroDoProduto++;
                System.out.print("Produto " + numeroDoProduto + ":" + " R$ ");
                precoDoProduto = scan.nextDouble();
                somaDosProdutos += precoDoProduto;
            } while (precoDoProduto > 0);

            String somaDosProdutosFormatado = formataNumero.format(somaDosProdutos);

            System.out.println("- - - - - - - - - - - - - - -");
            System.out.println("- - - - - - - - - - - - - - -");
            System.out.print("Total da compra: R$ " + somaDosProdutosFormatado);

            double valorPago = 0;
            System.out.print("\nValor pago: R$ ");
            valorPago = scan.nextDouble();

            double troco = valorPago - somaDosProdutos;
            String trocoFormatado = formataNumero.format(troco);

            if (troco > 0) {
                System.out.println("Troco: R$ " + trocoFormatado);
            } else {
                System.out.println("Troco: R$ 0,00");
            }
            System.out.println("- - - - - - - - - - - - - - -");

            System.out.println("\nIniciar novo calculo?");
            System.out.print("Digite 1 para Sim ou 0 para Não: ");
            iniciarCaixa = scan.nextInt();
        }

        System.out.println("\nCaixa desligada.");

    }
}
