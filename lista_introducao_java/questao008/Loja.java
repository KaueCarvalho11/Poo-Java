package lista_introducao_java.questao008;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Loja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        int codigo;
        double produto;
        double desconto;

        do {
            System.out.print("Informe o código do setor (222) ou (111): ");
            codigo = scanner.nextInt();

            if (codigo != 222 && codigo != 111) {
                System.out.println("Setor inválido, tente novamente");
            } else{
                System.out.println("Código válido!");
            }

        } while (codigo != 222 && codigo != 111);

        switch (codigo) {
            case 222:
                System.out.println("Bem-vindo(a) ao setor de eletros!");
                System.out.println("Produtos que custam mais de R$500 tem 10% de desconto!");
                System.out.print("Informe o valor do produto: R$");
                produto = scanner.nextDouble();

                if(produto > 500){
                    desconto = produto*0.10;

                    System.out.print("Valor do produto (com desconto): R$" + df.format(produto - desconto));
                } else{
                    System.out.print("Valor do produto (sem desconto): R$" + df.format(produto));
                }
                break;

            case 111:
                System.out.println("Bem-vindo(a) ao setor de cama, mesa e banho! ");
                System.out.println("Tabela de descontos!");
                System.out.println(" Acima de R$100: 40%\n entre R$ 50 e R$ 100: 20%\n abaixo R$ 50: 10%");

                System.out.print("Informe o valor do produto: R$");
                produto = scanner.nextDouble();

                if (produto > 100){
                    desconto = produto*0.40;
                    System.out.println("Valor do produto: R$" + df.format(produto - desconto));
                } 

                else if(produto > 50 && produto < 100){
                    desconto = produto*0.20;
                    System.out.println("Valor do produto: R$" + df.format(produto - desconto));
                }

                else{
                    desconto = produto*0.10;
                    System.out.println("Valor do produto: R$" + df.format(produto - desconto));
                }
                break;

            default:
                System.out.println("Código inválido"); // segurança extra
        }
        scanner.close();
    }
}
