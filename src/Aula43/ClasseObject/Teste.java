package Aula43.ClasseObject;

public class Teste {
    public static void main(String[] args) {

        Aluno aluno = new Aluno();

        aluno.setCurso("Ciencia da computação.");
        double[] notas = {10, 9, 8, 7};
        aluno.setNotas(notas);

        System.out.println(aluno);

        String s1 = "sadadaf";
        String s2 = "sadadaF";

        System.out.println(s1.equals(s2));

        Aluno aluno2 = new Aluno();
        aluno.setCurso("Ciencia da computação.");
        double[] notas2 = {10, 9, 8, 7};
        aluno.setNotas(notas2);

        System.out.println(aluno.equals(aluno2));
    }
}
