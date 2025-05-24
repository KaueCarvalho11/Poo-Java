package lista_criacao_classes_II.questao040;

public class DemoValores{
    public static void main(String[]args){
          
        System.out.println(Valores.maiorDeDois(1, 2));
        System.out.println(Valores.maiorDeDois(10.39, 2.0));
        System.out.println(Valores.maiorDeTres(5, 7, 6));
        System.out.println(Valores.maiorDeTres(9.0, 8.3, 4.9));
        System.out.println(Valores.maiorDeQuatro(1, 2, 6, 4));
        System.out.println(Valores.maiorDeQuatro(1.0, 6.0, 2.4, 4.5));
        System.out.println(Valores.maiorDeCinco(1, 2, 4, 5, 101));
        System.out.println(Valores.maiorDeCinco(1.1, 1001.5, 2.2, 4.4, 5.6));
    }
}