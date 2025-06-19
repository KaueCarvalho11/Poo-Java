package modelagem.tentativa_3;

public class Barco extends Aquatico{
    public int cadBarco;

    public Barco(int capacidade, double profundidade, int cadBarco){
        super(capacidade, profundidade);
        this.cadBarco = cadBarco;
    }

    @Override
    public void moverFrente(){
        System.out.println(" Barco movendo para frente");
    }

    public String toString(){
        return super.toString() + " CadBarco = " + cadBarco;
    }
}