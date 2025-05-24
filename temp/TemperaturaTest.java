package temp;

public class TemperaturaTest{
    public static void main(String[]args){
        Temperatura t = new Temperatura(20);

        System.out.println(t.getValor());

        t.setValor(30);

        System.out.println("Valor após uso do método set: " + t.getValor());

        t.setValor(-1);

        System.out.print("Valor após uso do set passando como argumento um valor negativo: " + t.getValor());
    }
}