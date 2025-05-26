package lista_criacao_classes_I.questao032;

public class Aluno{
    private int matricula;
    private String nome;
    private double prova1;
    private double prova2;
    private double trabalho;

    public Aluno(int matricula, String nome, double prova1, double prova2, double trabalho){
        this.matricula = matricula;
        this.nome = nome;
        this.prova1 = prova1;
        this.prova2 = prova2;
        this.trabalho = trabalho;
    }

    public double media(){
        return (2.5 * prova1 + 2.5 * prova2 + 2.0 * trabalho)/7;
    }

    public double provaFinal(){
        if(media()<3|| media()>=7){
            return 0;
        }
        else return (50 - 6 * media())/4;
    }

    public double mediaFinal(){
        if (media()>= 7 || media() < 3){
            return media();
        } else return (media() * 6 + (50 - 6 * media())/4)/10;  
    }
}