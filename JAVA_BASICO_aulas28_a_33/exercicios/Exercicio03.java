package com.loiane.cursojava.aula33.exerciciosAula28_33;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Aluno aluno1 = new Aluno();
        System.out.print("Nome do aluno: ");
        aluno1.setNome(scan.next());

        System.out.print("Número da matricula: ");
        aluno1.setMatricula(scan.nextInt());

        System.out.print("Nome do curso: ");
        aluno1.setCurso(scan.next());

        System.out.println();
        for (int i = 0; i < aluno1.getDiciplinas().length; i++) {
            System.out.print("Nome da " + (i + 1) + "ª disciplina: ");
            aluno1.setNomeDisciplinaPos(1, scan.next());
        }

        System.out.println();
        for (int i = 0; i < aluno1.getNotas().length; i++) {
            System.out.println("Notas da " + aluno1.getDiciplinas()[i] + "ª disciplina.");
            for (int j = 0; j < aluno1.getNotas()[i].length; j++) {
                System.out.print("Digite a " + (j + 1) + "ª nota: ");
                aluno1.setNomePosIJ(i, j, scan.nextDouble());
            }
        }

        System.out.println();
        aluno1.exibirInformacoes();

        System.out.println();
        for (int i = 0; i < aluno1.getDiciplinas().length; i++) {
            if (aluno1.verificarAprovacao(i)) {
                System.out.println("Na disciplina " + aluno1.getDiciplinas()[i] + " o aluno foi aprovado");
            } else {
                System.out.println("Na disciplina " + aluno1.getDiciplinas()[i] + " o aluno foi reprovado");
            }
        }

    }

}
