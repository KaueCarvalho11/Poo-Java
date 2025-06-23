package lista_reuso_classes.questao063;

public class DemoLivro{
    public static void main(String[]args){
        Livro domCasmurro = new Livro(500);
        System.out.println(domCasmurro);
        
        LivroLivraria domQuixote = new LivroLivraria(100, 300);
        System.out.println(domQuixote);

        LivroBiblioteca biblia = new LivroBiblioteca(1000, 123);
        System.out.println(biblia);
    }
}