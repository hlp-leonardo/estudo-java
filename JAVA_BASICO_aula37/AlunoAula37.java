package com.loiane.cursojava.aula37;

public class AlunoAula37 extends PessoaAula37 {

    private String curso;
    private String[] notas;

    public double calcularMedia() {
        return 0;
    }

    public boolean verificarAprovado() {
        return false;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String[] getNotas() {
        return notas;
    }

    public void setNotas(String[] notas) {
        this.notas = notas;
    }
}
