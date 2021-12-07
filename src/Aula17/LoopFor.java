package Aula17;

public class LoopFor {
    public static void main(String[] args) {

        for(int i=0; i <= 5 ; i++) {
            System.out.println("Valor de i: "+ i);
        }
        for(int i=5; i > 0 ; i--) {
            System.out.println("Valor de i: "+ i);
        }
//com mais de uma variavel
        for(int i=0, j = 10; i < j; i++, j--) {
            System.out.println("Valor de i: "+ i + " j:"+j);
        }
//partes ausentes
        int count = 0;
        for(; count < 5 ;) {
            System.out.println("valor de count: "+count);
            count +=2;
        }
        for(int cont=0; cont < 10; cont+= 2) {
            System.out.println("valor de cont: "+cont);
        }

//loop infinito for( ; ;){
        //loop sem corpo
        int soma = 0;
        for (int i =1; i<5; soma += i++);
        System.out.println("o valor da soma é:" + soma);

        // loop melhorado muito utilizado com arrays
    }
}

