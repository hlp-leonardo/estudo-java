package com.loiane.cursojava.aula36.exerciciosAula36;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Nome do curso: ");
        String nome = scan.nextLine();

        System.out.print("Horário do curso: ");
        String horario = scan.nextLine();

        System.out.print("Nome do professor: ");
        String nomeProfessor = scan.nextLine();

        System.out.print("Departamento do professor: ");
        String depProfessor = scan.nextLine();

        System.out.print("E-mail do professor: ");
        String emailProfessor = scan.nextLine();

        Curso curso = new Curso();
        curso.setNome(nome);
        curso.setHorario(horario);

        Professor professor = new Professor();
        professor.setNome(nomeProfessor);
        professor.setDepartamento(depProfessor);
        professor.setEmail(emailProfessor);

        curso.setProfessor(professor);

        Aluno[] alunos = new Aluno[2];
        for (int i = 0; i < alunos.length; i++) {
            System.out.println("\nEntre com as informações do " + (i + 1) + "º aluno");

            Aluno aluno = new Aluno();
            System.out.print("Nome: ");
            aluno.setNomeAluno(scan.nextLine());

            System.out.print("Matrícula: ");
            aluno.setMatricula(scan.nextInt());

            double[] notas = new double[4];
            for (int j = 0; j < 4; j++) {
                System.out.print((j + 1) + "ª nota do aluno: ");
                notas[j] = scan.nextDouble();
                aluno.setNotas(notas);
            }
            alunos[i] = aluno;
        }
        curso.setAlunos(alunos);

        System.out.println(curso.exibirInfoCurso());
    }
}
