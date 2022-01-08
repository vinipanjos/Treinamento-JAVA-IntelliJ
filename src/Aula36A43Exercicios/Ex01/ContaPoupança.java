package Aula36A43Exercicios.Ex01;

import java.util.Calendar;

public class ContaPoupança extends ContaBancaria{

    private int diaRendimento;


    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    @Override
    public String toString() {
        return super.toString() + "Conta Poupança " + '\n' +
                "Dia de Rendimento = " + diaRendimento;
    }

    public boolean calcularNovoSaldo(double taxaRendimento) {

        Calendar hoje = Calendar.getInstance();

        if (diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)) {
            //saldo += saldo * taxaRendimento;
            this.setSaldo(this.getSaldo() + (this.getSaldo() * taxaRendimento));
            return true;
        }
        return false;
    }
}
