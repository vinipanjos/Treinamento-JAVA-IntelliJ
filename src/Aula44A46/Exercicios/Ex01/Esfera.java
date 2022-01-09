package Aula44A46.Exercicios.Ex01;

public class Esfera extends Figura3D{

    private double raio;

    public Esfera() {
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public String toString() {
        return super.toString() + "Esfera{" +
                "raio=" + raio + " Area = " + areaEsfera() +
                '}';
    }
    public double areaEsfera(){
        return 4*Math.PI*(raio*raio);
    }
}
