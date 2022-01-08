package Aula36A43Exercicios.Ex03;

public class Peixe extends Animal{

    private String caracteristica;

    public Peixe() {
        super();
        this.caracteristica = caracteristica;

    }

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    @Override
    public String toString() {
        return super.toString() +
                " Caracteristica: " + caracteristica + '\n';
    }
}
