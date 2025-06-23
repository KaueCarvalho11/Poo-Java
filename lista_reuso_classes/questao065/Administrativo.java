package lista_reuso_classes.questao065;

public class Administrativo extends Assistente{
    private String turno;

    public Administrativo(String nome, double salario, int numeroMatricula, String turno){
        super(nome, salario, numeroMatricula);
        this.turno = turno; 
    }

    public double ganhoAnual(){
        if(turno == "noite"){
            return ((salario + 150) * 12) + salario;
        } else return salario * 13;
    }

    @Override
    public String toString(){
        return super.toString() + " turno = " + turno;
    }
}