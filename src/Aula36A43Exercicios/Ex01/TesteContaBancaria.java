package Aula36A43Exercicios.Ex01;


public class TesteContaBancaria {

    public static void main(String[] args) {

        /*
        //Conta Simples
        ContaBancaria contaSimples = new ContaBancaria();
        contaSimples.setNomeCliente("Vinicius Pinheiro");
        contaSimples.setNumConta("123");

        System.out.println(contaSimples);

        realizarDeposito(contaSimples, 100);

        realizarSaque(contaSimples, 50);

        realizarDeposito(contaSimples, 100);

        realizarSaque(contaSimples, 250); */

        /*
        //Conta Poupança
        ContaPoupança contaPoupanca = new ContaPoupança();
        contaPoupanca.setNomeCliente("Victor Pinheiro");
        contaPoupanca.setNumConta("12345");
        contaPoupanca.setDiaRendimento(5);

        System.out.println(contaPoupanca);

        realizarDeposito(contaPoupanca, 100);

        realizarSaque(contaPoupanca, 50);

        if (contaPoupanca.calcularNovoSaldo(0.5)){
            System.out.println("Rendimento aplicado, novo saldo é de = " + contaPoupanca.getSaldo());
        } else{
            System.out.println("Hoje não é dia de rendimento");
        }

        realizarDeposito(contaPoupanca, 100);

        realizarSaque(contaPoupanca, 250);*/

        //Conta Especial
        ContaEspecial contaEspecial = new ContaEspecial();
        contaEspecial.setNomeCliente("Victor Pinheiro");
        contaEspecial.setNumConta("12345");
        contaEspecial.setLimite(500);

        System.out.println(contaEspecial);

        realizarDeposito(contaEspecial, 100);

        realizarSaque(contaEspecial, 50);


        realizarDeposito(contaEspecial, 100);

        realizarSaque(contaEspecial, 250);


    }

    private static void  realizarSaque(ContaBancaria conta, double valor){
        if (conta.sacar(valor)){
            System.out.println("Saque efetuado, novo saldo é de : " + conta.getSaldo());
        }else{
            System.out.println("Saldo insuficiente.");
        }
    }
    private static void  realizarDeposito(ContaBancaria conta, double valor) {
        if (conta.depositar(valor)) {
            System.out.println("Deposito efetuado, novo saldo é de : " + conta.getSaldo());
        }
    }
}

