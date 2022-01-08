package Aula34.VariaveisEMetodosEstaticos;

public class TesteMinhaCalculadora {

    static int resultSoma;

    public static void main(String[] args) {

        MinhaCalculadora.soma(1,2);

        resultSoma = MinhaCalculadora.soma(1,2);

        soma2Valores(1,2);


    }

    static int soma2Valores(int num1, int num2) {
        return MinhaCalculadora.soma(num1,num2);
    }

}
