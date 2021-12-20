package Aula25A27Exercicios;

import Aula25A27Exercicios.ContaCorrente;

public class TesteContaCorrente {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();
        conta.numIdentificacao = 123456;
        conta.especial = true;
        conta.saldo = 500;
        conta.limite = 1500;
        System.out.println("Saldo da conta é " + conta.saldo + " reais");
        conta.usoChequeEspecial();
    }
}
