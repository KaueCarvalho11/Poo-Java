package modelagem.tentativa_2;

public class Aviao extends Aereo{
    private int cadAviao;

    public Aviao(int capacidade, int cadNAC, int cadAviao){
        super(capacidade, cadNAC);
        this.cadAviao = cadAviao;
    }

    public String toString(){
        return super.toString() + " cadAviao = " + cadAviao;
    }
}