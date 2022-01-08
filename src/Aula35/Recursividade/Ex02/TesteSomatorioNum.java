package Aula35.Recursividade.Ex02;


import java.util.Scanner;

public class TesteSomatorioNum {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero para apresentar o somatorio.");

        int cont = scan.nextInt();


        System.out.print(SomatorioNum.somaNumeros(cont));





    }
}
