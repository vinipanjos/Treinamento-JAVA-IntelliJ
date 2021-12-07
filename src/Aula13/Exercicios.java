package Aula13;

import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            //Atividade4

		/*System.out.println("Digite a nota dos 4 bimestres:");

		double bimestre1 = scan.nextDouble();
		double bimestre2 = scan.nextDouble();
		double bimestre3 = scan.nextDouble();
		double bimestre4 = scan.nextDouble();
		double resultado = bimestre1 + bimestre2 + bimestre3 + bimestre4;
		double media = resultado / 4;

		System.out.println("Sua media e :"+media);*/

            //Atividade5

		/*System.out.println("Digite quantos metros voce quer converter para centimetros:");
		double metros = scan.nextDouble();
		double resultado = metros * 100;
		System.out.println(resultado + " centimetros");*/

            //Atividade 6

		/*System.out.println("Qual o raio de circulo ?");
		double raio = scan.nextDouble();
		double area = raio*raio*3.14;
		System.out.println("Sua area em metros e de :"+ area);*/

            //Atividade 7

		/*System.out.println("Para um quadrado de 4 metros temos sua area:");
		int resultado = 4*4;
		int dobro = resultado * 2;
		System.out.println(resultado + " e seu dobro e: " + dobro);
		*/

            //Atividade 8

		/*System.out.println("Digite quanto voce ganha por hora e quantas horas voce trabalha por mes:");

		double salario = scan.nextDouble();
		double horas = scan.nextDouble();
		double salarioTotal = (salario*horas);
		System.out.println("vc recebe"+ salarioTotal);
		*/

            //Atividade 9

		/*System.out.println("Qual a temperatura a ser convertida para Celsius ?");
		double temp = scan.nextDouble();
		double celsius = 5*(temp-32)/9;
		System.out.println(celsius + "celsius");
        */

            //Atividade 11

		/*System.out.println("Escreva dois numeros inteiros e um real");
		double int1 = scan.nextDouble();
		double int2 = scan.nextDouble();
		double real= scan.nextDouble();
		double desafio1 = int1*2*int2/2;
		double desafio2 = 3*int1 + real;
		double desafio3 = real*real*real;
		System.out.println("a: " + desafio1 + "b: " + desafio2 +"c" + desafio3);
		*/

            //Atividade 12

		/*System.out.println("Digite sua altura para descobrir seu peso ideal : ");
		double altura = scan.nextDouble();
		double peso = (72.7*altura)-58;
	    System.out.println("Seu peso ideal e : " + peso);
	    */

            //Atividade 13

            System.out.println("Digite quanto voce ganha por hora e quantas horas voce trabalha por mes:");
            double salario = scan.nextDouble();
            double horas = scan.nextDouble();
            double salarioBruto = (salario*horas);
            double INSS = salarioBruto*0.11;
            double Imposto = salarioBruto*0.08;
            double salarioLiquido = salarioBruto - INSS - Imposto - (salarioBruto*0.05);
            System.out.println("vc recebe"+ salarioLiquido);










    }
}
