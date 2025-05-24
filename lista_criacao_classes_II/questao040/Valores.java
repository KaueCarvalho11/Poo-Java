package lista_criacao_classes_II.questao040;

public class Valores{
    
    public static int maiorDeDois(int n1, int n2){
        if(n1 > n2) return n1;
        else return n2;
    }

    public static double maiorDeDois(double n1, double n2){
        if(n1 > n2) return n1;
        else return n2;
    }

    public static int maiorDeTres(int n1, int n2, int n3){
        if(n1 > n2 && n1 > n3) return n1;
        else if(n2 > n1 && n2 > n3) return n2;
        else return n3;
    }

    public static double maiorDeTres(double n1, double n2, double n3){
        if(n1 > n2 && n1 > n3) return n1;
        else if(n2 > n1 && n2 > n3) return n2;
        else return n3;
    }

    public static int maiorDeQuatro(int n1, int n2, int n3, int n4){
        if(n1 > n2 && n1 > n3 && n1 > n4) return n1;
        else if(n2 > n1 && n2> n3 && n2 > n4) return n2;
        else if(n3 > n1 && n3 > n2 && n3 > n4) return n3;
        else return n4;
    }

    public static double maiorDeQuatro(double n1, double n2, double n3, double n4){
        if(n1 > n2 && n1> n3 && n1 > n4) return n1;
        else if(n2 > n1 && n2 > n3 && n2 > n4) return n2;
        else if(n3 > n1 && n3 > n2 && n3 > n4) return n3;
        else return n4;
    }

    public static int maiorDeCinco(int n1, int n2, int n3, int n4, int n5){
        if(n1 > n2 && n1 > n3 && n1 > n4 && n1 > n5) return n1;
        else if(n2 > n1 && n2 > n3 && n2 > n4 && n2 > n5) return n2;
        else if(n3 > n1 && n3 > n2 && n3 > n4 && n3 > n5) return n3;
        else if(n4 > n1 && n4 > n2 && n4 > n3 && n4 > n5) return n4;
        else return n5;
    }

    public static double maiorDeCinco(double n1, double n2, double n3, double n4, double n5){
        if(n1 > n2 && n1 > n3 && n1 > n4 && n1 > n5) return n1;
        else if(n2 > n1 && n2 > n3 && n2 > n4 && n2 > n5) return n2;
        else if(n3 > n1 && n3 > n2 && n3 > n4 && n3 > n5) return n3;
        else if(n4 > n1 && n4 > n2 && n4 > n3 && n4 > n5) return n4;
        else return n5;
    }

}
  