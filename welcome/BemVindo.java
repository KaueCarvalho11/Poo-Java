package welcome;

//Biblioteca para fazer a leitura de dados informados via teclado
import java.util.Scanner;

public class BemVindo {
    public static void main(String[] args) {

        /*  
        Feita a chamada da classe Scanner, que é responsável por fazer a leitura de dados informados via teclado. 
        Criação de um novo objeto da classe Scanner, isto é, a instância chamada "entrada", que funcionará como um scanner de dados.
        System.in permite ler os dados informados via teclado.
        */
        Scanner entrada =  new Scanner(System.in);

        System.out.print("Informe seu nome:");
        // Lê o nome informado pelo usuário
        String nome = entrada.nextLine(); //nextline() lê uma linha inteira de texto

        System.out.println("Bem vindo " + nome);
        
        entrada.close(); // Fecha o scanner, liberando os recursos reservados para ele
    }
}
