package lista_reuso_classes.questao064;

public class Politico extends Pessoa{
    private String partido;

    public Politico(String nome, int idade, String partido){
        super(nome, idade);
        this.partido = partido;
    }
    
    public String toString(){
        return super.toString() + " partido = " + partido;
    }
}