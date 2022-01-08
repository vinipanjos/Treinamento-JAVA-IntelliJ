package Aula36.RelacionamentoEntreClassesTemUmETemMuitos;

public class TesteContato {
    public static void main(String[] args) {

        Contato contato = new Contato();
        contato.setNome("Vinicius");
        //contato.setEndereco("Rua Quixada");
        //contato.setTelefone("31 98885-4527");

        //relacionamento tem-um endereco
        Endereco end = new Endereco();
        end.setNomerua("Rua Quixada");
        end.setNumero("369");
        end.setComplemento("401");
        end.setCidade("BH");
        end.setEstado("MG");
        end.setPais("Brasil");

        contato.setEndereco(end);

        //relacionamento tem-um telefone e tem-muitos(utiliza-se arrays) telefones

        Telefone tel = new Telefone();
        tel.setTipo("Celular");
        tel.setDdd("31");
        tel.setNumero("98885-4527");

        Telefone tel2 = new Telefone();
        tel2.setTipo("Casa");
        tel2.setDdd("34");
        tel2.setNumero("3821-1061");

        Telefone[] telefones = new Telefone[2];
        telefones[0] =tel;
        telefones[1] = tel2;

        //contato.setTelefones(tel);
        contato.setTelefones(telefones);

        //teste saida no console
        System.out.println(contato.getNome());

        if(contato != null && contato.getEndereco() != null){
            System.out.println(contato.getEndereco().getCidade());
        }

        /*if(contato != null && contato.getTelefone() != null){
            System.out.println(contato.getTelefone().getNumero());
        }*/

        if(contato != null && contato.getTelefones() !=null){
            for (Telefone t: contato.getTelefones()){
                System.out.println(t.getDdd() + " " + t.getNumero());
            }
        }
    }
}
