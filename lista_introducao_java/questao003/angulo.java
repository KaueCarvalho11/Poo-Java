package lista_introducao_java.questao003;

import java.util.Scanner;
import java.text.DecimalFormat;

public class angulo {
    public static void main(String[]args){
        Scanner scanner =  new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.print("Informe o valor de um ângulo (em graus): ");
        double angulo = scanner.nextDouble();
        scanner.close();

        double radiano = Math.toRadians(angulo);
        System.out.println("Radianos = " + df.format(radiano));

        double seno = Math.sin(radiano);
        System.out.println("Seno = " + df.format(seno));

        double cosseno = Math.cos(radiano);
        System.out.println("Cosseno = " + df.format(cosseno));

        double tangente = Math.tan(radiano);
        System.out.println("Tangente = " + df.format(tangente));

        double cossecante = 1.0/seno;
        System.out.println("Cossecante = " + df.format(cossecante));

        double secante = 1.0/cosseno;
        System.out.println("Secante = " + df.format(secante));

        double cotangente = 1.0/tangente;
        System.out.println("Cotangente = " + df.format(cotangente));
    }
}
