package Aula44A46.Exercicios.Ex01;

public class FiguraGeometrica {

    private String nome;
    private String cor;

    public FiguraGeometrica() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "FiguraGeometrica{" +
                "nome='" + nome + '\'' +
                ", cor='" + cor + '\'' +
                '}';
    }
}
