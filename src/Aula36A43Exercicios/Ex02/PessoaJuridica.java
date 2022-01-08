package Aula36A43Exercicios.Ex02;

public class PessoaJuridica extends ReceitaFederal{

    private double rendaBruta;

    public PessoaJuridica(double rendaBruta) {
        this.rendaBruta = rendaBruta;
    }

    public double getRendaBruta() {
        return rendaBruta;
    }

    public void setRendaBruta(double rendaBruta) {
        this.rendaBruta = rendaBruta;
    }

    @Override
    public String toString() {
        return super.toString() + " Pessoa Juridica {" +
                " rendaBruta = " + rendaBruta +
                '}';
    }

    public String declararImposto(){
        String s;
        double imposto = 0.1;
        s = "Sua receita bruta corresponde a "+ rendaBruta + '\n';
        s += "O imposto a ser pago é no valor de R$" + (rendaBruta * imposto);
        return s;

    }
}
