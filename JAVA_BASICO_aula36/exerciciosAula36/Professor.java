package com.loiane.cursojava.aula36.exerciciosAula36;

public class Professor {

    private String nomeProfessor;
    private String departamento;
    private String email;

    public String exibirInfoProfessor() {
        return "Professo: " + getNome() + "\nDepartamento: " + getDepartamento() + "\nE-mail: " + getEmail() + "\n";
    }

    public String getNome() {
        return nomeProfessor;
    }

    public void setNome(String nome) {
        this.nomeProfessor = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
