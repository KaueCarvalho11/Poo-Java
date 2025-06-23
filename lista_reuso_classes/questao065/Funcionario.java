package lista_reuso_classes.questao065;

public class Funcionario{
    String nome;
    double salario;

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public void aumentarSalario(double aumento){
        salario += aumento;
    }

    public double ganhoAnual(){
        return salario * 13;
    }

    @Override
    public String toString(){
        return " nome = " + nome + " salario = R$" + salario;
    }
}