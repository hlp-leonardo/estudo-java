package com.loiane.cursojava.aula24_25_26_27;

//Aula 24 exercício 02

public class Livros {

    String nome;
    String autor;
    int qtdPaginas;
    int anoLancamento;

    public void exibirLivros() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Autor: " + this.autor);
        System.out.println("Quantidade de páginas: " + this.qtdPaginas);
        System.out.println("Ano de lançamento: " + this.anoLancamento);
        System.out.println();
    }

}
