package respostas;

public class Aluno{
    public static void main(String[]args){
        int respostas[] = {1, 2, 5, 0, 3, 5, 2, 1, 3, 1, 14};
        int frequencia[] = new int[6];

            for(int resp: respostas){
                try{
                frequencia[resp]++;
                           
                }catch(IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            System.out.println(e);
            System.out.println("Alternativa " + resp + " inválida");
                }
            }

        System.out.println("Resposta\t Frequência");
        for(int i = 0; i < frequencia.length; i ++){
            System.out.println(i + "\t" + frequencia[i]);
        } 
    }
}