package lista_introducao_java.questao022;

import java.util.Scanner;

public class Polinomio{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int n;
        double x;

        System.out.print("Informe o grau do polinômio: ");
        n = input.nextInt();

        System.out.print("Informe o valor de x: ");
        x = input.nextDouble();

        double valor = recursao(n, x, input);

        System.out.print("P" + n + "(" + x + ") = " + valor);
    }

    public static double recursao(int n, double x, Scanner input){
            System.out.print("Coeficiente a" + n + ":");
            double coeficiente = input.nextDouble();

            if(n == 0){
                return coeficiente;
            }

            double anterior = recursao(n -1, x, input);

            return x * anterior + coeficiente;

        }
}   