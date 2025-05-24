package lista_criacao_classes_II.questao037;

public class Contador{
    private int valor;

    public Contador(){
        this.valor = 0;
    }

    public void zerar(){
        this.valor = 0;
    }

    public void incrementar(){
        valor++;
    }

    public String toString(){
        return "valor = " + valor;
    }
}