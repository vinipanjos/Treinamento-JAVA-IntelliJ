package Aula35.Recursividade.Ex02;

public class SomatorioNum {

    public static int somaNumeros(int num){

        if (num<2){
            return 1;
        }


        return num + somaNumeros(num - 1);

    }
}
