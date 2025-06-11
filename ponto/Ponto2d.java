package ponto;

public class Ponto2d{
    private double x;
    private double y;

    public Ponto2d(double x, double y){
        this.x = x;
        this.y = y;
    }

    public Ponto2d(){
    }

    public String toString(){
        return " x = " + x + " y = " + y;
    }
}