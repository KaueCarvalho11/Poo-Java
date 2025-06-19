package pagamento;

public class DemoPagamento{
    public static void main(String []args){
        Fatura f1 = new Fatura(2, 4);
        System.out.println(f1);
        System.out.print(valorPagamento(f1));

        EmpregadoAssalariado emp = new EmpregadoAssalariado("Kaue", 123, 1515);
        System.out.println(emp);
        System.out.print(valorPagamento(emp));
    }

    public static double valorPagamento(Pagavel p){
        return p.valorPagamento();
    }
}