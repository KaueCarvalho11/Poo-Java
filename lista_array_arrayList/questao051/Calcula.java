package lista_array_arrayList.questao051;

public class Calcula{
    public static int produto(int... numeros){
        int prod = 1;
        for(int n: numeros){
            prod *= n;
        }
        return prod;
    }
}