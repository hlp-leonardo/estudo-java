package com.loiane.cursojava.aula24_25_26_27;

public class LivrosDeBiblioteca extends Livros {

    String estaAlugado;
    String dataDoAluguel;
    String dataDevolucao;
    String nomeCliente;

    public void exibirLivrosDeBiblioteca() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Autor: " + this.autor);
        System.out.println("Quantidade de páginas: " + this.qtdPaginas);
        System.out.println("Ano de lançamento: " + this.anoLancamento);
        System.out.println("Livro está alugado: " + this.estaAlugado);
        System.out.println("Data do aluguel: " + this.dataDoAluguel);
        System.out.println("Data de devolução: " + this.dataDevolucao);
        System.out.println("Alugado para: " + this.nomeCliente);
        System.out.println();

    }

}
