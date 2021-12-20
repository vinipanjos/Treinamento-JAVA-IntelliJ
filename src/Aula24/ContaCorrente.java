package Aula24;

public class ContaCorrente {

    int numIdentificacao;
    double saldo;
    double limite;
    boolean especial;

    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();
        conta.numIdentificacao = 123456;
        conta.especial = true;
        conta.saldo = 500;
        conta.limite = 1500;
        System.out.println("Saldo da conta é " + conta.saldo + " reais");

    }

}
