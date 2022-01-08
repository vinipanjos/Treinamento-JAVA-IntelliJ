package Aula34.Exercicios.Ex02;

import java.util.Scanner;

public class TesteCalculadora {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //imprimirTela(Calculadora.soma(scan.nextDouble(),scan.nextDouble()));

        imprimirTela(Calculadora.soma(2,3));

        imprimirTela(Calculadora.subtrair(1,2));

        imprimirTela(Calculadora.multiplicar(1,2));

        imprimirTela(Calculadora.dividir(1,2));

        imprimirTela(Calculadora.elevarAPotencia(4,2));

    }
    static void imprimirTela(double num3){
        System.out.println(num3);
    }
}
