package JavaBasico;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Aula19Exercicio20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double[] valoresEmReais = new double[5];
        double[] conversao = new double[5];
        double cotacaoDolar = 0;

        System.out.print("Digite a cotação atual do dolar: USD ");
        cotacaoDolar = scan.nextDouble();

        System.out.println();

        for (int i = 0; i < valoresEmReais.length; i++) {
            System.out.print("Informe o " + (i + 1) + "º valor para conversão: R$");
            valoresEmReais[i] = scan.nextDouble();
            conversao[i] = valoresEmReais[i] / cotacaoDolar;
        }

        DecimalFormat conversaoFormatada = new DecimalFormat("#.##");

        System.out.println();

        for (int i = 0; i < conversao.length; i++) {
            System.out.println("A conversão de R$" + conversaoFormatada.format(valoresEmReais[i]) + " para dolar é: $" + conversaoFormatada.format(conversao[i]));
        }

    }
}
