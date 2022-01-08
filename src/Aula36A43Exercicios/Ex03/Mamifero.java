package Aula36A43Exercicios.Ex03;

public class Mamifero extends Animal {
    private String alimento;

    public Mamifero() {
        super();
        this.alimento = alimento;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    @Override
    public String toString() {
        return super.toString() +
                " Alimento: " + alimento + '\n';
    }
}

