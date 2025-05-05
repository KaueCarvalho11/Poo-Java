package fatorial;

import java.util.Scanner;

public class calcula {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número inteiro: ");
        int n = scanner.nextInt();
        scanner.close();

        int auxiliar = 1;
        for(int i = 1; i <= n; i++){
            auxiliar *= i;
            System.out.println("Fatorial de " + i + " = " + auxiliar);
        }
           
    }
}