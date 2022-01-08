package Aula34.Exercicios.Ex05;


import java.util.Scanner;

public class TesteConversaoUnidadesDeVolume {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um valor.");
        int num = scan.nextInt();

        System.out.println(num + " litro(s) equivale a " + ConversaoUnidadesDeVolume.litroParaCmCubicos(num) + " centimetros cubicos.");

        System.out.println(num + " metro(s) cubico(s) equivale a " +ConversaoUnidadesDeVolume.metroCubicoParaLitros(num)+" litros");

        System.out.println(num + " metro(s) cubico(s) equivale a " +ConversaoUnidadesDeVolume.metroCubicoParaPesCubicos(num)+" pés cubicos");

        System.out.println(num + " galão americano equivale a " +ConversaoUnidadesDeVolume.galaoAmericanoParaPolegadasCubicas(num) + " polegadas cubicas");

        System.out.println(num + " galão americano equivale a " +ConversaoUnidadesDeVolume.galaoAmericanoParaLitros(num) + " litros");

    }
}
