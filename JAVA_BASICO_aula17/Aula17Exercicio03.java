package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Aula17Exercicio03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("### Lê e valida informações ###");

        System.out.print("\nDigite o seu nome: ");
        String nome = scan.nextLine();
        for (; nome.length() < 3; ) {
            System.out.print("\nNome inválido. O nome deve conter 3 ou mais caracteres.");
            System.out.print("\nDigite o seu nome: ");
            nome = scan.nextLine();
        }

        System.out.print("\nDigite a sua idade: ");
        int idade = scan.nextInt();
        if (idade < 0 || idade > 150){
            do {
                System.out.println("\nIdade inválida. A idade deve ficar entre 0 e 150.");
                System.out.print("Digite a sua idade: ");
                idade = scan.nextInt();
            } while (idade < 0 || idade > 150);
        }

        System.out.print("\nDigite o seu salário: ");
        double salario = scan.nextDouble();
        while (salario < 0) {
            System.out.println("\nSalário inválido, o salário deve ser maior que 0.");
            System.out.print("Digite o seu salário: ");
            salario = scan.nextDouble();
        }

        System.out.print("\nDigite o seu sexo (M/F): ");
        String sexo = scan.next().toUpperCase();
        while (!sexo.equals("M") && !sexo.equals("F")) {
            System.out.println("\nSexo inválido, o sexo deve ser M ou F.");
            System.out.print("Digite o seu sexo: ");
            sexo = scan.next().toUpperCase();
        }

        System.out.print("\nDigite o seu estado civil, (S) para solteiro, (C) para casado, (V) para viúvo ou (D) para divorciado: ");
        String estadoCivil = scan.next().toUpperCase();
        while (!estadoCivil.equals("S") && !estadoCivil.equals("C") && !estadoCivil.equals("V") && !estadoCivil.equals("D")) {
            System.out.println("\nEstado civil inválido, o estado civil deve ser S, C, V ou D.");
            System.out.print("Digite o seu estado civil: ");
            estadoCivil = scan.next().toUpperCase();
        }

        System.out.println("\n - - - - - - - - - - - - - - -");
        System.out.println("O nome informado foi: " + nome + ", ele é composto por " + nome.length() + " caracteres.");
        System.out.println("A idade informada foi: " + idade);
        System.out.println("O salário informado foi: R$" + salario);
        if (sexo.equals("M")) {
            System.out.println("O sexo informado foi: Masculino");
        } else {
            System.out.println("O sexo informado foi: Feminino");
        }
        if (estadoCivil.equals("S")) {
            System.out.println("O estado civil informado foi: Solteiro");
        } else if (estadoCivil.equals("C")) {
            System.out.println("O estado civil informado foi: Casado");
        } else if (estadoCivil.equals("V")) {
            System.out.println("O estado civil informado foi: Viúvo");
        } else {
            System.out.println("O estado civil informado foi: Divorciado");
        }

    }
}
