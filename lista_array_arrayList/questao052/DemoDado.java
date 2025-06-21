package lista_array_arrayList.questao052;

import java.util.Random;

public class DemoDado {
    public static void main(String[] args) {
        Random rand = new Random();
        int frequencia[] = new int[13];

        for (int i = 0; i < 36000000; i++) {
            int dado1 = rand.nextInt(6) + 1;
            int dado2 = rand.nextInt(6) + 1;
            int soma = dado1 + dado2;
            frequencia[soma]++;
        }

        for (int j = 2; j < frequencia.length; j++) {
            System.out.println(j + "\t" + frequencia[j]);
        }
    }
}