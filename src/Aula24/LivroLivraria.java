package Aula24;

import javax.print.attribute.standard.JobKOctets;
import java.util.Date;

public class LivroLivraria {
    String nomeDoLivro;
    String autorDoLivro;
    int paginas;
    int capitulos;
    boolean emprestado;
    Date dataEntrega;
    String emprestadoA;


    public static void main(String[] args) {
        LivroLivraria ficcao = new LivroLivraria();
        ficcao.nomeDoLivro = "Harry Potter";
        ficcao.autorDoLivro = "J. K. Rowling";
        ficcao.paginas = 450;
        ficcao.capitulos = 25;
        ficcao.emprestado = true;
        ficcao.dataEntrega = new Date();
        ficcao.emprestadoA = "Vinicius";


        System.out.println(ficcao.nomeDoLivro);
        System.out.println(ficcao.autorDoLivro);
        System.out.println(ficcao.dataEntrega);


    }
}
