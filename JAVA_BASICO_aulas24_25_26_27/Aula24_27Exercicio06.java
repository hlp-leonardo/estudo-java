package com.loiane.cursojava.aula24_25_26_27;

public class Aula24_27Exercicio06 {
    public static void main(String[] args) {

        ListaDeContatos contato1 = new ListaDeContatos();
        contato1.nome = "Maria";
        contato1.telefones = new int[3];
        contato1.telefones[0] = 111111111;
        contato1.telefones[1] = 222222222;
        contato1.email = "maria@email.com";
        contato1.endereco = "Rua da Maria nº 1";

        ListaDeContatos contato2 = new ListaDeContatos();
        contato2.nome = "João";
        contato2.telefones = new int[3];
        contato2.telefones[0] = 222222222;
        contato2.email = "joao@email.com";
        contato2.endereco = "Rua do João nº 20";

        ListaDeContatos contato3 = new ListaDeContatos();
        contato3.nome = "João Maria";
        contato3.telefones = new int[3];
        contato3.telefones[0] = 111111111;
        contato3.telefones[1] = 222222222;
        contato3.telefones[2] = 333333333;
        contato3.email = "joao.maria@email.com";
        contato3.endereco = "Rua do João Maria nº 350";

        contato1.exibirListaDeContatos();
        contato2.exibirListaDeContatos();
        contato3.exibirListaDeContatos();

    }
}
