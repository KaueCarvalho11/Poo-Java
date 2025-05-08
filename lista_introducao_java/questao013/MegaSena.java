package lista_introducao_java.questao013;

import java.text.DecimalFormat;

public class MegaSena {
    public static void main(String[]args){
    int n = 1;
    int contador = 1;
    DecimalFormat df = new DecimalFormat("00");

    for(int i = 0; i < 60; i++){
        System.out.print("|" + df.format(n) + "|" + "\t");
        n++;
        contador++;

        if(contador == 11){
            System.out.print("\n");
            contador = 1;
            }
        }
    }
}
