package modelagem.tentativa_3;

public abstract class Veiculo{
    private int capacidade;

    public Veiculo(int capacidade){
        this.capacidade = capacidade;
    }

    public abstract void moverFrente();

    @Override
    public String toString(){
        return " Capacidade = " + capacidade;
    }
}