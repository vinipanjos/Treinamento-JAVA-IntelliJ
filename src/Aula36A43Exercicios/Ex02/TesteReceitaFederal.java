package Aula36A43Exercicios.Ex02;

import java.util.Scanner;

public class TesteReceitaFederal {
    public static void main(String[] args) {

        //Pessoa Fisica

        System.out.println("***Pessoa Fisica***");

        PessoaFisica pessoaFisica1 = new PessoaFisica(1300);
        PessoaFisica pessoaFisica2 = new PessoaFisica(2000);
        PessoaFisica pessoaFisica3 = new PessoaFisica(3700);

        pessoaFisica1.setNome("Vinicius");

        pessoaFisica2.setNome("Luciana");

        pessoaFisica3.setNome("Giulia");

        System.out.println(pessoaFisica1.toString());
        pessoaFisica1.declararImposto();

        System.out.println();

        System.out.println(pessoaFisica2.toString());
        pessoaFisica2.declararImposto();

        System.out.println();

        System.out.println(pessoaFisica3.toString());
        pessoaFisica3.declararImposto();

        System.out.println();

        //Pessoa Juridica

        System.out.println("***Pessoa Juridica***");

        PessoaJuridica pessoaJuridica1 = new PessoaJuridica(100);
        PessoaJuridica pessoaJuridica2 = new PessoaJuridica(2000);
        PessoaJuridica pessoaJuridica3 = new PessoaJuridica(30000);

        pessoaJuridica1.setNome("Victor LTDA");

        pessoaJuridica2.setNome("Dota Virus");

        pessoaJuridica3.setNome("Zip & Amy");

        System.out.println(pessoaJuridica1.toString());
        pessoaJuridica1.declararImposto();

        System.out.println();

        System.out.println(pessoaJuridica2.toString());
        pessoaJuridica2.declararImposto();

        System.out.println();

        System.out.println(pessoaJuridica3.toString());
        pessoaJuridica3.declararImposto();

        //Opcao 2

        ReceitaFederal[] contribuintes = new ReceitaFederal[6];
        contribuintes[0] = pessoaFisica1;
        contribuintes[1] = pessoaFisica2;
        contribuintes[2] = pessoaFisica3;
        contribuintes[3] = pessoaJuridica1;
        contribuintes[4] = pessoaJuridica2;
        contribuintes[5] = pessoaJuridica3;

        for (ReceitaFederal c : contribuintes) {
            System.out.println(c.toString());

        }
    }
}
