package Aula25A27Exercicios;

public class Aluno {

    String nome;
    String matricula;
    String curso;
    String[] disciplina = new String[3];
    double[] notas = new double[3];
    boolean aprovado;

    void mostrarAprovado(){
        for(int i = 0; i<= 2; i++){
        if(notas[i] >= 7){
            System.out.println("Aluno aprovado.");
        }else {
            System.out.println("Aluno reprovado");
        }
        }
    }
}
