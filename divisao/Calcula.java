package divisao;
import java.util.Scanner;

public class Calcula{
    public static double divide(double numerador, double denominador){
        return numerador/denominador;
    }
    
    public static void main(String[]args){
        double n1, n2;
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o valor do numerador: ");
        n1 = input.nextDouble();

        System.out.println("Informe o valor do denominador: ");
        n2 = input.nextDouble();

        System.out.println(divide(n1, n2));

        input.close();
    }
}