package com.loiane.cursojava.aula36.exerciciosAula36;

public class Agenda {

    private Contatos[] contato;

    public Agenda() { }

    public Contatos[] getContato() {
        return contato;
    }

    public void setContato(Contatos[] contato) {
        this.contato = contato;
    }

    public String exibirInfoAgenda() {
        String info = "Agenda\n";
        if (getContato() != null) {
            for (int i = 0; i < contato.length; i++) {
                info += contato[i].exibirInfoContatos() + "\n";
            }
        }
        return info;
    }
}
