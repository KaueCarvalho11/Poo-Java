public class Livro {
    private String titulo;
    private String autor;
    private int numeroPaginas;
    private int anoEdicao;

    public Livro(String titulo, String autor, int numeroPaginas, int anoEdicao){
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.anoEdicao = anoEdicao;
    }

    public String qualTitulo(){
        return titulo;
    }

    public String qualAutor(){
        return autor;
    }

    public String toString(){
        return " titulo = " +  titulo + " autor = " + autor + " numero de páginas = " + numeroPaginas + " ano edição = " + anoEdicao;
    }

}
