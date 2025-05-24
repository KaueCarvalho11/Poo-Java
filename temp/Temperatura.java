package temp;

public class Temperatura{
    private double valor;

    public Temperatura(double valor){
        this.valor = valor;
    }

    public void setValor(double valor){
        if(valor >= 1){
            this.valor = valor;
        }
    }

    public double getValor(){
        return valor;
    }
}