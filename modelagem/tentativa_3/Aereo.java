package modelagem.tentativa_3;

public abstract class Aereo extends Veiculo{
    private int cadANAC;

    public Aereo(int capacidade, int cadANAC){
        super(capacidade);
        this.cadANAC = cadANAC;
    }

    @Override
    public String toString(){
        return super.toString() + " cadANAC = " + cadANAC;
    }
}