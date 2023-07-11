package JavaBasico;

import java.util.Scanner;

public class Aula19Exercicio18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[5];
        int idade = 0, maiorIdade = 0, menorIdade = 0, posicaoMaior = 0, posicaoMenor = 0;

        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Digite a idade: ");
            idade = scan.nextInt();
            if (idade >= maiorIdade) {
                maiorIdade = idade;
                posicaoMaior = i;
            } else {
                menorIdade = idade;
                posicaoMenor = i;
            }
        }

        System.out.println();
        System.out.println("A maior idade digitada foi: " + maiorIdade + " na posição: " + posicaoMaior);
        System.out.println("A menor idade digitada foi: " + menorIdade + " na posição: " + posicaoMenor);

    }
}
