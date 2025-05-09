package lista_introducao_java.questao020;

import java.util.Scanner;

public class Mdc {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int m;
        int n;

        System.out.print("Informe o valor de m: ");
        m = scanner.nextInt();

        System.out.print("Informe o valor de n: ");
        n = scanner.nextInt();
        scanner.close();

        System.out.print(mdc(m,n));
    }

    public static int mdc(int m, int n){
        if(n > m){
            return mdc(n, m);
        }

        if(n == 0){
            return m;
        }

        return mdc(n, m % n);
    }
}

