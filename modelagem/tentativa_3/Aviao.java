package modelagem.tentativa_3;

public class Aviao extends Aereo{
    private int cadAviao;

    public Aviao(int capacidade, int cadANAC, int cadAviao){
        super(capacidade, cadANAC);
        this.cadAviao = cadAviao;
    }

    @Override
    public void moverFrente(){
        System.out.println("Avião está se movendo para frente");
    }

    @Override
    public String toString(){
        return super.toString() + " cadAviao = " + cadAviao;
    }
}