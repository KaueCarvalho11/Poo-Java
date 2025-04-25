package tabela;

public class Velocidade{
    public static void main(String[]args){ 

    double kmh = 0, mps = 0;

    System.out.println("kmh\tmps");

    while(kmh <= 50){
        System.out.println(kmh + "\t" + mps);
        kmh += 0.5;
        mps += kmh * 0.2778;
    }
}}