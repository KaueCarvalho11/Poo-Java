package lista_reuso_classes.questao063;

public class LivroBiblioteca extends Livro{
    private int idBiblioteca;

    public LivroBiblioteca(int qtdPag, int idBiblioteca){
        super(qtdPag);
        this.idBiblioteca = idBiblioteca;
    }

    public String toString(){
        return super.toString() + " Identificador da biblioteca = " + idBiblioteca;
    }
}