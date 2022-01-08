package Aula25A27Exercicios;

import java.util.Scanner;
import Aula25A27Exercicios.Aluno;

public class TesteAluno {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.println("Digite o nome do aluno: ");
        aluno.nome = scan.next();
        System.out.println("Digite a matricula: ");
        aluno.matricula = scan.next();
        System.out.println("Digite  o curso: ");
        aluno.curso = scan.next();
                for (int i = 0; i < aluno.disciplina.length; i++) {
            System.out.println("Digite o nome da disciplina: ");
            aluno.disciplina[i] = scan.next();

            System.out.println("Digite a nota:");
            aluno.notas[i] = scan.nextDouble();

        }
        System.out.println("Nome: " + aluno.nome);
        System.out.println("Matricula: " + aluno.matricula);
        System.out.println("Curso: " + aluno.curso);
        for (int i = 0; i <= 2; i++) {
            if (aluno.notas[i] < 7) {
                System.out.println("Disciplina: " + aluno.disciplina[i] + " Nota: " + aluno.notas[i] + ". Está reprovado");
                aluno.mostrarAprovado();
            } else {
                System.out.println("Disciplina: " + aluno.disciplina[i] + " Nota: " + aluno.notas[i] + ". Está aprovado");
                aluno.mostrarAprovado();
            }
            System.out.println();

        }
    }
}
