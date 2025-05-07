package trian;

public class Main {
    public static void main(String[]args){
        Triangulo t1 = new Triangulo();
        t1.inicializa(30, 15, 20, "Escaleno");
        
        Triangulo t2 = new Triangulo();
        t2.inicializa(30, 15, 20, "Escaleno");

        Triangulo t3 = t1;

        System.out.println(t1 == t2);
        System.out.print(t1 == t3); 
    }
}
