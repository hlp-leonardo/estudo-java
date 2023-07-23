package com.loiane.cursojava.aula24_25_26_27;

import java.util.Date;

public class Aula24_27Exercicio04 {
    public static void main(String[] args) {

        LivrosDeBiblioteca livro1 = new LivrosDeBiblioteca();
        livro1.nome = "Drácula";
        livro1.autor = "Bram Stoker";
        livro1.qtdPaginas = 416;
        livro1.anoLancamento = 2014;
        livro1.estaAlugado = "Não";
        livro1.dataDoAluguel = "N/A";
        livro1.dataDevolucao = "N/A";
        livro1.nomeCliente = "N/A";

        LivrosDeBiblioteca livro2 = new LivrosDeBiblioteca();
        livro2.nome = "Um Crime no Expresso Oriente";
        livro2.autor = "Agatha Christie";
        livro2.qtdPaginas = 304;
        livro2.anoLancamento = 2016;
        livro2.estaAlugado = "Sim";
        livro2.dataDoAluguel = "12/05/2023";
        livro2.dataDevolucao = "19/05/2023";
        livro2.nomeCliente = "Pedro";

        LivrosDeBiblioteca livro3 = new LivrosDeBiblioteca();
        livro3.nome = "No Início, Eram Dez...";
        livro3.autor = "Agatha Christie";
        livro3.qtdPaginas = 272;
        livro3.anoLancamento = 2020;
        livro3.estaAlugado = "Sim";
        livro3.dataDoAluguel = "20/07/2023";
        livro3.dataDevolucao = "27/07/2023";
        livro3.nomeCliente = "Tiago";

        livro1.exibirLivrosDeBiblioteca();
        livro2.exibirLivrosDeBiblioteca();
        livro3.exibirLivrosDeBiblioteca();

    }
}
