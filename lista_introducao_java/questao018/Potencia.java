package lista_introducao_java.questao018;

import java.util.Scanner;

public class Potencia {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int base;
        int expoente;

        System.out.print("Informe o valor da base: ");
        base = scanner.nextInt();

        System.out.print("Informe o valor do expoente: ");
        expoente = scanner.nextInt();
        scanner.close();

        int resultado = potencia(base, expoente);
        System.out.print("Resultado = " + resultado);
            
        }
        public static int potencia(int base, int expoente){
            if(expoente == 1){
                return base;
            }
            return base * potencia(base, expoente-1);
    }
}
