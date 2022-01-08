package Aula34.Exercicios.Ex06;


import java.util.Scanner;

public class TesteConversaoDeUnidadesDeTempo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um valor.");
        int num = scan.nextInt();

        System.out.println(num + " minuto(s) equivale a " + ConversaoDeUnidadesDeTempo.minutoParaSegundo(num) + " segundos.");

        System.out.println(num + " hora(s) equivale a " +ConversaoDeUnidadesDeTempo.horaParaMinuto(num)+" minutos.");

        System.out.println(num + " dia(s)  equivale a " +ConversaoDeUnidadesDeTempo.diaParaHora(num)+" horas");

        System.out.println(num + " semana(s) equivale a " +ConversaoDeUnidadesDeTempo.semanaParaDia(num) + " dias.");

        System.out.println(num + " mês(es) equivale a " +ConversaoDeUnidadesDeTempo.mesParaDia(num) + " dias");

        System.out.println(num + " ano(s) equivale a " + ConversaoDeUnidadesDeTempo.anoParaDia(num) + " dias");

    }
}
