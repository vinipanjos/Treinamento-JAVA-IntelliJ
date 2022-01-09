package Aula25A27Exercicios;

import Aula25A27Exercicios.ContaCorrente;

public class TesteContaCorrente {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();
        conta.numIdentificacao = 123456;
        conta.especial = true;
        conta.saldo = -10;
        conta.limiteEspecial = 500;
        conta.valorEspecialUsado = 0 ;

        conta.consultarSaldo();

        boolean saqueEfetuado = conta.realizarSaque(0);

        if (saqueEfetuado){
            System.out.println("Saque efetuado com sucesso.");
            conta.consultarSaldo();
             }else{
            System.out.println("Não foi possivel realizar saque. Saldo insuficiente.");
        }
        conta.depositar(0);
        conta.consultarSaldo();

        if (conta.verificarUsoChequeEspecial()){
            System.out.println("Usuario está utilizando o cheque-especial.");
        }else {
            System.out.println("Usuario não está utilizando o cheque especial.");
        }
    }
}
