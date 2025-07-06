package lista_excecoes.questao103;
import java.util.Scanner;

public class Meses{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int valor;
        String vetor[] = {"janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};

        System.out.print("Informe um valor inteiro: ");
        valor = input.nextInt();

        System.out.println(vetor[valor-1]);
        input.close();
    }
}