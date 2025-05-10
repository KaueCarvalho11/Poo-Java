package lista_introducao_java.questao021;

import java.util.Scanner;

public class Primo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int numero = scanner.nextInt();
        scanner.close();

        boolean isPrime = primo(numero, numero);
        System.out.println(numero + " é primo? " + isPrime);
    }

    public static boolean primo(int n, int i) {
        
        if (i <= 1) {
            return n > 1;
        }

        if (i == n) {
            return primo(n, i - 1);
        }
        
        if (n % i == 0) {
            return false;
        }
    
        return primo(n, i - 1);
    }
}
