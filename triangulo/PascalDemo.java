package triangulo;

import java.util.Scanner;

public class PascalDemo {
    public static void main(String[] args) {

        Pascal p1 = new Pascal();
        Scanner input = new Scanner(System.in);
        int n1;

        System.out.print("Informe um valor: ");
        n1 = input.nextInt();
        input.close();

        p1.criaTriangulo(n1);
        System.out.print(p1);
    }
}
