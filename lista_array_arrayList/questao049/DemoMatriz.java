package lista_array_arrayList.questao049;

public class DemoMatriz{
    public static void main(String[]args){
        Matriz mat = new Matriz();

        mat.inicializa();
        mat.imprime();
        System.out.println(mat.determinante());
    }
}