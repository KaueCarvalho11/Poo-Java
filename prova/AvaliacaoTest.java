package prova;

public class AvaliacaoTest{
    public static void main(String[]args){
        Avaliacao av = new Avaliacao(20);

        System.out.println(av.getNota());

        av.setNota(85);
        System.out.println(av.getNota());

        av.setNota(110);
        System.out.println(av.getNota());

        av.setNota(95);
        System.out.println(av.getNota());
    }
}