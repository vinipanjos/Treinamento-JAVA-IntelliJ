package Aula52Exercicio;

public class Contato {

    private static int contador;

    private String nome;
    private String telefone;
    private int id;

    public Contato() {
        contador ++;
        id = contador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Contador de Contato: "+ id  +
                ", Nome: " + nome +
                ", Telefone: " + telefone ;
    }
}
