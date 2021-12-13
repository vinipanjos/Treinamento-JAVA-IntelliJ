package Aula19;

import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {

       /*  Exercicio 1
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[5];
        int[] vetorB = new int[vetorA.length];
        for (int i = 0; i < vetorA.length; i++){
            System.out.println("Entre com o valor da posição: " + i);
            vetorA[i] = scan.nextInt();
            vetorB[i] = vetorA[i];
        }
        /*for (int i = 0; i < vetorA.length; i++){

            vetorB[i] = vetorA[i];*/
      /*  System.out.print("Vetor A = ");
        for (int i = 0; i<vetorA.length;i++){
            System.out.print(vetorA[i]);
        }
        System.out.print("Vetor B = ");
        for (int i = 0; i<vetorA.length;i++){
            System.out.print(vetorB[i]);
        }*/
        /*Exercicio 2
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[8];
        int[] vetorB = new int[vetorA.length];
        for (int i = 0; i<vetorA.length; i++){
            vetorA[i] = i+1;
            vetorB[i] = vetorA[i]*2;
            System.out.println("Vetor A ["+i+"] = "+vetorA[i]+" Vetor B ["+i+"] = "+vetorB[i]);
        }*/
        /*Exercicio 3
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[15];
        int[] vetorB = new int[vetorA.length];
        for (int i = 0; i<vetorA.length; i++) {
            vetorA[i] = i + 1;
            vetorB[i] = vetorA[i] * vetorA[i];
            System.out.println("Vetor A [" + i + "] = " + vetorA[i] + " Vetor B [" + i + "] = " + vetorB[i]);
        }*/
        /*Exercicio 4
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[15];
        double[] vetorB = new double[vetorA.length];
        for (int i = 0; i<vetorA.length; i++) {
            vetorA[i] = i + 1;
            vetorB[i] = Math.sqrt(vetorA[i]);
            System.out.println("Vetor A [" + i + "] = " + vetorA[i] + " Vetor B [" + i + "] = " + vetorB[i]);
        }*/
        /*Exercicio 5
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        for (int i = 0; i<vetorA.length; i++) {
            vetorA[i] = i + 1;
            vetorB[i] = vetorA[i]*i;
            System.out.println("Vetor A [" + i + "] = " + vetorA[i] + " Vetor B [" + i + "] = " + vetorB[i]);
        }*/
        /*Exercicio 6
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length];
        for (int i = 0; i<vetorA.length; i++) {
            vetorA[i] = i + 1;
            vetorB[i] = i;
            vetorC[i] = vetorA[i]+vetorB[i];
            System.out.println("Vetor A [" + i + "] = " + vetorA[i] + " Vetor B [" + i + "] = " + vetorB[i] + " Vetor C [" + i + "] = " + vetorC[i]);
        }*/
        /*Exercicio 7
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length];
        for (int i = 0; i<vetorA.length; i++) {
            vetorA[i] = i + 1;
            vetorB[i] = i;
            vetorC[i] = vetorA[i]-vetorB[i];
            System.out.println("Vetor A [" + i + "] = " + vetorA[i] + " Vetor B [" + i + "] = " + vetorB[i] + " Vetor C [" + i + "] = " + vetorC[i]);
        }*/
        /*Exercicio 8
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length];
        for (int i = 0; i<vetorA.length; i++) {
            vetorA[i] = i + 1;
            vetorB[i] = i;
            vetorC[i] = vetorA[i]*vetorB[i];
            System.out.println("Vetor A [" + i + "] = " + vetorA[i] + " Vetor B [" + i + "] = " + vetorB[i] + " Vetor C [" + i + "] = " + vetorC[i]);
        }*/
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        double[] vetorC = new double[vetorA.length];
        for (int i = 0; i<vetorA.length; i++) {
            vetorA[i] = i + 1;
            vetorB[i] = i+5;
            vetorC[i] = vetorA[i]/vetorB[i];
            System.out.println("Vetor A [" + i + "] = " + vetorA[i] + " Vetor B [" + i + "] = " + vetorB[i] + " Vetor C [" + i + "] = " + vetorC[i]);
        }


    }
}
