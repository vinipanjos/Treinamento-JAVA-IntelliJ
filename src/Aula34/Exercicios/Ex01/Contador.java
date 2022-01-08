package Aula34.Exercicios.Ex01;

public class Contador {

    public Contador() {
        cont++;
    }

    private static int cont;

    public static void incrementar(){
        cont++;
    }
    public static void zerar(){
        cont = 0;
    }
    public static int obterValor(){
        return cont;
    }

}
