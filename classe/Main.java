package classe;

public class Main {
    public static void main(String[]args){
        System.out.print("Olá, mundo\n");

        Data dt = new Data();

        dt.inicializa(10, 12, 2025);

        dt.mostraData();
    }
}
