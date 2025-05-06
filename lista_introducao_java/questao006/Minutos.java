package lista_introducao_java.questao006;

import java.util.Scanner;

public class Minutos {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um valor em minutos: ");
        int minuto = scanner.nextInt();
        scanner.close();

        int dia = minuto / 1440;
        int hora = (minuto % 1440) / 60;
        int minutos = (((minuto % 1440) % 60));

    System.out.print(dia + " dias, ");
    System.out.print(hora + " horas ");
    System.out.print(minutos + " e minutos ");
    }
}
