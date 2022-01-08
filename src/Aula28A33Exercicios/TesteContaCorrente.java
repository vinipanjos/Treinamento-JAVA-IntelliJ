package Aula28A33Exercicios;

public class TesteContaCorrente {

    public static void main(String[] args) {

        ContaCorrente conta = new ContaCorrente();
        conta.setNumero("123456");
        conta.setAgencia("123");
        conta.setEspecial(true);
        conta.setSaldo(-10);
        conta.setLimiteEspecial(500);

        System.out.println("Saldo da conta " +  conta.getNumero() + " = " + conta.getSaldo());

        boolean saqueEfetuado = conta.realizarSaque(10);

        if (saqueEfetuado){
            System.out.println("Saque efetuado com sucesso.");
            conta.consultarSaldo();
        }else{
            System.out.println("Não foi possivel realizar saque. Saldo insuficiente.");
        }

        conta.realizarSaque(500);

        if (saqueEfetuado){
            System.out.println("Saque efetuado com sucesso.");
            conta.consultarSaldo();
        }else{
            System.out.println("Não foi possivel realizar saque. Saldo insuficiente.");
        }
        System.out.println("Deposito de 500 reais");
        conta.depositar(500);
        conta.consultarSaldo();

        if (conta.verificarUsoChequeEspecial()){
            System.out.println("Usuario está utilizando o cheque-especial.");
        }else {
            System.out.println("Usuario não está utilizando o cheque especial.");
        }
    }
}
