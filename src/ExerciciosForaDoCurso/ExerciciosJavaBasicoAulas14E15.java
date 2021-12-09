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
        /*Exercicio 3
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o seu sexo.M para masculino e F para feminino");
        String sexo = scan.next();
        switch (sexo) {
            case "F" : System.out.println("Você é do sexo feminino.");break;
            case "M" : System.out.println("Você é do sexo masculino.");break;
            default: System.out.println("Valor invalido");break;
        }*/
        /*Exercicio 4
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma letra e descubra se é vogal ou consoante.");
        String letra = scan.next();
        switch (letra){
            case "a":
            case "e":
            case "i":
            case "o":
            case "u": System.out.println("É vogal.");break;
            default: System.out.println("Consoante.");
        }*/
        /*Exercicio 5
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite suas duas notas de 0 a 10.");
        double nota1 = scan.nextDouble();
        double nota2 = scan.nextDouble();
        double resultado = (nota1+nota2)/2;
        if (resultado < 7) {
            System.out.println("Reprovado.");
        } else if (resultado == 10) {
            System.out.println("Aprovado com distinção.");
        } else if (resultado >= 7) {
            System.out.println("Aprovado");
        }*/
        /*Exercicio 7
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite tres numeros");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        if (num1<num2 & num1<num3) {
            System.out.println(num1 + " é o menor.");
        }else if (num2<num3 & num2<num1){
            System.out.println(num2 + " é o menor.");
        }else if (num3<num1 & num3<num2){
            System.out.println(num3 + " é o menor.");
        }if (num1>num2 & num1>num3){
            System.out.println(num1 + " é o maior.");
        }else if(num2>num3 & num2>num1){
            System.out.println(num2 + " é o maior.");
        }else if (num3>num2 & num3>num1){
            System.out.println(num3 + " é o maior.");
        }*/
        /*Exercicio 10
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o turno que vc estuda: M,V ou N.");
        String turno = scan.next();
        switch (turno){
            case "M" : System.out.println("Bom dia !");break;
            case "V" : System.out.println("Boa tarde !");break;
            case "N" : System.out.println("Boa noite !");break;
            default : System.out.println("Valor inválido");
        }*/
        /* Exercicio 11
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o seu salario: ");
        double salario = scan.nextDouble();
        if (salario<=280){
            System.out.println("Seu salario antes do reajuste era de R$" + salario +
                    ", haverá um aumento de 20% no proximo pagamento, o aumento será de R$" + salario*0.20 +
                    ", totalizando R$"+ salario*1.20);
        }else if (salario>280 & salario<=700) {
            System.out.println("Seu salario antes do reajuste era de R$" + salario +
                    ", haverá um aumento de 15% no proximo pagamento, o aumento será de R$" + salario * 0.15 +
                    ", totalizando R$" + salario * 1.15);
        }else if (salario>700 & salario<=1500) {
            System.out.println("Seu salario antes do reajuste era de R$" + salario +
                    ", haverá um aumento de 10% no proximo pagamento, o aumento será de R$" + salario * 0.10 +
                    ", totalizando R$" + salario * 1.10);
        }else if (salario>1500) {
            System.out.println("Seu salario antes do reajuste era de R$" + salario +
                    ", haverá um aumento de 5% no proximo pagamento, o aumento será de R$" + salario * 0.05 +
                    ", totalizando R$" + salario * 1.05);
        }*/
        /*Exercicio 12
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite qual o valor da sua hora e quantas foram as horas trabalhadas no ultimo mês.");
        double precoHora = scan.nextDouble();
        int horasTrabalhadas = scan.nextInt();
        double salarioBruto = precoHora*horasTrabalhadas;
        double fgts = salarioBruto*0.11;
        double sindicato = salarioBruto*0.03;
        double inss = salarioBruto*0.1;

        if (salarioBruto<=900){
            System.out.println("Salario Bruto:  "+precoHora+"*"+horasTrabalhadas+"      R$"+ salarioBruto);
            System.out.println("(-) IR (0%) :          Isento");
            System.out.println("(-) INSS (10%) :      R$" + inss);
            System.out.println("(-) Sindicato (3%) :       R$"+ sindicato);
            System.out.println("FGTS (11%) :          R$"+fgts);
            System.out.println("Total de descontos :    R$"+(inss+sindicato));
            System.out.println("Salario liquido :        R$" + (salarioBruto-inss-sindicato));
        }else if (salarioBruto>900 & salarioBruto<=1500){
            double ir = salarioBruto*0.05;
            System.out.println("Salario Bruto:  "+precoHora+"*"+horasTrabalhadas+"      R$"+ salarioBruto);
            System.out.println("(-) IR (5%) :          R$" + ir);
            System.out.println("(-) INSS (10%) :      R$" + inss);
            System.out.println("(-) Sindicato (3%) :       R$"+ sindicato);
            System.out.println("FGTS (11%) :          R$"+fgts);
            System.out.println("Total de descontos :    R$"+(inss+sindicato+ir));
            System.out.println("Salario liquido :        R$" + (salarioBruto-inss-sindicato-ir));
        }else if (salarioBruto>1500 & salarioBruto<=2500){
            double ir = salarioBruto*0.1;
            System.out.println("Salario Bruto:  "+precoHora+"*"+horasTrabalhadas+"      R$"+ salarioBruto);
            System.out.println("(-) IR (10%) :            R$"+ ir);
            System.out.println("(-) INSS (10%) :      R$" + inss);
            System.out.println("(-) Sindicato (3%) :       R$"+ sindicato);
            System.out.println("FGTS (11%) :          R$"+fgts);
            System.out.println("Total de descontos :    R$"+(inss+sindicato+ir));
            System.out.println("Salario liquido :        R$" + (salarioBruto-inss-sindicato-ir));
        }else if (salarioBruto>2500){
            double ir = salarioBruto*0.2;
            System.out.println("Salario Bruto:  "+precoHora+"*"+horasTrabalhadas+"      R$"+ salarioBruto);
            System.out.println("(-) IR (20%) :          R$"+ ir);
            System.out.println("(-) INSS (10%) :      R$" + inss);
            System.out.println("(-) Sindicato (3%) :       R$"+ sindicato);
            System.out.println("FGTS (11%) :          R$"+fgts);
            System.out.println("Total de descontos :    R$"+(inss+sindicato+ir));
            System.out.println("Salario liquido :        R$" + (salarioBruto-inss-sindicato-ir));
        }*/


    }
}
