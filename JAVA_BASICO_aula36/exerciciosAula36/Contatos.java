package com.loiane.cursojava.aula36.exerciciosAula36;

public class Contatos {

    private String nome;
    private String telefone;
    private String email;

    public Contatos() { }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String exibirInfoContatos() {
        return "Nome: " + getNome() + ", Telefone: " + getTelefone() + ", E-mail: " + getEmail();
    }
}
