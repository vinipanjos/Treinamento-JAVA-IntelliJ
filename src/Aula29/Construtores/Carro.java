package Aula29.Construtores;

public class Carro {


    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    Carro (){
        System.out.println("Classe carro foi instanciada !");
        numPassageiros = 4;
    }
    Carro(String marca_, String modelo_, int numPassageiros_, double capCombustivel_, double consumoCombustivel_){
        marca = marca_;
        modelo = modelo_;
        numPassageiros = numPassageiros_;
        capCombustivel = capCombustivel_;
        consumoCombustivel = consumoCombustivel_;
    }

    // metodo simples: sem retorno e/ou parametro.
    void exibirAutonomia() {
        System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + " km");
    }

    // metodo com retorno
    double obterAutonomia() {
        System.out.println("Metodo obterAutonomia foi chamado. ");
        return capCombustivel * consumoCombustivel;
    }

    // metodo com parametro
    double calcularCombustivel(double km) {
        double qtdCombustivel = km / consumoCombustivel;

        return qtdCombustivel;
    }
}
