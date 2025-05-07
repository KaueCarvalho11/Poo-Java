package lista_introducao_java.questao009;

import java.util.Scanner;

public class Carta {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int carta;
        int naipe;

        do{
            System.out.println("Informe um número que representa o valor de umar carta (de 1 à 13)");
            carta = scanner.nextInt();
        }while(carta < 1 || carta > 13);

        do{
            System.out.println("Informe um número correspondente ao naipe: ");
            naipe = scanner.nextInt();
        }while(naipe <1 || naipe > 4);

        scanner.close();

        switch(carta){
            case 1: 
            System.out.print("Ás ");
            break;

            case 2:
            System.out.print("Dois ");
            break;

            case 3:
            System.out.print("Três ");
            break;

            case 4:
            System.out.print("Quatro ");
            break;

            case 5:
            System.out.print("Cinco ");
            break;

            case 6:
            System.out.print("Seis ");
            break;

            case 7:
            System.out.print("Sete ");
            break;

            case 8:
            System.out.print("Oito ");
            break;

            case 9: 
            System.out.print("Nove ");
            break;

            case 10:
            System.out.print("Dez ");
            break;

            case 11:
            System.out.print("Valete ");
            break;

            case 12: 
            System.out.print("Dama ");
            break;

            case 13:
            System.out.print("Rei ");

            default:
        }

        switch(naipe){
            case 1:
            System.out.print("de ouros");
            break;

            case 2:
            System.out.print("de paus");
            break;

            case 3:
            System.out.print(" de copas");
            break;

            case 4:
            System.out.print("de espadas");
        }
    }
}
