package recurso;

import java.util.Scanner;

public class fatorial {
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número: ");
        double n = scanner.nextDouble();

        System.out.print(recursao(n));

        scanner.close();
    }

    public static Double recursao(double num){
        
        if (num == 0.0){
            return 1.0;
        }
        return num * recursao(num-1);
    }
}
