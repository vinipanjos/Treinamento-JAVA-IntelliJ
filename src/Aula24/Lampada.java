package Aula24;

public class Lampada {
    String marca;
    String modelo;
    int potencia;
    int voltagem;
    int garantiaMeses;
    String[] tipos;
    Boolean tipoAbajur;

    public static void main(String[] args) {
        Lampada lampada = new Lampada();
        lampada.modelo = "a60";
        lampada.voltagem = 127;
        lampada.potencia = 7;
        lampada.tipoAbajur = true;

        lampada.tipos = new String[5];
        lampada.tipos[0] = "Lampeoes";
        lampada.tipos[1] = "Abajur";

    }
}
