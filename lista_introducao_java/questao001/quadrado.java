package lista_introducao_java.questao001;

import java.util.Scanner;

public class quadrado{
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor do lado do quadrado: ");
        double lado = scanner.nextDouble();

        double area = Area(lado);

        System.out.println("Área do quadrado = " + area);
        
        scanner.close();
    }
    public static double Area(double medida){
        return Math.pow(medida, 2.0);
    }
}