package Aula25A27Exercicios;

public class TesteLampada {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();
        lampada.modelo = "a60";
        lampada.voltagem = 127;
        lampada.potencia = 7;
        lampada.tipoAbajur = true;
        lampada.tipos = new String[5];
        lampada.tipos[0] = "Lampeoes";
        lampada.tipos[1] = "Abajur";
        lampada.ligar();
        lampada.mostrarEstado();

        //  System.out.println("Lampada está " + lampada.ligada);
        lampada.desligar();
       // System.out.println("Lampada está " + lampada.ligada);
        lampada.mostrarEstado();
       /* if (lampada.ligada){
            System.out.println("Lampada está ligada.");
        }else {
            System.out.println("Lampada está desligada.");
        }*/

    }
}
