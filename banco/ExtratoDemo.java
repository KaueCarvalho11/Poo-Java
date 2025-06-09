package banco;

import java.util.Scanner;

public class ExtratoDemo {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int opcao;
        double valor;
        Extrato e1 = new Extrato();

        do{
            System.out.println("\n1 - Depositar\n2 - Sacar\n3 - Visualizar\n4- encerrar");
            opcao = input.nextInt();

            switch(opcao){
                case 1: 
                System.out.print("Informe o valor do depósito: R$");
                valor = input.nextDouble();
                e1.transacao(valor);
                break;

                case 2:
                System.out.print("Informe o valor a  ser sacado: R$");
                valor = input.nextDouble();
                e1.transacao(-valor);
                break;

                case 3:
                System.out.print(e1);
                break;

                case 4:
                System.out.print("Encerrando");
                break;

                default:
                System.out.print("Opção inválida");
                break;
            }
        }while (opcao != 4);
        input.close();
    }
    
}
