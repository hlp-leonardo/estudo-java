package com.loiane.cursojava.aula24_25_26_27;

public class Alunos {
    int numeroMatricula;
    String nome;
    String sexo;
    int diaNascimento;
    int mesNascimento;
    int anoNascimento;
    int idade;

    void exibirFichaAluno() {
        System.out.println("Ficha do Aluno");
        System.out.println("Número da matrícula: " + this.numeroMatricula);
        System.out.println("Nome do Aluno: " + this.nome);
        System.out.println("Sexo: " + this.sexo);
        System.out.println("Data de nascimento: " + this.diaNascimento + "/" + this.mesNascimento + "/" + anoNascimento);
        System.out.println("Idade: " + this.idade);
    }

}
