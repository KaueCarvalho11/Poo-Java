package lista_reuso_classes.questao065;

public class Tecnico extends Assistente{
    private double bonus;

    public Tecnico(String nome, double salario, int numeroMatricula, double bonus){
        super(nome, salario, numeroMatricula);
        this.bonus = bonus;
    }

    public double ganhoAnual(){
        return (salario + bonus) * 13;
    }

    @Override
    public String toString(){
        return super.toString() + " bonus salarial = " + bonus;
    }
}