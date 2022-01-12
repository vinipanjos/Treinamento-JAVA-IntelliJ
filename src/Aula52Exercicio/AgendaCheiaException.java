package Aula52Exercicio;

public class AgendaCheiaException extends Exception {

    @Override
    public String getMessage() {

        return "Agenda está cheia !";
    }
}
