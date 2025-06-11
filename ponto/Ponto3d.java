package ponto;

public class Ponto3d extends Ponto2d{
    private double z;

    public Ponto3d(double x, double y, double z){
        super(x, y);
        this.z = z;
    }

    public Ponto3d(){
    }

    public String toString(){
        return super.toString() + " z = " + z;
    }
    
}
