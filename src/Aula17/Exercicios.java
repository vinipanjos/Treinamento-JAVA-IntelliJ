package Aula17;

import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Exercicio 1

		/*boolean notaValida = false;
		do {
			System.out.println("Digite a sua nota");
			int nota = scan.nextInt();

			if(nota>=0 && nota<=10) {
				notaValida = true;
				System.out.println("Sua nota é valida");
			}else {
				System.out.println("Sua nota é invalida");
			}
		} while (!notaValida);*/


        //Exercicio 2

		/*boolean incompativel = false;
		do {
			System.out.println("Digite seu login e senha : ");
			String login = scan.next();
			String senha = scan.next();
			if(login.equals(senha) ) {
				System.out.println("Login e senha nao podem ser iguais");
			}else {
				incompativel=true;
				System.out.println("Cadastro feito com sucesso.");
			}
		}while(!incompativel);
		*/

        //Exercicio 3
		/*boolean invalido = false;
		do {
			System.out.println("Digite seu nome");
			String nome = scan.next();
			if(nome.length()>=3) {
				invalido = true;
			}else
				System.out.println("Nome precisa de ter 3 caracteres ou mais.");
		}while (!invalido);
		invalido = false;
		do {
			System.out.println("Digite sua idade");
			int idade = scan.nextInt();
			if(idade>=0 && idade<150) {
				invalido = true;
			}else
				System.out.println("Voce nao poder ter menos de 0 ano e mais de 150");
		}while (!invalido);
		invalido = false;
		do {
			System.out.println("Digite seu salario");
			double salario = scan.nextDouble();
			if(salario>=0) {
				invalido = true;
			}else
				System.out.println("Seu salario precisa ser igual ou maior que 0.");
		}while (!invalido);
		invalido = false;
		do {
			System.out.println("Digite seu sexo");
			String sexo = scan.next();
			if(sexo.equalsIgnoreCase("f")||sexo.equalsIgnoreCase("m")) {
				invalido = true;
			}else
				System.out.println("Voce pode ser apenas F ou M.");
		}while (!invalido);
		invalido = false;
		do {
			System.out.println("Digite seu estado civil");
			String estadoCivil = scan.next();
			if(estadoCivil.equalsIgnoreCase("s")||estadoCivil.equalsIgnoreCase("c")||estadoCivil.equalsIgnoreCase("v")||estadoCivil.equalsIgnoreCase("d")) {
				invalido = true;
			}else
				System.out.println("Voce precisa selecionar c v s ou d");
		}while (!invalido);
			*/
        //Exercicio 4

		/*double pais1 = 80000;
		double pais2 = 200000;
		int ano = 0 ;

			while(pais1<pais2) {
			if (pais1>pais2){
				System.out.println("O ano q a populacao se igualou foi :" + ano);
				}else {
					pais1= pais1*1.03;
					pais2= pais2*1.015;

					ano++;
				}
			}
			System.out.println(ano +" "+ pais1+" " + pais2);
			*/

        //Exercicio 5 é tipo a 4, basta colocar o scan ...

        //Exercicio 6

		/*int cont = 0;
		while(cont<=20) {
			System.out.print(cont++);

		}*/

        //Exercicio 7, 8 sao de mostrar o maior, a media e a soma

        //Exercicio 9

		/*for (int i =1; i<50; i++) {
			if (i%2==0) {
				System.out.println(i);
			}
		}*/

    }
}

