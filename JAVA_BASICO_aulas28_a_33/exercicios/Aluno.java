package com.loiane.cursojava.aula33.exerciciosAula28_33;

public class Aluno {

    private String nome;
    private int matricula;
    private String curso;
    private String[] disciplinas;
    private double[][] notas;

    public Aluno() {
        this.disciplinas = new String[3];
        this.notas = new double[this.disciplinas.length][4];
    }

    public Aluno(String nome, int matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.disciplinas = new String[3];
        this.notas = new double[this.disciplinas.length][4];
    }

    public void exibirInformacoes() {
        System.out.println("Nome do aluno: " + this.nome);
        System.out.println("Número da matrícula: " + this.matricula);
        System.out.println("Curso: " + this.curso);

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Notas da disciplina: " + this.notas[i]);
            for (int j = 0; j < notas[i].length; j++) {
                System.out.println(notas[i][j] + " ");
            }
        }
    }

    private double media(int indice) {
        double soma = 0;
        for (int i = 0; i < notas[indice].length; i++) {
            soma += notas[indice][i];
        }
        double media = (soma / 4);

        return media;
    }

    public boolean verificarAprovacao(int indice) {
        if (media(indice) >= 7) {
            return true;
        }
        return false;
    }

    public void setNomeDisciplinaPos(int pos, String nomeDisciplina) {
        this.disciplinas[pos] = nomeDisciplina;
    }

    public void setNomePosIJ(int posI, int posJ, double nota) {
        this.notas[posI][posJ] = nota;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String[] getDiciplinas() {
        return disciplinas;
    }

    public void setDiciplinas(String[] diciplinas) {
        this.disciplinas = diciplinas;
    }

    public double[][] getNotas() {
        return notas;
    }

    public void setNotas(double[][] notas) {
        this.notas = notas;
    }
}
