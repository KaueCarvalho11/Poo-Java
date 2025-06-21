package lista_array_arrayList.questao050;

public class Cliente{
    private int id;
    private String nome;
    private int idade;
    private int telefone;

    public Cliente(int id, String nome, int idade, int telefone){
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
    }

    public String toString(){
        return " id = " + id + " nome = " +  nome + " idade = " + idade + " telefone = " + telefone;
    }
}