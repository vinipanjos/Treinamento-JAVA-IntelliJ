package Aula20;

import java.util.Random;
import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {
        /*Exercicio 1
        int[][] numAleatorios = new int[4][4];

        Random numeroRandom = new Random();

        for (int i = 0; i< numAleatorios.length; i++){
            for (int j=0; j< numAleatorios[i].length;j++){
                numAleatorios[i][j] = numeroRandom.nextInt(9);
                System.out.print(numAleatorios[i][j]+"  ");
            }
            System.out.println();
        }
        int maior = Integer.MIN_VALUE;
        int linha = 0;
        int coluna = 0;
        for (int i = 0; i< numAleatorios.length; i++) {
            for (int j = 0; j < numAleatorios[i].length; j++) {
                if (numAleatorios[i][j] > maior) {
                    maior = numAleatorios[i][j];
                    linha = i;
                    coluna = j;
                }
            }
        }
            System.out.println("O maior numero é : " + maior + " que está localizado na linha e coluna: "+ (linha+1) + " - "+(coluna+1));
         */
        /*Exercicio 2
        int[][] numerosAleatorios = new int[10][10];
        Random numeroRandom = new Random();
        for (int i = 0; i< numerosAleatorios.length;i++){
            for(int j = 0; j<numerosAleatorios[i].length; j++){
                numerosAleatorios[i][j] = numeroRandom.nextInt(9);
                System.out.print(numerosAleatorios[i][j]+ "  ");
            }
            System.out.println();
        }
        int maiorLinha = Integer.MIN_VALUE;
        int menorColuna = 9;
        int maiorColuna = Integer.MIN_VALUE;
        int menorLinha = 9;

        for (int i = 0; i< numerosAleatorios.length;i++){

             if (numerosAleatorios[5][i]>maiorLinha){
                 maiorLinha = numerosAleatorios[5][i];
             }
             if (numerosAleatorios[5][i]<menorLinha) {
                 menorLinha = numerosAleatorios[5][i];
             }
        }
        for (int i = 0; i< numerosAleatorios.length;i++){
             if (numerosAleatorios[i][7]>maiorColuna){
                 maiorColuna = numerosAleatorios[i][7];
             }
             if (numerosAleatorios[i][7]<menorColuna){
                 menorColuna = numerosAleatorios[i][7];
             }
        }
        System.out.println("O maior e menor numero da linha 5 são: " + maiorLinha + " e " + menorLinha );
        System.out.println("O maior e menor numero da coluna 7 são: " + maiorColuna + " e " + menorColuna );*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite os valor da matriz de 9 numeros:");
        int[][] matrizTeclado = new int[3][3];
        int par = 0;
        int impar = 0;
        for (int i = 0; i < matrizTeclado.length; i++) {
            for (int j = 0; j < matrizTeclado[i].length; j++) {
                matrizTeclado[i][j] = scan.nextInt();

                if (matrizTeclado[i][j] % 2 == 0) {
                    par++;
                } else {
                    impar++;
                }
            }
        }
        for (int i = 0; i < matrizTeclado.length; i++) {
            for (int j = 0; j < matrizTeclado[i].length; j++) {
                System.out.print(matrizTeclado[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println("Quantidade numeros pares: " + par);
        System.out.println("Quantidade numeros impares: "+ impar);
    }
}

