public class Principal {
    public static void main(String[]args){
        Circulo c1 = new Circulo();
        Quadrado d1 = new Quadrado();
        Triangulo t1 = new Triangulo();

        Desenho ds = new Desenho(c1, d1, 2, 1);
        Desenho ds2 = new Desenho(d1, t1, 4, 7);

        ds.apresenta();
        ds2.apresenta();
    }
}
