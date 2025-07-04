package respostas;

public class Aluno{
    public static void main(String[]args){
        int respostas[] = {1, 2, 5, 0, 3, 5, 2, 1, 3, 1, 2};
        int frequencia[] = new int[6];

        for(int resp: respostas){
            frequencia[resp]++;
        }

        System.out.println("Resposta\t Frequência");
        for(int i = 0; i < frequencia.length; i ++){
            System.out.println(i + "\t" + frequencia[i]);
        } 
    }
}