package Aula25;
//aula 25, 26 e 27
import Aula25.Carro;

public class TesteCarro {
    public static void main(String[] args) {
        Aula25.Carro van = new Aula25.Carro();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 10;
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;

        System.out.println(van.marca);
        System.out.println(van.modelo);

        //metodo simples, sem retorno e/ou parametro
        van.exibirAutonomia();

        //metodo com retorno
        double autonomia = van.obterAutonomia();
        System.out.println("A autonomia do carro é: " + autonomia);

        //metodo com parametro
        double qtdCombustivel10 = van.calcularCombustivel(10);
        double qtdCombustivel15 = van.calcularCombustivel(15);
        double qtdCombustivel20 = van.calcularCombustivel(20);
        System.out.println("Quantidade de combustivel 10 :  " + qtdCombustivel10);
        System.out.println("Quantidade de combustivel 15 :  " + qtdCombustivel15);
        System.out.println("Quantidade de combustivel 20 :  " + qtdCombustivel20);


    }
}
