package tabela;

public class VelFormatada {
    public static void main(String[]args){
        double kmh = 0, mps = 0;

        System.out.println("kmh \t mps");

        while (kmh <= 50){
            System.out.printf("%.2f \t %.2f \n", kmh, mps);

            kmh += 0.5;
            mps = 0.2778*kmh;
        }
    }
}
