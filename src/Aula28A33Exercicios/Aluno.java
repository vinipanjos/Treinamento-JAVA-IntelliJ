package Aula28A33Exercicios;

public class Aluno {
    private String nome;
    private String matricula;
    private String curso;
    private String[] disciplina = new String[3];
    private double[] notas = new double[3];

    public Aluno() {
        setDisciplina(new String[3]);
        setNotas(new double[3]);
    }

    public Aluno(String nome, String matricula, String curso) {
        this.setNome(nome);
        this.setMatricula(matricula);
        this.setCurso(curso);
        this.setDisciplina(new String[3]);
        this.setNotas(new double[3]);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String[] getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String[] disciplina) {
        this.disciplina = disciplina;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public void mostrarInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nome do curso: " + curso);

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Notas da disciplina " + disciplina[i] + " é " + notas[i]);
            System.out.println();
        }
    }


        public void mostrarAprovado() {
            for (int i = 0; i <=2; i++) {
                if (notas[i] >= 7) {
                    System.out.println("Aluno aprovado.");
                } else {
                    System.out.println("Aluno reprovado");
                }
                System.out.println();
            }
        }

        public void setDisciplinaPos(int pos, String nomeDisciplina){
            this.disciplina [pos] = nomeDisciplina;
        }
        public void setNotasPos(int posI, double valorNota){
        this.notas [posI] = valorNota;
    }
    }

