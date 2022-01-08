package Aula36A43Exercicios.Ex02;

import javax.sound.midi.Soundbank;

public class PessoaFisica extends ReceitaFederal {

    private double salario;

    public PessoaFisica(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return super.toString() + " Pessoa Fisica {" +
                " Salario=" + salario +
                '}' ;
    }

    public void declararImposto() {

        if (salario <= 1400) {

            System.out.println("Não é necessario o pagamento de imposto");

        } else if (salario > 1400 && salario <= 2100) {

            double imposto = 0.1;
            System.out.println("Voce paga uma aliquota de 10%. O imposto a ser pago será de: R$" + (salario * imposto));

        } else if (salario > 2100 && salario <= 2800) {

            double imposto = 0.15;
            System.out.println("Voce paga uma aliquota de 15%. O imposto a ser pago será de: R$" + (salario * imposto));

        } else if (salario > 2800 && salario <= 3600) {

            double imposto = 0.25;
            System.out.println("Voce paga uma aliquota de 25%. O imposto a ser pago será de: R$" + (salario * imposto));

        } else if (salario > 3600) {

            double imposto = 0.3;
            System.out.println("Voce paga uma aliquota de 30%. O imposto a ser pago será de: R$" + (salario * imposto));

        }
    }
}

