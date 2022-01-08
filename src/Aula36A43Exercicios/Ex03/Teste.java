package Aula36A43Exercicios.Ex03;

public class Teste {
    public static void main(String[] args) {

        Mamifero camelo = new Mamifero();

        camelo.setAnimal("Camelo");
        camelo.setComprimento("150 cm");
        camelo.setPatas("4");
        camelo.setCor("Amarelo");
        camelo.setAmbiente("Terra");
        camelo.setVelocidade("2.0 m/s");
        camelo.setAlimento("Plantas");

        Peixe tubarao = new Peixe();

        tubarao.setAnimal("Tubarão");
        tubarao.setComprimento("300 cm");
        tubarao.setPatas("0");
        tubarao.setCor("Cinzento");
        tubarao.setAmbiente("Mar");
        tubarao.setVelocidade("1.5 m/s");
        tubarao.setCaracteristica("Barbatanas e cauda");

        Mamifero ursoDoCanada = new Mamifero();

        ursoDoCanada.setAnimal("Urso-do-Canadá");
        ursoDoCanada.setComprimento("180 cm");
        ursoDoCanada.setPatas("4");
        ursoDoCanada.setCor("Vermelho");
        ursoDoCanada.setAmbiente("Terra");
        ursoDoCanada.setVelocidade("1.5 m/s");
        ursoDoCanada.setAlimento("Mel");

        System.out.println("Zoo:");
        System.out.println(camelo.toString());
        System.out.println(tubarao.toString());
        System.out.println(ursoDoCanada.toString());




    }
}
