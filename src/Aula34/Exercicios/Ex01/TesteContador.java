package Aula34.Exercicios.Ex01;

public class TesteContador {

    static void imprimirValor(){
        System.out.println(Contador.obterValor());
    }
    public static void main(String[] args) {

        imprimirValor();

        Contador.incrementar();

        imprimirValor();

        Contador.incrementar();

        imprimirValor();

        Contador.zerar();

        imprimirValor();

        Contador c1 = new Contador();
        Contador c2 = new Contador();
        Contador c3 = new Contador();

        imprimirValor();



    }
}
