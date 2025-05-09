package lista_introducao_java.questao017;

public class Cidade {
    public static void main(String[]args){
        double populacaoA = 7000;
        double populacaoB = 20000;
        int i;

        for(i = 0; populacaoA < populacaoB; i++){
            populacaoA += populacaoA * 0.035;
            populacaoB += populacaoB * 0.01;
        }
        System.out.print(i + " anos");
    }
}
