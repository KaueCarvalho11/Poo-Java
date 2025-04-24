package distancia;

import java.util.Scanner;

public class Ponto {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("x1 = ");
        double x1 = scanner.nextDouble();

        System.out.print("\ny1 = ");
        double y1 = scanner.nextDouble();

        System.out.print("\nx2 = ");
        double x2 = scanner.nextDouble();

        System.out.print("\ny2 = ");
        double y2 = scanner.nextDouble();

        scanner.close();

        double distancia = Math.sqrt(Math.pow(x2 - x1, 2.0) + Math.pow(y2 - y1, 2.0));

        System.out.println("\nDistância entre os 2 pontos = " + distancia);
    }
}