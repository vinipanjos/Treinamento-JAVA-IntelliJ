package Aula25;
// aula 25, 26 e 27
public class Carro {
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;
// metodo simples: sem retorno e/ou parametro.
    void exibirAutonomia(){
        System.out.println("A autonomia do carro é: " + capCombustivel*consumoCombustivel + " km");
    }
// metodo com retorno
    double obterAutonomia() {
        System.out.println("Metodo obterAutonomia foi chamado. ");
        return capCombustivel * consumoCombustivel;
    }
// metodo com parametro
        double calcularCombustivel(double km){
            double qtdCombustivel = km/consumoCombustivel;

            return qtdCombustivel;

    }
}
