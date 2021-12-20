package Aula24;

public class Livro {

    String nome;
    String autor;
    int paginas;
    int capitulos;
    int anoLancamento;

    public static void main(String[] args) {
        Livro livro = new Livro();

        livro.nome = "HarryPotter";
        livro.autor = "J. K. Rowling";
        livro.anoLancamento = 1999;

        System.out.println("Nome do livro = " + livro.nome);
    }

}
