package Aula28A33Exercicios;

public class Lampada {
    private String marca;
    private String modelo;
    private int potencia;
    private int voltagem;
    private int garantiaMeses;
    private String[] tipos;
    private boolean tipoAbajur;
    private boolean ligada;

    public Lampada(){
    }

    public Lampada(String marca, String modelo, int potencia, int voltagem, int garantiaMeses, String[] tipos, boolean tipoAbajur, boolean ligada) {
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
        this.voltagem = voltagem;
        this.garantiaMeses = garantiaMeses;
        this.tipos = tipos;
        this.tipoAbajur = tipoAbajur;
        this.ligada = ligada;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }

    public int getGarantiaMeses() {
        return garantiaMeses;
    }

    public void setGarantiaMeses(int garantiaMeses) {
        this.garantiaMeses = garantiaMeses;
    }

    public String[] getTipos() {
        return tipos;
    }

    public void setTipos(String[] tipos) {
        this.tipos = tipos;
    }

    public boolean isTipoAbajur() {
        return tipoAbajur;
    }

    public void setTipoAbajur(boolean tipoAbajur) {
        this.tipoAbajur = tipoAbajur;
    }

    public boolean isLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    public void ligar(){
        setLigada(true);
    }
    public void desligar(){
        setLigada(false);
    }
    public void mostrarEstado(){
        if (isLigada()){
            System.out.println("Lampada está ligada.");
        }else {
            System.out.println("Lampada está desligada.");
        }
    }
    public void mudarEstado(){
        if (isLigada()){
            desligar();
        }else{
            ligar();
        }
    }

}
