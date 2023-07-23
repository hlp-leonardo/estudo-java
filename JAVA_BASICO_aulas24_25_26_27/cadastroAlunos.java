package com.loiane.cursojava.aula24_25_26_27;

import java.util.Scanner;

public class cadastroAlunos {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Alunos aluno1 = new Alunos();
        aluno1.numeroMatricula = 1;
        System.out.print("Nome do aluno: ");
        aluno1.nome = scan.nextLine();
        System.out.print("Sexo (M/F): ");
        aluno1.sexo = scan.next().toUpperCase();
        System.out.print("Dia do nascimento (dd): ");
        aluno1.diaNascimento = scan.nextInt();
        System.out.print("Mês do nascimento (mm): ");
        aluno1.mesNascimento = scan.nextInt();
        System.out.print("Ano do nascimento (aaaa): ");
        aluno1.anoNascimento = scan.nextInt();
        System.out.print("Idade: ");
        aluno1.idade = scan.nextInt();

        System.out.println();
        Alunos aluno2 = new Alunos();
        aluno2.numeroMatricula = 2;
        System.out.print("Nome do aluno: ");
        aluno2.nome = scan.nextLine();
        System.out.print("Sexo (M/F): ");
        aluno2.sexo = scan.next().toUpperCase();
        System.out.print("Dia do nascimento (dd): ");
        aluno2.diaNascimento = scan.nextInt();
        System.out.print("Mês do nascimento (mm): ");
        aluno2.mesNascimento = scan.nextInt();
        System.out.print("Ano do nascimento (aaaa): ");
        aluno2.anoNascimento = scan.nextInt();
        System.out.print("Idade: ");
        aluno2.idade = scan.nextInt();

        System.out.println();
        aluno1.exibirFichaAluno();

        System.out.println();
        aluno2.exibirFichaAluno();

    }
}
