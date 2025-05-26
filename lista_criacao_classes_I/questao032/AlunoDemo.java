package lista_criacao_classes_I.questao032;

public class AlunoDemo{
    public static void main(String[]args){

    Aluno kaue = new Aluno(123, "kaue", 7, 7, 7);

    System.out.println(kaue.media());

    System.out.println(kaue.provaFinal());

    System.out.println(kaue.mediaFinal());

    if(kaue.mediaFinal() >= 5){
        System.out.println("Aprovado");
    } else System.out.print("Reprovado");
    }
}