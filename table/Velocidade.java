package table;

import java.text.DecimalFormat;

public class Velocidade {
    public static void main(String[]args){

        DecimalFormat df = new DecimalFormat("00.00");
        double kmh = 0, mps = 0, mlh = 0, pps = 0;

        System.out.println("kmh\tMps\tMlh\tpps\t");

        while(kmh <= 50){
            System.out.print(df.format(kmh) + "\t" + df.format(mps) + "\t" + df.format(mlh) + "\t" + df.format(pps) + "\n");

            kmh += 0.5;
            mps = 0.2778 * kmh;
            mlh = 0.6214 * kmh;
            pps = 0.9113 * kmh;
        }
    }
}
