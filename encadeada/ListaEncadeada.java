import java.util.LinkedList;
import java.util.Iterator;
import java.util.Arrays;

public class ListaEncadeada{
    public static void main(String[]args){
        LinkedList<String>cores1 = new LinkedList<>(Arrays.asList("azul", "verde", "amarelo", "vermelho"));
        LinkedList<String>cores2 = new LinkedList<>(Arrays.asList("Branco", "verde", "preto", "azul"));

        System.out.println(cores1);

        remove(cores1, cores2);
        System.out.println(cores1);

    }
    public static void remove(LinkedList<String>lista1, LinkedList<String>lista2){
        String elemento;
        Iterator<String> iterator = lista1.iterator();

        while(iterator.hasNext()){
            elemento = iterator.next();
            if(lista2.contains(elemento)){
                iterator.remove();
            }
        }
    }
}   