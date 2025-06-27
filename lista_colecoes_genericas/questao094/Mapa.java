package lista_colecoes_genericas.questao094;

import java.util.TreeMap;
import java.util.Arrays;

public class Mapa{
    public static void main(String[]args){
        TreeMap<String, Integer> mapa = new TreeMap<>();
        String texto = "HELLO THERE";

        String letras[] = texto.split("");
        Arrays.sort(letras);

        for(String letra: letras){
            if(mapa.containsKey(letra)){
                int quantidade = mapa.get(letra); 
                mapa.put(letra, quantidade+1);
            } else mapa.put(letra, 1);
        }

        System.out.println(mapa);
    }
}