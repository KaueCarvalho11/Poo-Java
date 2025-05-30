package caixa;

public class CaixaBanco{
    private static int clientesAtendidos = 0;
    private int numeroCaixa;

    public CaixaBanco(int numeroCaixa){
        this.numeroCaixa = numeroCaixa;
    }

    public void iniciaAtendimento(){
        clientesAtendidos++;
        System.out.print("Atendendo cliente " + clientesAtendidos + " no caixa " + numeroCaixa);
    }

    public static void imprimeClientes(){
        System.out.println("\nClientes atendidos: " + clientesAtendidos);
    }
}