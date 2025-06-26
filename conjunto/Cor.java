package conjunto;

import java.util.TreeSet;

public class Cor{
    public static void main(String[]args){
        TreeSet<String> cores = new TreeSet<>();
        cores.add("amarelo");
        cores.add("branco");
        cores.add("preto");

        System.out.println(cores);
        System.out.println(cores.headSet("branco"));
        System.out.println(cores.tailSet("branco"));
        System.out.println(cores.first());
        System.out.println(cores.last());
    }
}