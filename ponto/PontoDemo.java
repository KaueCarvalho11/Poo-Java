package ponto;

public class PontoDemo {
    public static void main(String[]args){
        Ponto2d p1 = new Ponto2d(1, 2);
        System.out.println(p1);

        Ponto3d p2 = new Ponto3d(3, 4, 5);
        System.out.println(p2);

        Ponto3d p3 = new Ponto3d();
        System.out.print(p3);
    }
}
