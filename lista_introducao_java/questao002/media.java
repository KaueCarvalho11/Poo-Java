package lista_introducao_java.questao002;

import java.util.Scanner;

public class media{

    public static void main(String[]args){

    Scanner scanner = new Scanner(System.in);

    System.out.print("Informe o primeiro valor: ");
    double n1 = scanner.nextDouble();

    System.out.print("Informe o segundo valor: " );
    double n2 = scanner.nextDouble();

    System.out.print("Informe o terceiro valor: ");
    double n3 = scanner.nextDouble();

    double media = Media(n1, n2, n3);

    System.out.println("Média = " + media);

    scanner.close();
    }

    public static double Media(double num1, double num2, double num3){
        return(num1 + num2 + num3) / 3;
    }
}