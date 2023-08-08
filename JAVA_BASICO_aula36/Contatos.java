package com.loiane.cursojava.aula36;

public class Contatos {

    private String nome;
    private Endereco endereco;
    private Telefones[] telefones;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Telefones[] getTelefones() {
        return telefones;
    }

    public void setTelefones(Telefones[] telefones) {
        this.telefones = telefones;
    }
}
