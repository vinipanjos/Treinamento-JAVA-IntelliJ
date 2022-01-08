package Aula28A33Exercicios;

import java.util.Scanner;

public class TesteAluno {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.println("Digite o nome do aluno: ");
        aluno.setNome(scan.next());

        System.out.println("Digite a matricula: ");
        aluno.setMatricula(scan.next());

        System.out.println("Digite  o curso: ");
        aluno.setCurso(scan.next());

        for (int i = 0; i < aluno.getDisciplina().length; i++) {
            System.out.println("Digite o nome da disciplina: ");
            aluno.setDisciplinaPos(i, scan.next());

            System.out.println("Digite a nota:");
            aluno.setNotasPos(i, scan.nextDouble());
        }

            aluno.mostrarInfo();
            aluno.mostrarAprovado();


    }
}
