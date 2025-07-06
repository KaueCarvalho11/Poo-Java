package lista_excecoes.questao102;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Soma {
    public static int obterIntValido(Scanner input){
        int numero = 0;
        boolean valido;

        do{
            valido = true;
            System.out.print("informe o valor do número: ");
            
            try{
                numero = input.nextInt();
            }catch(InputMismatchException e){
                valido = false;
                System.out.println("Valor inválido, informe novamente ");
                input.next();
            }

        }while(!valido);

        return numero;
    }

    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int n1 = obterIntValido(input);
        int n2 = obterIntValido(input);

        System.out.println(n1 + n2);
        input.close();
    }
}
