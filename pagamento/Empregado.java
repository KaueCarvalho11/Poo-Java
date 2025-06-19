package pagamento;

public abstract class Empregado implements Pagavel{
    private String nome;
    private int carteiraTrabalho;

    public Empregado(String nome, int carteiraTrabalho){
        this.nome = nome;
        this.carteiraTrabalho = carteiraTrabalho;
    }

    @Override
    public String toString(){
        return " nome = " + nome + " Carteira de trabalho" + carteiraTrabalho;
    }
}
