package lista_introducao_java.questao021;

/*
 Permitir entrada via teclado
 Esse numero será passado como parâmetro para a função recursiva, para que, nas condicionais, ele possa se dividir,sendo no segundo parâmetro decrementado
 A ideia é dividir o número por ele mesmo e por todos os números anteriores a ele
 */

 import java.util.Scanner;

public class Primo {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int numero;
        boolean ehPrimo;

        System.out.print("Informe um número maior que 1: ");
        numero = scanner.nextInt();

        scanner.close();

        ehPrimo = primo(numero, numero);

        System.out.print(numero + " é primo? " + ehPrimo);
    }

    public static boolean primo(int n1, int n2){

        if(n2 == n1){
            return primo(n1, n2-1);
        }

        if(n2 <=1){
            return n1 > 1;
        }

         if(n1 % n2 == 0){
            return false;
        }

        return primo(n1, n2-1);
    }

}
