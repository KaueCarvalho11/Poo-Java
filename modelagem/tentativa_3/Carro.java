package modelagem.tentativa_3;

public class Carro extends Terrestre{
    private String placa;

    public Carro(int capacidade, int qtdRodas, String placa){
        super(capacidade, qtdRodas);
        this.placa = placa;
    }

    @Override
    public void moverFrente(){
        System.out.println("Carro está se movendo para frente");
    }

    @Override
    public String toString(){
        return super.toString() + " placa = " + placa;
    }
}