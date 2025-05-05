package func;

import java.util.Scanner;

public class Media {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe sua primeira nota :");
        double n1 = scanner.nextDouble();

        System.out.print("Informe sua segunda nota: ");
        double n2 = scanner.nextDouble();

        System.out.print("Informe sua terceira nota: ");
        double n3 = scanner.nextDouble();

        scanner.close();

        System.out.println(media(n1, n2, n3));
    }

    public static double media(double num1, double num2, double num3){
        return (num1 + num2 + num3) / 3;
    }
}
