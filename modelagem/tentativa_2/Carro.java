package modelagem.tentativa_2;

public class Carro extends Terrestre{
    private String placa;

    public Carro(int capacidade, int qtdRodas, String placa){
        super(capacidade, qtdRodas);
        this.placa = placa;
    }

    @Override
    public String toString(){
        return super.toString() + " placa = " + placa;
    }
}