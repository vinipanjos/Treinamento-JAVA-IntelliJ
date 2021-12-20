package Aula25A27Exercicios;

public class Lampada {
    String marca;
    String modelo;
    int potencia;
    int voltagem;
    int garantiaMeses;
    String[] tipos;
    boolean tipoAbajur;
    boolean ligada;

    void ligar(){
        ligada = true;
    }
    void desligar(){
        ligada = false;
    }
    void mostrarEstado(){
        if (ligada){
            System.out.println("Lampada está ligada.");
        }else {
            System.out.println("Lampada está desligada.");
        }
    }
    void mudarEstado(){
        if (ligada){
            desligar();
        }else{
            ligar();
        }
    }


}
