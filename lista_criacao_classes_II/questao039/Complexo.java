package lista_criacao_classes_II.questao039;

public class Complexo{
    private double real;
    private double imaginaria;

    public Complexo(double real, double imaginaria){
        this.real = real;
        this.imaginaria = imaginaria;
    }

    public Complexo(double real){
        this.real = real;
        imaginaria = 0;
    }

    public Complexo(){
        real = 0;
        imaginaria = 0;
    }

    public String toString(){
        return real + " + " + imaginaria + "i";
    }
}