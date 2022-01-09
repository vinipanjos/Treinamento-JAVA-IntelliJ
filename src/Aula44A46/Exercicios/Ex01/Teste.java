package Aula44A46.Exercicios.Ex01;

public class Teste {
    public static void main(String[] args) {

        Circulo circulo = new Circulo();
        circulo.setNome("Circulo");
        circulo.setCor("Vermelho");
        circulo.setRaio(1);
        System.out.println(circulo.toString());

        Quadrado quadrado = new Quadrado();
        quadrado.setNome("Quadrado");
        quadrado.setCor("Verde");
        quadrado.setLado(2);
        System.out.println(quadrado.toString());

        Triangulo triangulo = new Triangulo();
        triangulo.setNome("Triangulo");
        triangulo.setAltura(10);
        triangulo.setBase(10);
        System.out.println(triangulo.toString());

        Cubo cubo = new Cubo();
        cubo.setNome("Cubo");
        cubo.setCor("Marrom");
        cubo.setLado(2);
        System.out.println(cubo.toString());

        Esfera esfera = new Esfera();
        esfera.setNome("Esfera");
        esfera.setCor("Cinza");
        esfera.setRaio(1);
        System.out.println(esfera.toString());

        Piramide piramide = new Piramide();
        piramide.setNome("Piramide");
        piramide.setCor("Bege");
        piramide.setAltura(10);
        piramide.setLadoBase(10);
        System.out.println(piramide.toString());

    }
}
