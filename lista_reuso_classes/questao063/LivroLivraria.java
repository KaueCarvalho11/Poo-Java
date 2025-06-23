package lista_reuso_classes.questao063;

public class LivroLivraria extends Livro {
    private double preco;

    public LivroLivraria(int qtdPag, double preco){
        super(qtdPag);
        this.preco = preco;
    }

    public String toString(){
        return super.toString() + " preço = " + preco;
    }
}
