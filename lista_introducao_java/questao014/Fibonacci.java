package lista_introducao_java.questao014;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.print("Informe um número inteiro maior que 0: ");
        n = scanner.nextInt();
        scanner.close();

        for(int i = 0; i <=n; i++){
        System.out.print(fibonacci(i) + "\n");    
        }
    }

    public static int fibonacci(int numero) {
        if (numero == 0) {
            return 0;
        }
        if (numero == 1) {
            return 1;
        }
        return fibonacci(numero - 1) + fibonacci(numero - 2);
    }
}