package modelagem.tentativa_2;

public class Aquatico extends Veiculo{
    private double profundidade;

    public Aquatico(int capacidade, double profundidade){
        super(capacidade);
        this.profundidade = profundidade;
    }
    @Override
    public String toString(){
        return super.toString() + " Profundidade = " + profundidade;
    }
}