package person;

import java.text.DecimalFormat;

public class Pessoa{

    DecimalFormat df = new DecimalFormat("#,00");

    private String nome;
    private double altura;

    public Pessoa(String nome, double altura){
        this.nome = nome;
        this.altura = altura;
    }

    public void setNome(String nome){
        if(!nome.isEmpty()){
            this.nome = nome;
        }
    }

    public String getNome(){
        return nome;
    }

    public void setAltura(double altura){
        if(altura >= 1){
            this.altura = altura;
        }
    }

    public double getAltura(){
        return altura;
    }

    public String toString(){
        return "nome = " + nome + ", altura = " + df.format(altura);
    }
}