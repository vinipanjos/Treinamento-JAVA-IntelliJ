package Aula36.RelacionamentoEntreClassesTemUmETemMuitos.Ex02;

import java.util.Scanner;

public class TesteCurso {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o nome do curso: ");
        String nome = scan.nextLine();

        System.out.println("Entre com o turno do curso: ");
        String turno = scan.nextLine();

        System.out.println("Entre com o nome do professor: ");
        String nomeProf = scan.nextLine();

        System.out.println("Entre com o departamento do professor: ");
        String depProf = scan.nextLine();

        System.out.println("Entre com o email do professor: ");
        String emailProf = scan.nextLine();

        Curso curso = new Curso();
        curso.setNome(nome);
        curso.setTurno(turno);

        Professor professor = new Professor();
        professor.setNome(nomeProf);
        professor.setDepartamento(depProf);
        professor.setEmail(emailProf);

        curso.setProfessor(professor);

        System.out.println("---Alunos---");

        Aluno[] alunos = new Aluno[5];
        for (int i = 0; i< alunos.length; i++){

            scan.nextLine();

            System.out.println("Entre com o nome do aluno " + (i+1));
            String nomeAluno = scan.nextLine();

            System.out.println("Entre com a matricula do aluno "+ (i+1));
            String matAluno = scan.nextLine();

            double[] notas = new double[4];
            for (int j = 0; j< notas.length; j++){
                System.out.println("Entre com a nota "+ (j+1));
                notas[j] = scan.nextDouble();
            }
            Aluno aluno = new Aluno();
            aluno.setNome(nomeAluno);
            aluno.setMatricula(matAluno);
            aluno.setNotas(notas);

            alunos[i] = aluno;
        }

        curso.setAluno(alunos);

        System.out.println(curso.obterInfo());
    }
}
