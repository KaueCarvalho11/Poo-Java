package lista_criacao_classes_II.questao042;

public class DemoGenerica{
    public static void main(String[]args){
        Generica <Integer> i1 = new Generica<>(1, 0, 4);
        System.out.println(i1);
        System.out.println(i1.iguais());

        Generica <Double> i2 = new Generica<>(12.0, 24.0, 12.0);
        System.out.println(i2);
        System.out.println(i2.iguais());

        Generica<String> i3 = new Generica<>("show", "show", "show");
        System.out.println(i3);
        System.out.println(i3.iguais());
    }
}