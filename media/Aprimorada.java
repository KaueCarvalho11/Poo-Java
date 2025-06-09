package media;

public class Aprimorada{
    public static void main(String[]args){
        System.out.println(media(2, 2));
        System.out.println(media(7, 7, 7));
        System.out.println(media(10, 10, 10, 10));

    }
    public static double media(double... numeros){
        double soma = 0;
        for(double d: numeros){
            soma += d;
        }
        return soma/numeros.length;
    }
}