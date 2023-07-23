package com.loiane.cursojava.aula24_25_26_27;

public class Aula24_27Exercicio03 {
    public static void main(String[] args) {

        LivrosDeLivraria livro1 = new LivrosDeLivraria();
        livro1.nome = "Drácula";
        livro1.autor = "Bram Stoker";
        livro1.qtdPaginas = 416;
        livro1.anoLancamento = 2014;
        livro1.preco = 15.90;

        LivrosDeLivraria livro2 = new LivrosDeLivraria();
        livro2.nome = "Um Crime no Expresso Oriente";
        livro2.autor = "Agatha Christie";
        livro2.qtdPaginas = 304;
        livro2.anoLancamento = 2016;
        livro2.preco = 19.60;

        LivrosDeLivraria livro3 = new LivrosDeLivraria();
        livro3.nome = "No Início, Eram Dez...";
        livro3.autor = "Agatha Christie";
        livro3.qtdPaginas = 272;
        livro3.anoLancamento = 2020;
        livro3.preco = 12.35;

        livro1.exibirLivrosDeLivraria();
        livro2.exibirLivrosDeLivraria();
        livro3.exibirLivrosDeLivraria();

    }
}
