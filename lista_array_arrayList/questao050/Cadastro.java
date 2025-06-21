package lista_array_arrayList.questao050;

import java.util.ArrayList;
import java.util.Scanner;

public class Cadastro{
    private ArrayList<Cliente> pessoas;

    public Cadastro(){
        pessoas = new ArrayList<>();
    }

    public void cadastrar(){
        Scanner input = new Scanner(System.in);

        while(true){
            System.out.println("Informe o id do cliente: ");
            int id = input.nextInt();
            input.nextLine();

            if(id < 0) break;

            System.out.println("Informe o nome do cliente: ");
            String nome = input.nextLine();

            System.out.println("Informe a idade do cliente: ");
            int idade = input.nextInt();

            System.out.println("Informe o telefone do cliente: ");
            int telefone = input.nextInt();

            Cliente c = new Cliente(id, nome, idade, telefone);
            pessoas.add(c);
        }
        input.close();
    }

    public void listaCliente(){
        for(Cliente c: pessoas){
            System.out.println(c);
        }
    }
}