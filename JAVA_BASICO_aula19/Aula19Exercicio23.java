package JavaBasico;

import java.util.Scanner;

public class Aula19Exercicio23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numerosInteiros = new int[5];
        int i = 0;

        while (i < numerosInteiros.length) {
            System.out.print("Digite o " + (i + 1) + "º número inteiro: ");
            numerosInteiros[i] = scan.nextInt();
            i++;
        }

        System.out.println();
        int i2 = 0;
        for (int resultado : numerosInteiros) {
            i2++;
            if (resultado % 2 == 0) {
                System.out.println(i2 + "º número digitado: " + resultado);
            } else {
                System.out.println("O " + i2 + "º número digitado é ímpar, processo interrompido.");
                break;
            }

        }

    }
}
