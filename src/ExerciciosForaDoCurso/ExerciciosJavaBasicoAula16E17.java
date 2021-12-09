package ExerciciosForaDoCurso;

import java.util.Scanner;

public class ExerciciosJavaBasicoAula16E17 {
    public static void main(String[] args) {

    /*Exercicio 1
        Scanner scan = new Scanner(System.in);
        boolean notaValida = false;
        do {
            System.out.println("Digite sua nota: ");
            double nota = scan.nextDouble();
            if (nota >= 0 && nota <= 10) {
                notaValida = true;
                System.out.println("Sua nota é valida.");
            } else {
                System.out.println("Sua nota é invalida");
            }

        }while (!notaValida);*/
    /*Exercicio 2
        Scanner scan = new Scanner(System.in);
        boolean loginValido = false;
        do {
            System.out.println("Digite seu login e senha:");
            String usuario = scan.next();
            String senha = scan.next();
            if (usuario.equals(senha)){
                System.out.println("Login e senha não podem ser iguais.");
            }else {
                loginValido = true;
                System.out.println("Cadastro feito com sucesso.");
            }
        }while (!loginValido);*/
    /*Exercicio 3
        Scanner scan = new Scanner(System.in);
        boolean invalido = false;
        do {
            System.out.println("Digite o seu nome");
            String nome = scan.next();
            if (nome.length()>=3){
                invalido = true;
            }else
                System.out.println("Nome precisa ter 3 ou mais caracteres.");
        }while (!invalido);
        invalido = false;
        do {
            System.out.println("Digite sua idade:");
            int idade = scan.nextInt();
            if (idade>=0 & idade<150){
                invalido = true;
            }else
                System.out.println("É aceito apenas idades entre 0 e 150 anos.");
        }while (!invalido);
        invalido =false;
        do {
            System.out.println("Digite seu salario:");
            double salario = scan.nextDouble();
            if (salario>0){
                invalido = true;
            }else
                System.out.println("O salario é preciso ser maior que zero.");
        }while (!invalido);
        invalido = false;
        do {
            System.out.println("Digite seu sexo: M ou F");
            String sexo = scan.next();
            if (sexo.equalsIgnoreCase("f")||sexo.equalsIgnoreCase("m")){
                invalido=true;
            }else
                System.out.println("Necessario o preenchimento correto do sexo.");
        }while (!invalido);
        invalido = true;
        do {
            System.out.println("Digite seu estado civil: S, C, V, D");
            String estadoCivil = scan.next();
            if (estadoCivil.equalsIgnoreCase("S")||estadoCivil.equalsIgnoreCase("C")||estadoCivil.equalsIgnoreCase("V")||estadoCivil.equalsIgnoreCase("D")){
                invalido = true;
            }else
                System.out.println("Estado civil invalido.");
        }while (!invalido);*/
        /*exercicio 4
        double pais1 = 80000;
        double pais2 = 200000;
        int tempo = 0;
        while (pais1<=pais2){
            pais1 = pais1*1.03;
            pais2 = pais2*1.015;
            tempo++;
        }
        System.out.println(tempo+" anos");*/
        /*Exercicio 4 tipo B
        double pais1 = 80000;
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
        System.out.println(ano +" "+ pais1+" " + pais2);*/

        /*int contagem = 0;
        while (contagem<=20){
            System.out.println(contagem);
            contagem++;
        }
        contagem=0;
        while (contagem<=20){
            System.out.print(contagem + " - ");
            contagem++;
        }*/
        /*exercicio 6 tipo for
        for (int contagem=0; contagem<=20; contagem++){
            System.out.print(contagem+" ");
        }*/
        /*Exercicio 7
        Scanner scan = new Scanner(System.in);
        int num;
        int numMaior = Integer.MIN_VALUE;
        for (int i = 0; i<5; i++){
            System.out.println("Digite um numero: ");
            num = scan.nextInt();
            if (num>numMaior){
                numMaior = num;
            }
        }
        System.out.println("O maior numero digitado foi: "+ numMaior);*/
        /*Exercicio 8
        Scanner scan = new Scanner(System.in);
        int num;
        int numMaior = 0;
        for (int i = 0; i<5; i++){
            System.out.println("Digite um numero: ");
            num = scan.nextInt();
            numMaior = numMaior+num;
        }
        System.out.println("A soma dos numeros é igual a "+ numMaior + " e a media é "+ numMaior/5);*/
    /*Exercicio9
        int numImpar;
        for (int i=0;i<=50;i++){
            if (i % 2 == 1){
                numImpar = i;
                System.out.print(numImpar+" ");
            }
        }*/
        /*Exercicio 10
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite dois numeros:");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        for (int i = num1; i<(num2-1);){
            System.out.print(++i );
        }*/
        /*Exercicio 11
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite dois numeros:");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int soma = 0;
        for (int i = num1; i <= num2; i++) {
            soma += i;
        }
        System.out.print(soma);*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o numero para apresentarmos a tabuada:");
        int num = scan.nextInt();
        System.out.println("Tabuada de " + num);
        for (int i = 1; i <= 10; i++){
            System.out.println(num + " x " + i + " = " + (num * i ));
        }
    }
}



