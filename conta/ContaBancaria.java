package conta;

public class ContaBancaria{
    String nome;
    double saldo;
    String status;

    public ContaBancaria(String nome, double saldo, String status){
        this.nome = nome;
        this.saldo = saldo;
        this.status = status;
    }

    public ContaBancaria(String nome){
        this.nome = nome;
        this.saldo = 0;
        this.status = "normal";
    }

    public String toString(){
        return "\nnome " + nome +  " saldo = " + saldo + "status" + status; 
    }
}