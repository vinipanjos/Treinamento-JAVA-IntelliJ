package Aula36A43Exercicios.Ex01;

public class ContaEspecial extends ContaBancaria {

    private double limite;

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public String toString() {
        return super.toString() + "Conta Especial " +
                " limite = " + limite ;
    }
    public boolean sacar (double valor) {

        double saldoComLimite = this.getSaldo() + limite;

        if ((saldoComLimite - valor) >= 0){
            this.setSaldo(this.getSaldo()-valor);
            System.out.println("Saque concluido, seu saldo com limite agora é : " + (getSaldo() + limite));
            return true;
        }
        return false;
    }
}

