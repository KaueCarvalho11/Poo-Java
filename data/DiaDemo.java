package data;

public class DiaDemo{
    public static void main(String[]args){
        Dia d = new Dia(-7);

        System.out.println(d.getDia());

        d.setDia(7);

        System.out.println(d.getDia());

        d.setDia(-10);

        System.out.println(d.getDia());
    }
}