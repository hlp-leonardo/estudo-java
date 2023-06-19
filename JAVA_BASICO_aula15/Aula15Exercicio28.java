package com.loiane.cursojava.aula15;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Aula15Exercicio28 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        DecimalFormat formato2Casas = new DecimalFormat("#.00");

        System.out.println("### Calculo de promoção de carne no hipermercado ###");

        int opcaoDeCarne = 0;
        int contadorLoopCarne = 0;

        while (opcaoDeCarne != 1 && opcaoDeCarne != 2 && opcaoDeCarne != 3) {
            if (contadorLoopCarne == 0) {
                System.out.println("\nQual corte de carne deseja comprar?");
            } else {
                System.out.println("\nOpção inválida, tente novamente.");
            }
            System.out.println("Escolha uma das opções:");
            System.out.println("1 - para File Duplo");
            System.out.println("2 - para Alcatra");
            System.out.println("3 - para Picanha");
            System.out.print("Informe sua opção: ");
            opcaoDeCarne = scan.nextInt();
            contadorLoopCarne += 1;
        }

        String nomeDoCorte = "";
        if (opcaoDeCarne == 1) {
            nomeDoCorte = "File Duplo";
        } else if (opcaoDeCarne == 2) {
            nomeDoCorte = "Alcatra";
        } else {
            nomeDoCorte = "Picanha";
        }

        System.out.println("\nQuantos quilos de carne deseja comprar?");
        double quilosDeCarne = scan.nextDouble();

        int opcaoDePagamento = 0;
        int contadorLoopPagamento = 0;

        while (opcaoDePagamento != 1 && opcaoDePagamento != 2) {
            if (contadorLoopPagamento == 0) {
                System.out.println("\nQual a forma de pagamento?");
            } else {
                System.out.println("\nOpção inválida, tente novamente.");
            }
            System.out.println("Escolha uma das opções:");
            System.out.println("1 - para pagar com o cartão do mercado (5% de desconto)");
            System.out.println("2 - para outras formas de pagamento");
            System.out.print("Informe sua opção: ");
            opcaoDePagamento = scan.nextInt();
            contadorLoopPagamento += 1;
        }

        double calculoParaPagamento = 0;

        if (opcaoDeCarne == 1 && quilosDeCarne <= 5) {
            calculoParaPagamento = quilosDeCarne * 4.9;
        } else if (opcaoDeCarne == 1 && quilosDeCarne > 5){
            calculoParaPagamento = quilosDeCarne * 5.8;
        }

        if (opcaoDeCarne == 2 && quilosDeCarne <= 5) {
            calculoParaPagamento = quilosDeCarne * 5.9;
        } else if (opcaoDeCarne == 2 && quilosDeCarne > 5){
            calculoParaPagamento = quilosDeCarne * 6.8;
        }

        if (opcaoDeCarne == 3 && quilosDeCarne <= 5) {
            calculoParaPagamento = quilosDeCarne * 6.9;
        } else if (opcaoDeCarne == 3 && quilosDeCarne > 5) {
            calculoParaPagamento = quilosDeCarne * 7.8;
        }

        String calculoParaPagamentoFormatado = formato2Casas.format(calculoParaPagamento);

        double calculoDoDesconto = (calculoParaPagamento * 5) / 100;
        String calculoDoDescontoFormatado = formato2Casas.format(calculoDoDesconto);

        System.out.println("\n - - - - - - - - - - - - - - - - - - - - - - - - -");
        System.out.println("- Corte de carne escolhido: " + nomeDoCorte);
        System.out.println("- Quantidade de quilos: " + quilosDeCarne + "Kg");
        if (opcaoDePagamento == 1) {
            System.out.println("- Forma de pagamento: Cartão do mercado");
        } else {
            System.out.println("- Forma de pagamento: Outras formas de pagamento");
        }
        if (opcaoDePagamento != 1) {
            System.out.println("\n  - Valor total: R$" + calculoParaPagamentoFormatado);
        } else {
            System.out.println("- Valor total: R$" + calculoParaPagamentoFormatado);
        }
        if (opcaoDePagamento == 1) {
            calculoParaPagamento = calculoParaPagamento - calculoDoDesconto;
            System.out.println("- Desconto do cartão (5%): R$" + calculoDoDescontoFormatado);
            String calculoParaPagamentoFormatado2 = formato2Casas.format(calculoParaPagamento);
            System.out.println("\n  - Total a pagar: R$" + calculoParaPagamentoFormatado2);
        }
        System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - -");
        System.out.println("\nObrigado.");

    }

}
