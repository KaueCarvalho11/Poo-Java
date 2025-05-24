package pi;

import java.text.DecimalFormat;

public class Circulo{
    private double raio;
    private static double pi = 3.14;

    public Circulo(double raio){
        this.raio = raio;
    }

    private double calculaPerimetro(){
        return 2 * pi * raio;
    }

    public String toString(){

        DecimalFormat df = new DecimalFormat("#.00");
        return "raio = " + raio + " pi = " + pi + " perimetro = " + df.format(calculaPerimetro()); 
    }
}