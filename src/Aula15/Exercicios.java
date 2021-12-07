package Aula15;

import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Exercicio 1

		/*System.out.println("Digite dois numeros :");
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();

		if (num1>num2) {
			System.out.println(num1+" eh maior");
		}else {
			System.out.println(num2+" eh maior");
		}
		*/
        //Exercicio 2

		/*System.out.println("Digite um numero:");
		double num = scan.nextDouble();
		if (num>=0) {
			System.out.println("O numero e positivo");
		} else
			System.out.println("O numero e negativo");
		*/

        //Exercicio 3

		/*System.out.println("Digite a primeira letra do seu sexo");
		String sexo = scan.next();
		switch(sexo) {
		case "F" : System.out.println("Ferminino");break;
		case "M" : System.out.println("Masculino");break;
		default : System.out.println("Sexo invalido");break;
		}
		*/

        //Exercicio 4

		/*System.out.println("Digite uma letra");
		String letra = scan.next();
		switch(letra) {
			case "a" :
			case "e" :
			case "i" :
			case "o" :
			case "u" :System.out.println("vogal"); break;
			default : System.out.println("consoante");
		}
		*/

        //Exercicio 5

		/*System.out.println("Digite duas notas de 1 a 10");
		double nota1=scan.nextDouble();
		double nota2=scan.nextDouble();
		double media= (nota1+nota2)/2;
		if (media == 10) {
			System.out.println("Aprovado com distincao");
		}else if (media<10 & media>=7){
			System.out.println("Aprovado");
		}else if (media<7) {
			System.out.println("Reprovado");
		}*/

        //Exercicio 6

		/*System.out.println("Digite 3 numeros : ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		if (num1>num2 & num1>num3) {
			System.out.println(num1+" e o maior numero");
		}else if (num2>num1 & num2>num3) {
			System.out.println(num2+" e o maior numero");
		}else if (num3>num2 & num3>num1) {
			System.out.println(num3+" e o maior numero");
		}*/

        //Exercicio 7

		/*System.out.println("Digite 3 numeros : ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		if (num1>num2 & num1>num3) {
			System.out.println(num1+" e o maior numero");
		}else if (num2>num1 & num2>num3) {
			System.out.println(num2+" e o maior numero");
		}else if (num3>num2 & num3>num1) {
			System.out.println(num3+" e o maior numero");
		}
		if (num1<num2 & num1<num3) {
			System.out.println(num1+" e o menor numero");
		}else if (num2<num1 & num2<num3) {
			System.out.println(num2+" e o menor numero");
		}else if (num3<num2 & num3<num1) {
			System.out.println(num3+" e o menor numero");
		}*/

        //Exercicio 8 = exercicio 6 e 7

        //Exercicio 9

		/*System.out.println("Digite 3 numeros :");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		if (num1>num2 & num1>num3 & num2>num3) {
			System.out.println(num1+" "+num2+" "+num3);
		}else if (num1>num2 & num1>num3 & num3>num2) {
			System.out.println(num1+" "+num3+" "+num2);
		}else if (num2>num1 & num2>num3 & num3>num1) {
			System.out.println(num2+" "+num3+" "+num1);
		}else if (num2>num1 & num2>num3 & num1>num3) {
			System.out.println(num2+" "+num1+" "+num3);
		}else if (num3>num2 & num3>num1 & num1>num2) {
			System.out.println(num3+" "+num1+" "+num2);
		}else if (num3>num2 & num3>num1 & num2>num1) {
			System.out.println(num3+ " "+num2+" "+num1);
		}*/

        //Exercicio 10

		/*System.out.println("Digite a primeira letra do seu turno:");
		String turno = scan.next();
		switch(turno){
			case "V" : System.out.println("Vespertino");break;
			case "M" : System.out.println("Matutino");break;
			case "N" : System.out.println("Noturno");break;
			default : System.out.println("Turno Inexistente");
		}*/

        //Exercicio 11

		/*System.out.println("Digite seu salario:");
		double salario = scan.nextDouble();
		if(salario <= 280) {
			System.out.println("Salario inicial: "+salario+" com reajuste de 20% equivalente a :"+ salario*0.20+"novo salario de: "+ salario*1.20 );
		} else if(salario > 280 & salario <= 700) {
			System.out.println("Salario inicial: "+salario+" com reajuste de 15% equivalente a :"+ salario*0.15+"novo salario de: "+ salario*1.15 );
		} else if(salario > 700 & salario <= 1500) {
			System.out.println("Salario inicial: "+salario+" com reajuste de 10% equivalente a :"+ salario*0.10+"novo salario de: "+ salario*1.10 );
		} else if(salario > 1500) {
			System.out.println("Salario inicial: "+salario+" com reajuste de 5% equivalente a :"+ salario*0.05+"novo salario de: "+ salario*1.05 );
		}*/

        //Exercicio 12, 13 e 14 sao repetitivos

        //Exercio 15

		/*System.out.println("Informe 3 lados do seu triangulo:");
		double h1 = scan.nextDouble();
		double h2 = scan.nextDouble();
		double h3 = scan.nextDouble();
		if((h1+h2)<=h3 && (h1+h3)<=h2 &&(h2+h3)<=h1) {
			System.out.println("nao eh um triangulo");
		} else if (h1==h2 && h2==h3) {
			System.out.println("triangulo equilatero");
		} else if ((h1 != h2 && h2==h3)|(h2!=h3 && h3==h1)  ) {
			System.out.println("triangulo isosceles");
		} else if (h1!=h2 && h2!=h3) {
			System.out.println("triangulo escaleno");
		}
		*/

        //Exercicio 16

		/*System.out.println("Digite os valores de a, b e c:");
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();
		double equacao = (b*b - (4*a*c));
		double raiz1 = ((-b+Math.sqrt(equacao))/(2*a));
		double raiz2 = ((-b-Math.sqrt(equacao))/(2*a));
		if (a == 0) {
			System.out.println("Nao e uma equacao de segundo grau");
		}else if (equacao<0) {
			System.out.println("Nao possui raizes");
		}else
			System.out.println("sua raiz 1 e raiz 2 sao, respectivamente:"+raiz1+" "+raiz2);
		*/

    }
}
