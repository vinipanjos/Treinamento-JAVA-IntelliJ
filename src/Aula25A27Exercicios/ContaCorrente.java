package Aula25A27Exercicios;

public class ContaCorrente {
    int numIdentificacao;
    double saldo;
    double limite;
    boolean especial;
    double saque;
    double deposito;
    boolean usoLimite;

     void depositar(){
         saldo = saldo + deposito;
     }
     void sacar(){
         saldo = saldo - saque;
     }
     void usoChequeEspecial(){
         if (saldo<0){
             usoLimite = true;
             System.out.println("Cliente utilizando cheque-especial.");
         }else{
             usoLimite = false;
             System.out.println("Cliente usando o saldo.");
         }
     }

}
