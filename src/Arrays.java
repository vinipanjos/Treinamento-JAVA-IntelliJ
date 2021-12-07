

public class Arrays {
    public Arrays() {
    }

    public static void main(String[] args) {
        double tempDia001 = 31.3D;
        double tempDia002 = 32.0D;
        double tempDia003 = 33.7D;
        double tempDia004 = 34.0D;
        double tempDia005 = 33.1D;
        double[] temperaturas = new double[365];
        temperaturas[0] = 31.3D;
        temperaturas[1] = 32.0D;
        temperaturas[2] = 33.7D;
        temperaturas[3] = 34.0D;
        temperaturas[4] = 33.1D;
        System.out.println("O valor da temperatura do dia 1 é: " + temperaturas[0]);
        System.out.println("O tamanho do array: " + temperaturas.length);
        System.out.println("O tamanho do array: ");

        for(int i = 0; i < temperaturas.length; ++i) {
            System.out.println("O valor da temperatura do dia" + (i + 1) + " é: " + temperaturas[i]);
        }

        double[] var16 = temperaturas;
        int var15 = temperaturas.length;

        for(int var14 = 0; var14 < var15; ++var14) {
            double temp = var16[var14];
            System.out.println(temp);
        }

    }
}