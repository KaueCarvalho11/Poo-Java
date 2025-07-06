package lista_excecoes.questao103;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Meses{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int valor = 0;
        String vetor[] = {"janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};

        System.out.print("Informe um valor inteiro: ");

        try{
            valor = input.nextInt();
        }catch(InputMismatchException e){
            System.out.println("Informe um valor inteiro");
        }
        

        try{
            System.out.println(vetor[valor-1]);
        }catch(IndexOutOfBoundsException e){
            System.out.println("Valor inválido");
        }
        
        input.close();
    }
}