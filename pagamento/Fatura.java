package pagamento;

public class Fatura implements Pagavel{
    private double preco;
    private int quantidade;

    public Fatura(double preco, int quantidade){
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public double valorPagamento(){
        return preco * quantidade;
    }

    @Override
    public String toString(){
        return " preco = " + preco + " quantidade = " + quantidade;
    }
}