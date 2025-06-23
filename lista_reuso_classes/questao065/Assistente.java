package lista_reuso_classes.questao065;

public class Assistente extends Funcionario{
    private int numeroMatricula;

    public Assistente(String nome, double salario, int numeroMatricula){
        super(nome, salario);
        this.numeroMatricula = numeroMatricula;
    }

    public void setNumeroMatricula(int numeroMatricula){
        this.numeroMatricula = numeroMatricula;
    }

    public int getNumeroMatricula(){
        return numeroMatricula;
    }

    @Override
    public String toString(){
        return super.toString() + " numero de matrícula = " + numeroMatricula;
    }
}