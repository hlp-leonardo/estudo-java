package com.loiane.cursojava.aula24_25_26_27;

//Aula 24 exercício 03

public class LivrosDeLivraria extends Livros {

    double preco;

    public void exibirLivrosDeLivraria() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Autor: " + this.autor);
        System.out.println("Quantidade de páginas: " + this.qtdPaginas);
        System.out.println("Ano de lançamento: " + this.anoLancamento);
        System.out.println("Preço: R$" + this.preco);
        System.out.println();

    }

}
