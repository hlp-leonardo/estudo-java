package JavaBasico;

import java.util.Scanner;

public class Aula19Exercicio19 {
    public static void main (String[]args) {
        Scanner scan = new Scanner(System.in);

        double[] nota1 = new double[5];
        double[] nota2 = new double[5];
        double[] result = new double[5];

        for (int i = 0; i < nota1.length; i++) {
            System.out.print("Digite a primeira nota do aluno " + (i + 1) + ": ");
            nota1[i] = scan.nextDouble();
            System.out.print("Digite a segunda nota do aluno " + (i + 1) + ": ");
            nota2[i] = scan.nextDouble();
            result[i] = (nota1[i] + nota2[i]) / 2;
            System.out.println();
        }

        for (int i = 0; i < result.length; i++) {
            System.out.println("O aluno " + (i + 1) + " tirou as notas " + nota1[i] + " e " + nota2[i] + ", sua média é: " + result[i]);
            if (result[i] >= 7) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }
            System.out.println();
        }

    }
}
