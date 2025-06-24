public class LivroBiblioteca extends Livro implements ItemBiblioteca{
    private boolean emprestado;
    private String localBiblioteca;
    private String descricao;

    public LivroBiblioteca(String titulo, String autor, int numeroPaginas, int anoEdicao, String localBiblioteca, String descricao){
        super(titulo, autor, numeroPaginas, anoEdicao);
        this.localBiblioteca = localBiblioteca;
        this.descricao = descricao;
    }

    public boolean estaEmprestado(){
        return emprestado;  
    }

    public void empresta(){
        emprestado = true;
    }

    public void devolve(){
        emprestado = false;
    }
    
    public String localizacao(){
        return localBiblioteca;
    }

    public String descricao(){
        return descricao;
    }

    public String toString(){
        return super.toString() +  " localização = " + localBiblioteca + " descrição = " + descricao;
    }
}
