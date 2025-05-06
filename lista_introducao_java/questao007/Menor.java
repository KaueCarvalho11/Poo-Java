package lista_introducao_java.questao007;

import java.util.Scanner;

public class Menor {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o primeiro valor: ");
        double num1 = scanner.nextDouble();

        System.out.print("Informe o segundo valor: ");
        double num2 = scanner.nextDouble();

        System.out.print("Informe o terceiro valor: ");
        double num3 = scanner.nextDouble();

        scanner.close();

        if(num1 < num2 && num1 <num3){
            System.out.print("Menor número = " + num1);
        } else if(num2 < num1 && num2 < num3){
            System.out.print("Menor número = " +  num2);
        } else{
            System.out.print("Menor número = " + num3);
        }
    }
}
