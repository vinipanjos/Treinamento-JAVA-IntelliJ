package Aula25A27Exercicios;

public class ContaCorrente {
    int numIdentificacao;
    double saldo;
    double limiteEspecial;
    boolean especial;
    double deposito;
    boolean usoLimite;
    double valorEspecialUsado;

    boolean verificarUsoChequeEspecial(){
        return saldo < 0;
    }

    void consultarSaldo(){
        System.out.println("Saldo da conta é:" + saldo);
    }

    void depositar(double valorDepositado){
         saldo += valorDepositado;
    }
    boolean realizarSaque(double quantiaASacar){
         //se tem saldo na conta
         if(saldo>=quantiaASacar){
             saldo -= quantiaASacar;
             return true;

         }else { //se nao tem saldo na conta

             if (especial) {// verificar se o limite especial tem saldo
                 double limite = limiteEspecial + saldo;

                 if (limite >= quantiaASacar) {
                     saldo -= quantiaASacar;
                     return true;
                 } else {
                     return false;
                 }
             } else {
                 return false; //não é especial e não tem limite
             }
         }
     }
}
