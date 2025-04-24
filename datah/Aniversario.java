package datah;

import java.util.Scanner;

public class Aniversario {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o dia que você nasceu: ");
        int dia = leitor.nextInt();

        System.out.println("Informe o mês que você nasceu");
        int mes = leitor.nextInt();

        System.out.println("Informe o ano que você nasceu");
        int ano = leitor.nextInt();

        leitor.close();

        System.out.print("Você nasceu em " + dia + " de");

        if (mes == 1) {
            System.out.print(" Janeiro");
        } else if (mes == 2) {
            System.out.print(" Fevereiro");
        } else if (mes == 3) {
            System.out.print(" Março");
        } else if (mes == 4) {
            System.out.print(" Abril");
        } else if (mes == 5) {
            System.out.print(" Maio");
        } else if (mes == 6) {
            System.out.print(" Junho");
        } else if (mes == 7) {
            System.out.print(" Julho");
        } else if (mes == 8) {
            System.out.print(" Agosto");
        } else if (mes == 9) {
            System.out.print(" Setembro");
        } else if (mes == 10) {
            System.out.print(" Outubro");
        } else if (mes == 11) {
            System.out.print(" Novembro");
        } else if (mes == 12) {
            System.out.print(" Dezembro");
        } else {
            System.out.print(" (mês inexistente)");
        }

        System.out.println(" de " + ano);

        switch(mes){
            case 1, 3, 5, 7, 8, 10, 12:
            System.out.println("O mês que você nasceu tem 31 dias");
            break;

            case 2: 
            System.out.println("O mês que você nasceu tem 28 dias");
            break;

            case 4, 6, 9, 11:
            System.out.println("O mês que você nasceu tem 30 dias");
            break;

            default:
            System.out.println("Você informou um mês inválido");
        }
    }
}