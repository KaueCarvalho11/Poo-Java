package lista_introducao_java.questao011;

import java.util.Scanner;

public class Cartesiano {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1;
        double y1;
        double x2;
        double y2;

        System.out.print("Coordenadas do primeiro ponto.\nx1 = ");
        x1 = scanner.nextDouble();

        System.out.print("y1 = ");
        y1 = scanner.nextDouble();

        System.out.print("Coordenadas do segundo ponto.\nx2 = ");
        x2 = scanner.nextDouble();

        System.out.print("y2 = ");
        y2 = scanner.nextDouble();

        scanner.close();

        if (y2 > y1) {
            System.out.print("Segundo ponto está acima");

        } else if (y2 < y1) {
            System.out.print("Segundo ponto está abaixo");

        } else if (y2 == y1) {
            System.out.print("Os pontos estão na mesma altura");

        }
        if (x2 > x1) {
            System.out.print(" e a direita do primeiro ponto");

        } else if (x2 < x1) {
            System.out.print(" e a esquerda do primeiro ponto");

        } else if (x2 == x1) {
            System.out.print(" e estão no mesmo ponto horizontalmente");
        }
    }
}
