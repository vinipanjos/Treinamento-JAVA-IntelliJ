package Aula45.CastingEInstaceof;

public class Teste2 {

    public static void main(String[] args) {
        Object obj1 = obterString();
        String s1 = (String) obj1;

        Object obj2 = "Minha String";
        String s2 = (String) obj2;

        Object obj3 = obterInteiro();
        String s3 = (String) obj3;

    }
    public static String obterString(){
        return "minha String";
    }
    public static int obterInteiro(){
        return 1;
    }
}
