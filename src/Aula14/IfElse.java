package Aula14;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

		/*System.out.println("Entre com sua idade:");

		int idade = scan.nextInt();

		if(idade>=18) {
			System.out.println("E maior de idade !");
		} else {
			System.out.println("Nao e maior de idade !");
		}*/

        System.out.println("Entre com o preco do item");
        double valor = scan.nextDouble();

        if(valor<= 10) {
            System.out.println("Esta barato, pode comprar");}
        else if (valor>10 && valor<15) {
            System.out.println("Voce pode pedir um desconto !");}
        else if (valor>= 15 && valor < 17 ) {
            System.out.println("Pode pesquisar mais");}
        //else valor >= 17


    }
}
