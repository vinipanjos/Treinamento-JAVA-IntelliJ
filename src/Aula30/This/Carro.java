package Aula30.This;

public class Carro {

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    public Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        this.capCombustivel = capCombustivel;
        this.consumoCombustivel = consumoCombustivel;
    }

    public Carro() {
    }

    public Carro(String marca, String modelo, int numPassageiros) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        System.out.println("Chamando o construtor com tres parâmetros");
    }

    public Carro(String marca, String modelo) {
        this("Fiat", "Ducato", 10);
        System.out.println("Chamando o construtor com dois parâmetros");
    }




    // metodo simples: sem retorno e/ou parametro.
    void exibirAutonomia() {
        System.out.println("A autonomia do carro é: " + this.capCombustivel * this.consumoCombustivel + " km");
    }

    // metodo com retorno
    double obterAutonomia() {
        System.out.println("Metodo obterAutonomia foi chamado. ");
        return this.capCombustivel * this.consumoCombustivel;
    }

    // metodo com parametro
    double calcularCombustivel(double km) {
        double qtdCombustivel = km / this.consumoCombustivel;

        return qtdCombustivel;
    }
}
