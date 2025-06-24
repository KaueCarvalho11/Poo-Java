public class DemoLivroDeBiblioteca {
    public static void main(String[]args){
        LivroBiblioteca l = new LivroBiblioteca("it", "Stephen King", 9, 2000, "corredor 3, prateleira E", "Livro de terror");

        System.out.println(l.estaEmprestado());
        l.empresta();
        System.out.println(l.estaEmprestado());
        l.devolve();
        l.localizacao();
        l.descricao();
        System.out.println(l);
    }
}
