package com.loiane.cursojava.aula36.exerciciosAula36;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Agenda cadastro = new Agenda();
        Contatos[] contatos = new Contatos[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Cadastro do " + (i + 1) + "º contato.");
            Contatos contatoFor = new Contatos();
            System.out.print("Nome do contato: ");
            contatoFor.setNome(scan.nextLine());
            System.out.print("Número de telefone: ");
            contatoFor.setTelefone(scan.nextLine());
            System.out.print("E-mail do contato: ");
            contatoFor.setEmail(scan.nextLine());
            contatos[i] = contatoFor;
            System.out.println("====================================");
        }
        cadastro.setContato(contatos);

        System.out.println();
        if (cadastro != null) {
            System.out.println(cadastro.exibirInfoAgenda());
        }

    }
}
