package Aula13;

public class OperadoresAritmeticos {
    public static void main(String[] args) {

        int resultado = 1+2;
        System.out.println(resultado);

        resultado = resultado - 1;
        System.out.println(resultado);

        resultado = resultado * 2;
        System.out.println(resultado);

        resultado = resultado / 2;
        System.out.println(resultado);

        resultado = resultado + 8;
        System.out.println(resultado);

        resultado = resultado % 7;
        System.out.println(resultado);

        //3
        resultado++;
        System.out.println(resultado);

        //4
        System.out.println(resultado++);
        // printei o resultado e depois ele adiciona   mais um ao resultado

        //5
        System.out.println(++resultado);
        //e adicionado mais um ao resultado e depois eh printado
        //mesma coisa que resultado = resultado + 1;
        //mesma coisa que resultado += 1;
        //funciona com outros operadores



        String primeiroNome = "Esta e";
        String segundoNome = "uma String concatenada";
        String terceiroNome = primeiroNome + segundoNome;
        System.out.println(terceiroNome);




    }
}
