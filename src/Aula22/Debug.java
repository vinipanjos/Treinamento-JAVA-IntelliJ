package Aula22;

import java.util.Scanner;

public class Debug {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a,b;

        System.out.println("Digite o primeiro numero.");
        a = scan.nextInt();
        System.out.println("Digite o segundo numero.");
        b = scan.nextInt();

        int somar = somar(a, b);
        int subtrair = subtrair(a, b);
        int multiplicar = multiplicar(a, b);
        int dividir = dividir(a, b);

        System.out.println("Somar:" + somar);
        System.out.println("Subtrair" + subtrair);
        System.out.println("Multiplicar:" + multiplicar);
        System.out.println("Dividir:" + dividir);//nota-se que para dividir é necessario q seja um double



    }
    public static int somar( int a, int b){
        return a + b;
    }
    public static int subtrair( int a, int b){
        return a - b;
    }
    public static int multiplicar( int a, int b){
        return a * b;
    }
    public static int dividir( int a, int b){
        return a / b;
    }

}
