package pagamento;

public class EmpregadoAssalariado extends Empregado{
    private double salario;

    public EmpregadoAssalariado(String nome, int carteiraTrabalho, double salario){
        super(nome, carteiraTrabalho);
        this.salario = salario;
    }

    public double valorPagamento(){
        return salario;
    }

    @Override
    public String toString(){
        return super.toString() + " salario = " + salario;
    }
}
