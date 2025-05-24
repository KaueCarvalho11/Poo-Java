package generica;

public class TuplaDemo{
    public static void main(String[]args){
        Tupla <Integer, Double> t1 = new Tupla<>(11, 11.0);
        Tupla<String, Boolean> t2 = new Tupla<>("Kauê", false);

        System.out.println(t1);
        System.out.println(t2);
    }
}