package empresa;

public class Funcionario extends Pessoa{
    private double salario;

    public Funcionario(String nome, int identidade, double salario){
        super(nome, identidade);
        this.salario = salario;
    }

    public double getSalario(){
        return salario;
    }

    @Override
    public String toString(){
        return super.toString() + " salario = R$" + salario;
    }
}