package lista_introducao_java.questao019;

import java.util.Scanner;


public class Fatorial{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.print("Informe um número inteiro: ");
        n = scanner.nextInt();
        scanner.close();

        for (int i = 0; i <= n; i++){
            for (int j = 0; j < i; j++){
                System.out.print("\t");
            }
        System.out.println(i + "! = " + fatorial(i));
        }
    }

    public static int fatorial(int numero){
        if(numero == 0 || numero == 1){
            return 1;
        }

        return numero * fatorial(numero-1);
    }
}
