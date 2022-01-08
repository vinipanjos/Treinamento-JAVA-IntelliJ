package Aula40.HerancaEPolimorfismoSobreCargaDeMetodos;

public class Teste {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Pessoa aluno = new Aluno();
        Pessoa professor = new Professor();

        pessoa.setEndereco("Rua 1, num 2");
        aluno.setEndereco("Rua 2, num 3");
        professor.setEndereco("Rua 3, num 4");

        System.out.println(pessoa.obterEtiquetaEndereco());
        System.out.println(aluno.obterEtiquetaEndereco());
        System.out.println(professor.obterEtiquetaEndereco());

    }
}
