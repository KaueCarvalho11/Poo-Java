package lista_introducao_java.questao012;

import java.util.Scanner;

public class Fevereiro {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int dia;

        System.out.print("Informe um dia do mês de fevereiro de 2015(1 à 28): ");
        dia = scanner.nextInt();
        scanner.close();

        switch(dia){
            case 1, 8, 15, 22:
            System.out.println("O dia " + dia + " foi um domingo");
            break;

            case 2, 9, 16, 23:
            System.out.println("O dia " + dia + " foi uma segunda");
            break;

            case 3, 10, 17, 24:
            System.out.println("O dia " + dia + " foi uma terça");
            break;

            case 4, 11, 18, 26:
            System.out.println("O dia " + dia + " foi uma quarta");
            break;

            case 5, 12, 19, 27:
            System.out.println("O dia " +  dia + " foi uma quinta");
            break;

            case 6, 13, 20, 28:
            System.out.println("O dia " + dia + " foi uma sexta");
            break;

            case 7, 14, 21:
            System.out.println("O dia " + dia + " foi um sábado");
            break;
            
            default:
            System.out.println("O dia " + dia + " é inválido");
        }
    }
}
