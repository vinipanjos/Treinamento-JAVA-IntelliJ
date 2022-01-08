package Aula33.SobrecargaDeMetodosEConstrutores;

public class TesteMinhaCalculadora {
    public static void main(String[] args) {
        MinhaCalculadora calc = new MinhaCalculadora();
        calc.soma(1,2);
        calc.soma(2.3,2.9);
        calc.soma(1,5,9);

    }
}
