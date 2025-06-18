package modelagem.tentativa_2;

public class Barco extends Aquatico{
    private int cadBarco;

    public Barco(int capacidade, double profundidade, int cadBarco){
        super(capacidade, profundidade);
        this.cadBarco = cadBarco;
    }

    @Override
    public String toString(){
        return super.toString() + " CadBarco = " + cadBarco;
    }
}