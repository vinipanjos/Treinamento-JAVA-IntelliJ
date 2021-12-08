package ExerciciosForaDoCurso;

import java.util.Scanner;

public class ExerciciosJavaBasicoAulas14E15 {
    public static void main(String[] args) {
        /*Exercicio 1
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite dois numero e vou apresentar o maior.");
        double numero1 = scan.nextDouble();
        double numero2 = scan.nextDouble();
        if (numero1<numero2)
            System.out.println("O maior numero é: "+ numero2);
        else
            System.out.println("O maior numero é: "+ numero1);*/
        /*Exercicio 2
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um valor para saber se é positivo ou negativo.");
        double numero = scan.nextDouble();
        if (numero>=0)
            System.out.println("O numero é positivo.");
        else
            System.out.println("O numero é negativo.");*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o seu sexo.M para masculino e F para feminino");
        String sexo = scan.next();
        switch (sexo) {
            case "F" : System.out.println("Você é do sexo feminino.");break;
            case "M" : System.out.println("Você é do sexo masculino.");break;
            default: System.out.println("Valor invalido");break;
        }
    }
}
