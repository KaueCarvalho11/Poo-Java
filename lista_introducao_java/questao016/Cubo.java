package lista_introducao_java.questao016;

public class Cubo{
    public static void main(String[]args){
    int numero = 100;
    int centena;
    int dezena;
    int unidade;
    int cubo;

    do{
        centena = numero / 100;
        dezena = (numero % 100) / 10;
        unidade = (numero % 100) % 10;

        cubo = (int)(Math.pow(centena, 3) + (Math.pow(dezena, 3)) + (Math.pow(unidade, 3)));

        if(cubo == numero){
            System.out.println(numero);
        }
        numero++;

    }while(numero != 1000);
 }
}