package Aula36.RelacionamentoEntreClassesTemUmETemMuitos.Ex01;

public class Agenda {

    private Contato[] contato;
    private String nome;

    public Agenda() {
    }

    public Agenda(String nome) {
        this.setNome(nome);
    }

    public Contato[] getContato() {
        return contato;
    }

    public void setContato(Contato[] contato) {
        this.contato = contato;
    }

    public String getNome(String nomeAgenda) {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String obterInfo(){
        String info = "Nome = " + nome + "\n";
        if(contato !=null){
            for (Contato c : contato){
                info += c.obterInfo() + "\n";
            }
        }
        return info;
    }
}
