package lista_introducao_java.questao005;

import java.util.Scanner;

public class Cdu {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe um número no formato CDU: ");
        int numero = scanner.nextInt();
        scanner.close();

        int centena = numero / 100;
        int dezena = (numero % 100) / 10;
        int unidade = (numero % 100) % 10;
        int ucd = (unidade * 100) + (centena * 10) + dezena;

        System.out.print(ucd);
    }
}
