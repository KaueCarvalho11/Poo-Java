package divisao;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Calcula{
    public static double divide(int numerador, int denominador){
        return numerador/denominador;
    }
    
    public static void main(String[]args){
        int n1, n2 = 0;
        Scanner input = new Scanner(System.in);


        System.out.println("Informe o valor do numerador: ");
        n1 = input.nextInt();

        System.out.println("Informe o valor do denominador: ");
        try{ 
            n2 = input.nextInt();
        }catch(InputMismatchException m){
            System.out.println(m.getMessage());
            System.out.println("Erro, número informado por extenso");
            return;
        }

        try{
            System.out.println(divide(n1, n2));
        }catch(ArithmeticException a){
            System.out.println(a.getMessage());
            System.out.println("Erro, denominador não pode ser 0");
        } finally{
            input.close();
        }   
    }
}