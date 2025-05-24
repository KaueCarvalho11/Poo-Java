package lista_criacao_classes_II.questao036;

public class Elevador{
    private int andarAtual;
    private int totalAndares;
    private int capacidade;
    private int pessoasUtilizando;

    public Elevador(int capacidade, int totalAndares){
        this.andarAtual = 1;
        this.totalAndares = totalAndares;
        this.capacidade= capacidade;
        this.pessoasUtilizando = 0;
    }

    public void entra(){
        if(pessoasUtilizando < capacidade) 
            pessoasUtilizando++;
    }

    public void sai(){
        if(pessoasUtilizando >=1)
            pessoasUtilizando--;
    }

    public void sobe(){
        if(andarAtual < totalAndares)
            andarAtual++;
    }

    public void desce(){
        if(andarAtual > 1)
            andarAtual--;
    }

    public String toString(){
        return "\nAndar atual: " + andarAtual + "\nTotal de andares: " + totalAndares + "\nCapacidade: " + capacidade + "\nQuantidade de pessoas utilizando: " + pessoasUtilizando;
    }
}