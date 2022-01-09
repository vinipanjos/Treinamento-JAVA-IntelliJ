package Aula44A46.Exercicios.Ex01;

public class Triangulo extends Figura2D{

    private double base;
    private double altura;

    public Triangulo() {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return super.toString() + "Triangulo{" +
                "base=" + base +
                ", altura=" + altura +" Area = " + areaTriangulo()+
                '}';
    }
    public double areaTriangulo(){

        return (base*altura)/2;
    }
}
