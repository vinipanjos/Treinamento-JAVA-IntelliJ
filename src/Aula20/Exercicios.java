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
    /*Exercico 3
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite os valor da matriz de 9 numeros:");
        int[][] matrizTeclado = new int[3][3];
        int qtdPar = 0;
        int qtdImpar = 0;
        for (int i = 0; i < matrizTeclado.length; i++) {
            for (int j = 0; j < matrizTeclado[i].length; j++) {
                matrizTeclado[i][j] = scan.nextInt();

                if (matrizTeclado[i][j] % 2 == 0) {
                    qtdPar++;
                } else {
                    qtdImpar++;
                }
            }
        }
        for (int i = 0; i < matrizTeclado.length; i++) {
            for (int j = 0; j < matrizTeclado[i].length; j++) {
                System.out.print(matrizTeclado[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println("Quantidade numeros pares: " + qtdPar);
        System.out.println("Quantidade numeros impares: "+ qtdImpar);*/
    /*Exercicio4
        Scanner scan = new Scanner(System.in);
        String[][] compromissos = new String[30][24] ;
        boolean sair = false;
        byte opcao;

        while(!sair) {
            System.out.println("Digite 1 para adicionar compromisso.");
            System.out.println("Digite 2 para verificar compromisso.");
            System.out.println("Digite 0 para sair.");

            opcao = scan.nextByte();

            if (opcao == 1) { //adicionar compromisso
                int dia=0;
                boolean diaValido = false;
                while(!diaValido) {
                    System.out.println("Digite o dia:");
                    dia = scan.nextInt();
                    if (dia > 0 && dia <= 31) {
                        diaValido = true;
                    } else {
                        System.out.println("Dia invalido, digite novamente.");
                    }
                }
                int hora=0;
                boolean horaValida = false;
                while (!horaValida) {
                    System.out.println("Digite a hora:");
                    hora = scan.nextInt();
                    if (hora >= 0 && hora <= 24) {
                        horaValida = true;
                    } else {
                        System.out.println("Hora invalida, digite novamente.");
                    }
                }
                dia--;
                System.out.println("Digite seu compromisso:");
                compromissos[dia][hora] = scan.next();



            } else if (opcao == 2) { //consultar compromisso
                int dia=0;
                boolean diaValido = false;
                while(!diaValido) {
                    System.out.println("Digite o dia:");
                    dia = scan.nextInt();
                    if (dia > 0 && dia <= 31) {
                        diaValido = true;
                    } else {
                        System.out.println("Dia invalido, digite novamente.");
                    }
                }
                int hora=0;
                boolean horaValida = false;
                while (!horaValida) {
                    System.out.println("Digite a hora:");
                    hora = scan.nextInt();
                    if (hora >= 0 && hora <= 24) {
                        horaValida = true;
                    } else {
                        System.out.println("Hora invalida, digite novamente.");
                    }
                }
                dia--;
                System.out.println("Seu compromisso é: " + compromissos[dia][hora]);


            } else if (opcao == 0) { //sair do app
                sair = true;

            } else {
                System.out.println("Opção invalida. Digite novamente !");
            }
        }*/
        /*Exercicio 5
        Scanner scan = new Scanner(System.in);
        String[][][] compromissos = new String[12][30][8] ;
        boolean sair = false;
        byte opcao;

        while(!sair) {
            System.out.println("Digite 1 para adicionar compromisso.");
            System.out.println("Digite 2 para verificar compromisso.");
            System.out.println("Digite 0 para sair.");

            opcao = scan.nextByte();

            if (opcao == 1) { //adicionar compromisso
                int mes = 0;
                boolean mesValido = false;
                while (!mesValido) {
                    System.out.println("Digite o mês:");
                    mes = scan.nextInt();
                    if (mes > 0 && mes <= 12) {
                        mesValido = true;
                    } else {
                        System.out.println("Mês invalido, digite novamente.");
                    }
                    int dia = 0;
                    boolean diaValido = false;
                    while (!diaValido) {
                        System.out.println("Digite o dia:");
                        dia = scan.nextInt();
                        if (dia > 0 && dia <= 31) {
                            diaValido = true;
                        } else {
                            System.out.println("Dia invalido, digite novamente.");
                        }
                    }
                    int hora = 0;
                    boolean horaValida = false;
                    while (!horaValida) {
                        System.out.println("Digite a hora:");
                        hora = scan.nextInt();
                        if (hora >= 0 && hora <= 24) {
                            horaValida = true;
                        } else {
                            System.out.println("Hora invalida, digite novamente.");
                        }
                    }
                    dia--;
                    System.out.println("Digite seu compromisso:");
                    compromissos[mes][dia][hora] = scan.next();
                }
            }



            else if (opcao == 2) { //consultar compromisso
                    int mes=0;
                    boolean mesValido = false;
                    while (!mesValido) {
                        System.out.println("Digite o mês:");
                        mes = scan.nextInt();
                        if (mes > 0 && mes <= 12) {
                            mesValido = true;
                        } else {
                            System.out.println("Mês invalido, digite novamente.");
                        }
                    }
                    int dia=0;
                boolean diaValido = false;
                while(!diaValido) {
                    System.out.println("Digite o dia:");
                    dia = scan.nextInt();
                    if (dia > 0 && dia <= 31) {
                        diaValido = true;
                    } else {
                        System.out.println("Dia invalido, digite novamente.");
                    }
                }
                int hora=0;
                boolean horaValida = false;
                while (!horaValida) {
                    System.out.println("Digite a hora:");
                    hora = scan.nextInt();
                    if (hora >= 0 && hora <= 24) {
                        horaValida = true;
                    } else {
                        System.out.println("Hora invalida, digite novamente.");
                    }
                }
                dia--;
                System.out.println("Seu compromisso é: " + compromissos[mes][dia][hora]);


            } else if (opcao == 0) { //sair do app
                sair = true;

            } else {
                System.out.println("Opção invalida. Digite novamente !");
            }
        }*/
        //Exercicio 6
        Scanner scan = new Scanner(System.in);
        char[][] jogoVelha = new char[3][3];

        System.out.println("Jogador 1 = X e o Jogador 2 = O");

        boolean ganhou = false;
        int jogada = 1;
        char sinal;
        int linha = 0, coluna = 0;

        while (!ganhou){

            if (jogada%2 == 1) { //jogador 1
                System.out.println("Vez do jogador 1. Escolha linha e coluna (1-3)");
                sinal = 'X';
            }else{
                System.out.println("Vez do jogador 2. Escolha linha e coluna (1-3)");
                sinal = 'O';
            }
            boolean linhaValida = false;
            while(!linhaValida) {
                System.out.println("Entre com a linha (1, 2 ou 3)");
                linha = scan.nextInt();
                if (linha >= 1 && linha <= 3) {
                    linhaValida = true;
                } else {
                    System.out.println("Entrada invalida, tente novamente.");
                }
            }
                boolean colunaValida = false;
                while(!colunaValida) {
                    System.out.println("Entre com a coluna (1, 2 ou 3)");
                    coluna = scan.nextInt();
                    if (coluna >= 1 && coluna <= 3) {
                        colunaValida = true;
                    } else {
                        System.out.println("Entrada invalida, tente novamente.");
                    }
                }
                linha--;
                coluna--;
                if (jogoVelha[linha][coluna]=='X' || jogoVelha[linha][coluna]=='O' ){
                    System.out.println("Posição posição já usada");
                }else{
                    jogoVelha[linha][coluna] = sinal;
                    jogada++;
                }
                //imprimir tabuleiro
            for (int i = 0; i< jogoVelha.length;i++){
                for (int j = 0; j < jogoVelha[i].length; j++){
                    System.out.print(jogoVelha[i][j] + " | ");
                }
                System.out.println();
            }
            //verificar se tem um ganhador
            if ((jogoVelha[0][0] == 'X' && jogoVelha[0][1] == 'X' && jogoVelha[0][2] == 'X') ||//linha 1
                    (jogoVelha[1][0] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[1][2] == 'X')||//linha 2
                    (jogoVelha[2][0] == 'X' && jogoVelha[2][1] == 'X' && jogoVelha[2][2] == 'X')||//linha 3
                    (jogoVelha[0][0] == 'X' && jogoVelha[1][0] == 'X' && jogoVelha[2][0] == 'X')||//coluna 1
                    (jogoVelha[0][1] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][1] == 'X')||//coluna 2
                    (jogoVelha[0][2] == 'X' && jogoVelha[1][2] == 'X' && jogoVelha[2][2] == 'X')||//coluna3
                    (jogoVelha[0][0] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][2] == 'X')){
                ganhou = true;
                System.out.println("Jogador 1 ganhou.");
            } else if ((jogoVelha[0][0] == 'O' && jogoVelha[0][1] == 'O' && jogoVelha[0][2] == 'O') ||//linha 1
                    (jogoVelha[1][0] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[1][2] == 'O')||//linha 2
                    (jogoVelha[2][0] == 'O' && jogoVelha[2][1] == 'O' && jogoVelha[2][2] == 'O')||//linha 3
                    (jogoVelha[0][0] == 'O' && jogoVelha[1][0] == 'O' && jogoVelha[2][0] == 'O')||//coluna 1
                    (jogoVelha[0][1] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][1] == 'O')||//coluna 2
                    (jogoVelha[0][2] == 'O' && jogoVelha[1][2] == 'O' && jogoVelha[2][2] == 'O')||//coluna3
                    (jogoVelha[0][0] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][2] == 'O')){
                ganhou = true;
                System.out.println("Jogador 2 ganhou.");
            }else if (jogada>9){
                System.out.println("Empate");
                ganhou = true;
            }

        }
    }
}