package Aula44A46.Exercicios.Ex01;

public class Quadrado extends Figura2D{

    public double lado;

    public Quadrado() {
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
        return super.toString() + "Quadrado{" +
                "lado=" + lado + " area = " + areaQuadrado() +
                '}';
    }
    public double areaQuadrado(){
        return lado*lado;
    }
}
