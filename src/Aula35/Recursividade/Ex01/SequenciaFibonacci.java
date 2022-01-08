package Aula35.Recursividade.Ex01;

public class SequenciaFibonacci {

    public static int fibonacci(int num){

        if (num<2){
            return 1;
        }


        return fibonacci(num-1)+fibonacci(num-2);

    }
}
