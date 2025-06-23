package lista_reuso_classes.questao064;

public class Main{
    public static void main(String[]args){
        Pessoa kaue = new Pessoa("Kauê", 20);
        System.out.println(kaue);

        Politico bolsonaro = new Politico("Bolsonaro", 65, "mbl");
        System.out.println(bolsonaro);

        Prefeito lula = new Prefeito("Lula", 80, "pt", "Martins");
        System.out.println(lula);

        Governador dilma = new Governador("Dilma", 50, "pdt", "RN");
        System.out.println(dilma);
    }
}