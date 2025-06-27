import java.util.LinkedList;
import java.util.Arrays;

public class Copia{
  public static void main(String[]args){
      LinkedList<Character> lista = new LinkedList<>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'));
      LinkedList<Character> copia = new LinkedList<>();

      for(int i = lista.size() - 1; i >= 0; i--){
        copia.add(lista.get(i));
      }
      System.out.println(lista);
      System.out.println(copia);
  }
}