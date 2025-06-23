package lista_reuso_classes.questao064;

public class Prefeito extends Politico{
    private String cidade;

    public Prefeito(String nome, int idade, String partido, String cidade){
        super(nome, idade, partido);
        this.cidade = cidade;
    }

    public String toString(){
        return super.toString() + " cidade = " + cidade;
    }
}