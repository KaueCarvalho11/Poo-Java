package tabuleiro;

public class DamaDemo {
    public static void main(String[]args){
        Dama d1 = new Dama();
        System.out.print(d1 + "\n");

        d1.inicializaPreta();
        System.out.print(d1 + "\n");

        d1.inicializaBranca();
        System.out.print(d1 + "\n");
    }
}
