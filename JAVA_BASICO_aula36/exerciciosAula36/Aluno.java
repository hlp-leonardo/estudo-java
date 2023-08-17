package com.loiane.cursojava.aula36.exerciciosAula36;

public class Aluno {

    private String nomeAluno;
    private int matricula;
    private double[] notas;

    public String exibirInfoAluno() {
        String info = "\nAluno: " + getNomeAluno() + "\nMatrícula: " + getMatricula() + "\nNotas: ";
                int soma = 0;
                for (double nota : notas) {
                    soma += nota;
                    info += " " + nota;
                }
                double media = (soma / 4);
                info += "\n" + "Média: " + media + " - ";
                if (media >= 7) {
                    info += "Aprovado";
                } else {
                    info += "Reprovado";
                }

        return info;
    }

    public double obterMedia() {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return (soma / 4);
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nome) {
        this.nomeAluno = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
}
