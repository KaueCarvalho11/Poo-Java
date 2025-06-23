public class Funcionario {
  private String nome;
  private int idade;
  private double salarioPorHora;

  public Funcionario(String nome){
    this.nome = nome;
    idade = 20;
    salarioPorHora = 2;
  }

  public Funcionario(String nome, double salarioPorHora){
    this.nome = nome;
    idade = 40;
    this.salarioPorHora = salarioPorHora;
  }

  public void setNome(String nome){
    this.nome = nome;
  }

  public String getNome(){
    return nome;
  }

  public void setIdade(int idade){
    this.idade = idade;
  }

  public int getIdade(){
    return idade;
  }

  public void setSalarioPorHora(double salarioPorHora){
    this.salarioPorHora = salarioPorHora;
  }

  public double getSalarioPorHora(){
    return salarioPorHora;
  }

  public String toString(){
    return " nome  = " + nome + " idade = " + idade + " salário por hora trabalhada = " + salarioPorHora;
  }
}
