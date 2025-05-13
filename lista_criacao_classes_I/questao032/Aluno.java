package lista_criacao_classes_I.questao032;

import java.text.DecimalFormat;

public class Aluno{
    String matricula;
    String nome;
    double prova1;
    double prova2;
    double trabalho;
    double mediaPonderada;
    double notaNecessaria;
    double mediaFinal;

    Aluno(String matricula, String nome, double prova1, double prova2, double trabalho){

        this.matricula = matricula;
        this.nome = nome;
        this.prova1 = prova1;
        this.prova2 = prova2;
        this.trabalho = trabalho;
    }

    public double media(){
        return(((2.5 * prova1) +(2.5 * prova2) + (2 * trabalho))/7);
    }

    public double provaFinal(){
        if(mediaPonderada < 3 || mediaPonderada >= 7){
            return 0;
        }
         return (50 - 6 * mediaPonderada) / 4; 
    }

    public double mediaFim(){ 
        return ((mediaPonderada * 6) + ((50 - 6 * mediaPonderada)*4))/10;
    }

    public void exibir(){
        DecimalFormat df = new DecimalFormat("#.0");

        System.out.println("Matrícula: " + matricula);
        System.out.println("Nome: " + nome);
        System.out.println("Nota prova 1: " +  prova1);
        System.out.println("Nota prova 2: " + prova2);
        System.out.println("Nota trabalho: " + trabalho);

        mediaPonderada = media();
        System.out.println("Média ponderada: " + df.format(mediaPonderada));

        if(mediaPonderada < 3 || mediaPonderada>= 7){
            System.out.println("Sem necessidade de realizar o exame final");

        } else{
            System.out.println("Vai realizar o exame final");
            notaNecessaria = provaFinal();
            System.out.println("Nota necessária para passar: " + df.format(notaNecessaria));

            mediaFinal = mediaFim();
            System.out.println("Média final: " + df.format(mediaFinal));

            if(mediaFinal >=5){
                System.out.println("Aprovado");
            } else{
                System.out.println("Reprovado");
            }   
        }
    }
}