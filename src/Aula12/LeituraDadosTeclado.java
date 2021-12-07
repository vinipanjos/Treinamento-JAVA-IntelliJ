package Aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

		/*System.out.println("Digite seu nome completo: ");
		String nomeCompleto = scan.nextLine();
		System.out.println("Seu nome completo e:" + nomeCompleto);

		System.out.println("Digite seu primeiro nome: ");
		String primeiroNome = scan.next();
		System.out.println("Seu nome e : " + primeiroNome);

		System.out.println("Digite sua idade : ");
		int idade = scan.nextInt();
		System.out.println("Sua idade e:" + idade);

		System.out.println("Qual sua altura ? ");
		double altura = scan.nextDouble();
		System.out.println("Sua altura e : " + altura + "m");*/

        System.out.println("Digite o seu primeiro nome, idade, altura, quantidade de filhos e se tem animais de estimacao :");
        String primeiroNome = scan.next();
        int idade = scan.nextInt();
        float altura = scan.nextFloat();
        byte qtdFilhos = scan.nextByte();
        boolean temPet = scan.nextBoolean();

        System.out.println("Seu nome e " + primeiroNome + ", tem " + idade + "anos, tem "+ altura+ "m, tem "+ qtdFilhos +"filhos e possui "+temPet+"animais de estimacao");




    }
}
