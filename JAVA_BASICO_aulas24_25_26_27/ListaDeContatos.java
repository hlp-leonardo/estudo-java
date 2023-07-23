package com.loiane.cursojava.aula24_25_26_27;

public class ListaDeContatos {
    String nome;
    int[] telefones;
    String email;
    String endereco;

    void exibirListaDeContatos() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Telefone celular: " + this.telefones[0]);
        System.out.println("Telefone residencial: " + this.telefones[1]);
        System.out.println("Contato de trabalho: " + this.telefones[2]);
        System.out.println("Email: " + this.email);
        System.out.println("Endereço: " + this.endereco);
        System.out.println();
    }
}
