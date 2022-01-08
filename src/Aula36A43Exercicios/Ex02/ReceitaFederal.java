package Aula36A43Exercicios.Ex02;

public class ReceitaFederal {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Receita Federal {" +
                " Nome = '" + nome + '\'' +
                '}';
    }
}

