package lista_reuso_classes.questao063;

public class Livro{
    private int qtdPag;

    public Livro(int qtdPag){
        this.qtdPag = qtdPag;
    }

    public String toString(){
        return " Quantidade de páginas = " + qtdPag;
    }
}