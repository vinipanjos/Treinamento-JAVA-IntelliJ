package Aula31.ModificadoresPrivateEPublic;

class Carro {

    public String marca; // fica visivel para outros pacotes
    String modelo;
    int numPassageiros;
    private double capCombustivel; // fica invisivel ate para o mesmo pacote, so é visivel dentro da propria classe.
    double consumoCombustivel;

    // metodo simples: sem retorno e/ou parametro.
    public void exibirAutonomia() {
        System.out.println("A autonomia do carro é: " + this.capCombustivel * this.consumoCombustivel + " km");
    }

    // metodo com retorno
    double obterAutonomia() {
        System.out.println("Metodo obterAutonomia foi chamado. ");
        return this.capCombustivel * this.consumoCombustivel;
    }

    private double divideKMPorConsumoCombustivel(double km){
        return km/this.consumoCombustivel;
    }

    // metodo com parametro
    public double calcularCombustivel(double km) {

        return divideKMPorConsumoCombustivel(km);
    }
}
