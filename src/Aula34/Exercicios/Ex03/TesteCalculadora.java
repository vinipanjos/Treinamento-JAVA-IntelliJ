package Aula34.Exercicios.Ex03;

import java.util.Scanner;

public class TesteCalculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num;

        do{
            System.out.println("Entre com um numero positivo.");
            num = scan.nextInt();
            if(num<0){
                System.out.println("Numero invalido, tente novamente");
            }
        } while(num<0);

        System.out.println(Calculadora.fatorialNaoRecursivo(num));
    }
}
