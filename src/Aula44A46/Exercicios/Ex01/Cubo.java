package Aula44A46.Exercicios.Ex01;

public class Cubo extends Figura3D{

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
                "lado=" + lado + "Area = " + areaCubo()+
                '}';
    }
    public double areaCubo(){
        return lado*lado*lado;
    }
}
