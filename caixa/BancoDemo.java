package caixa;

public class BancoDemo{
    public static void main(String[]args){

        CaixaBanco.imprimeClientes();

            CaixaBanco c1 = new CaixaBanco(1);
            CaixaBanco c2 = new CaixaBanco(2);
            CaixaBanco c3 = new CaixaBanco(3);
            CaixaBanco c4 = new CaixaBanco(4);
            CaixaBanco c5 = new CaixaBanco(5);

            c1.iniciaAtendimento();
            CaixaBanco.imprimeClientes();

            c2.iniciaAtendimento();
            CaixaBanco.imprimeClientes();

            c3.iniciaAtendimento();
            CaixaBanco.imprimeClientes();

            c4.iniciaAtendimento();
            CaixaBanco.imprimeClientes();

            c5.iniciaAtendimento();
            CaixaBanco.imprimeClientes();

            c3.iniciaAtendimento();
            CaixaBanco.imprimeClientes();

    }
}