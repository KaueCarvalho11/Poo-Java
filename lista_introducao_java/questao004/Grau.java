package lista_introducao_java.questao004;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Grau {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("00.0");

        System.out.print("Informe uma temperatura (em graus centígrados): ");
        double grau = scanner.nextDouble();
        scanner.close();

        double fahrenheit = (grau * 1.8) + 32;
        System.out.println("Convertido para fahrenheit = " + df.format(fahrenheit));
    } 
}
