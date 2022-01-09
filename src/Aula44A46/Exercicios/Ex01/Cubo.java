package Aula44A46.Exercicios.Ex01;

public class Cubo extends Figura3D implements DimensaoVolumetrica{

    private double lado;

    public Cubo() {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return super.toString() + "Cubo{" +
                "lado=" + lado + "Area = " + calcularVolume()+
                '}';
    }

    @Override
    public double calcularVolume() {
        return lado*lado*lado;
    }
}
