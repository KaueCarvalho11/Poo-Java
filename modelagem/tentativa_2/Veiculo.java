package modelagem.tentativa_2;

public class Veiculo{
    private int capacidade;

    public Veiculo(int capacidade){
        this.capacidade = capacidade;
    }

    public void moverFrente(){
        System.out.print("Se movendo para frente");
    }

    @Override
    public String toString(){
        return "Capacidade = " + capacidade;
    }
}