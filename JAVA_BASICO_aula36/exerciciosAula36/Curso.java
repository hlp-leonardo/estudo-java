package com.loiane.cursojava.aula36.exerciciosAula36;

public class Curso {

    private String nomeCurso;
    private String horario;
    private Professor professor;
    private Aluno[] alunos;

    public String exibirInfoCurso() {
        String info = "Nome do curso: " + getNome();
        if (professor != null) {
            info += professor.exibirInfoProfessor();
        }
        System.out.println();
        System.out.println("### Turma ###");
        if (alunos != null) {
            for (Aluno aluno : alunos) {
                if (aluno != null) {
                    info += aluno.exibirInfoAluno();
                    info += "\n";
                }
            }
            info += "\nMédia da Turma: " + exibirMediaTurma();
        }
        return info;
    }

    public double exibirMediaTurma() {
        double soma = 0;
        for (Aluno aluno : alunos) {
            if (aluno != null) {
                soma += aluno.obterMedia();
            }
        }
        return (soma / alunos.length);
    }

    public String getNome() {
        return nomeCurso;
    }

    public void setNome(String nome) {
        this.nomeCurso = nome;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }
}
