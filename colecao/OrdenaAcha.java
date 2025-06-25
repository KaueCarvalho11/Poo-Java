import java.util.ArrayList;
import java.util.Collections;

public class OrdenaAcha{
    public static void main(String[]args){
        ArrayList<String> cores = new ArrayList();

        cores.add("verde");
        cores.add("lilás");
        cores.add("azul");

        System.out.println(cores);

        Collections.sort(cores);

        System.out.println(cores);

        busca(cores, "verde");
        busca(cores, "amarelo");
        busca(cores, "azul");

    }

    public static void busca(ArrayList<String> list, String alvo){
        if(list.contains(alvo)){
            System.out.println(alvo + " está no ArrayList");
            System.out.println(Collections.binarySearch(list, alvo));
        }
        else System.out.println(alvo + " não está no ArrayList");
    }
}