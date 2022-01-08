package Aula34.Exercicios.Ex04;

import java.util.Scanner;

public class TesteConversaoDeUnidadesDeArea {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um valor.");
        int num = scan.nextInt();

        System.out.println(num + " metro(s) quadrado equivale a " + ConversaoDeUnidadesDeArea.metroQuadrado(num) + " pés quadrados.");

        System.out.println(num + " pé(s) quadrado equivale a " +ConversaoDeUnidadesDeArea.peQuadrado(num)+" centimetros quadrados");

        System.out.println(num + " milha(s) quadrada equivale a " +ConversaoDeUnidadesDeArea.milhaQuadrada(num)+" acres");

        System.out.println(num + " acre(s) equivale a " +ConversaoDeUnidadesDeArea.acre(num) + " pés quadrados");

    }
}
