package com.loiane.cursojava.aula24_25_26_27;

public class Aula24_27Exercicio02 {
    public static void main(String[] args) {

        Livros livro1 = new Livros();
        livro1.nome = "Drácula";
        livro1.autor = "Bram Stoker";
        livro1.qtdPaginas = 416;
        livro1.anoLancamento = 2014;

        Livros livro2 = new Livros();
        livro2.nome = "Um Crime no Expresso Oriente";
        livro2.autor = "Agatha Christie";
        livro2.qtdPaginas = 304;
        livro2.anoLancamento = 2016;

        Livros livro3 = new Livros();
        livro3.nome = "No Início, Eram Dez...";
        livro3.autor = "Agatha Christie";
        livro3.qtdPaginas = 272;
        livro3.anoLancamento = 2020;

        livro1.exibirLivros();
        livro2.exibirLivros();
        livro3.exibirLivros();

    }
}
