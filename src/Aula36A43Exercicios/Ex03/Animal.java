package Aula36A43Exercicios.Ex03;

public class Animal {

    private String animal;
    private String comprimento;
    private String patas;
    private String cor;
    private String ambiente;
    private String velocidade;



    public Animal() {

    }


    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public String getComprimento() {
        return comprimento;
    }

    public void setComprimento(String comprimento) {
        this.comprimento = comprimento;
    }

    public String getPatas() {
        return patas;
    }

    public void setPatas(String patas) {
        this.patas = patas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public String getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(String velocidade) {
        this.velocidade = velocidade;
    }

    @Override
    public String toString() {
        return  "-------------------------------" + '\n' +
                " Animal: " + animal + '\n' +
                " Comprimento: " + comprimento + '\n' +
                " Patas: " + patas + '\n' +
                " Cor: " + cor + '\n' +
                " Ambiente: " + ambiente + '\n' +
                " Velocidade: " + velocidade + '\n' ;
    }
}
