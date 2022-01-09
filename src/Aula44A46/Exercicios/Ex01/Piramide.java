package Aula44A46.Exercicios.Ex01;

public class Piramide extends Figura3D{

    private double ladoBase;
    private double altura;

    public Piramide() {
        this.ladoBase = ladoBase;
        this.altura = altura;
    }

    public double getLadoBase() {
        return ladoBase;
    }

    public void setLadoBase(double ladoBase) {
        this.ladoBase = ladoBase;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return super.toString() + "Piramide{" +
                "ladoBase=" + ladoBase + " Area = " + areaPiramide() +
                ", altura=" + altura +
                '}';
    }
    public double areaPiramide(){
        return ((ladoBase*ladoBase)*altura)/3;
    }
}
