package Aula34.Exercicios.Ex02;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Calculadora {

    public static double soma(double num1, double num2){
        return num1+num2;
    }
    public static double subtrair(double num1, double num2){
        return num1 - num2;
    }
    public static double multiplicar(double num1, double num2){
        return num1*num2;
    }
    public static double dividir(double num1, double num2){
        return num1/num2;
    }
    public static double elevarAPotencia(double num1,int num2){
        return Math.pow(num1, num2);
    }


}
