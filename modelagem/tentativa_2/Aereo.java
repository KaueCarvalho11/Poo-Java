package modelagem.tentativa_2;

public class Aereo extends Veiculo{
    private int cadNAC;

    public Aereo(int capacidade, int cadNAC){
        super(capacidade);
        this.cadNAC = cadNAC;
    }

    @Override
    public String toString(){
        return super.toString() + " cadNAC = " + cadNAC;
    }
}