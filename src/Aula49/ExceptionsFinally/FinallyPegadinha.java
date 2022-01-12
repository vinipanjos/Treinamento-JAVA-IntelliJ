package Aula49.ExceptionsFinally;

public class FinallyPegadinha {

    public static void main(String[] args) {

        int[] numeros = {4, 8 , 16, 32, 64, 128};
        int[] denominadores = {2, 0, 4, 8, 0};

        for (int i = 0; i< numeros.length; i++){
            try {
                System.out.println(numeros[i] + "/" + denominadores[i] + " = " + (numeros[i] / denominadores[i]));
            }
            catch (ArithmeticException e1){

                System.out.println("Erro ao dividir por Zero");
                System.exit(0);

            }
            catch (ArrayIndexOutOfBoundsException e2){

                System.out.println("Posição do array invalida");
                System.exit(0);

            }
            finally {
                System.out.println("Essa linha é impressa sempre após o try ou catch");
                System.out.println();
            }
        }
    }
}
