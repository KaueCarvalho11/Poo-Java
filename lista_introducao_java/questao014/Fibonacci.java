package lista_introducao_java.questao014;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int auxiliar = 0;

        System.out.print("Informe um número inteiro maior que 0: ");
        n = scanner.nextInt();
        scanner.close();

        System.out.print(fibonacci(n));
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