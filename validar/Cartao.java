package validar;

import java.util.Scanner;
import java.time.LocalDate; // Importa a classe LocalDate para trabalhar com datas

public class Cartao{
    public static void main(String[]args){

        boolean invalida;

        // Chama a classe LocalDate, instancia um objeto chamado "hoje" e atribui a ele a data atual utilizando o método now()
        LocalDate hoje = LocalDate.now();

        // Extrai o mês e o ano atuais da data atual
        int mesAtual = hoje.getMonthValue();
        int anoAtual = hoje.getYear();

        Scanner scanner = new Scanner(System.in);

            System.out.println("Informe os dados do seu cartão");

            System.out.print("Informe seu nome: ");
            String nome = scanner.nextLine();

            System.out.print("Informe o número do cartão: ");
            int numero = scanner.nextInt();

            System.out.print("Informe o código do cartão: ");
            int codigo = scanner.nextInt();

            do{
                System.out.println("Informe a validade do cartão");
                System.out.print("Informe o mês: ");
                int mes = scanner.nextInt();

                System.out.print("Informe o ano: ");
                int ano = scanner.nextInt();

                invalida = (ano < anoAtual || (ano >= anoAtual && mes < mesAtual));

                if(invalida){
                    System.out.println("Dados inválidos, informe dados válidos");
                }
            } while(invalida);

            System.out.println("Dados válidos");

            scanner.close();
    }
}