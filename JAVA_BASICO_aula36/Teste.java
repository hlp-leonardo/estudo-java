package com.loiane.cursojava.aula36;

public class Teste {
    public static void main(String[] args) {

        Contatos contato1 = new Contatos();
        contato1.setNome("João");

        Endereco endereco1 = new Endereco();
        endereco1.setRua("Rua do João");
        endereco1.setNumero("N/A");
        endereco1.setComplemento("N/A");
        endereco1.setCidade("JoãoCity");
        endereco1.setEstado("JoãoLand");
        endereco1.setCep("22222-222");
        contato1.setEndereco(endereco1);

        Telefones telefone1 = new Telefones();
        telefone1.setTipo("Pessoal");
        telefone1.setDdd("21");
        telefone1.setNumero("98877-6655");

        Telefones telefone2 = new Telefones();
        telefone2.setTipo("Casa");
        telefone2.setDdd("11");
        telefone2.setNumero("97766-5544");

        Telefones[] telefones = new Telefones[2];
        telefones[0] = telefone1;
        telefones[1] = telefone2;

        contato1.setTelefones(telefones);

        System.out.println(contato1.getNome());
        System.out.println(contato1.getTelefones());

        //Confirma se os valores existem ou não, para exibir apenas se existirem prevenindo erro
        //A partir do Java 8 foi adicionado um operador para fazer essa verificação, chamado null safe operator
        if (contato1 != null && contato1.getEndereco() != null) {
            System.out.println(contato1.getEndereco().getCidade());
        }

        /* if do ex. Telefone "tem um"
        if (contato1 != null && contato1.getTelefones() != null) {
            System.out.println(contato1.getTelefones().getNumero());
        }
        */

        // if do ex. Telefone "tem muitos"
        if (contato1 != null && contato1.getTelefones() != null) {
            for (Telefones i : contato1.getTelefones()) {
                System.out.println(i.getDdd() + " " + i.getNumero());
            }
        }

    }
}
