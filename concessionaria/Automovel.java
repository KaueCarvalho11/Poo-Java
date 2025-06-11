package concessionaria;

public class Automovel {
    private int ano;
    private String modelo;
    private String cor;

    public Automovel(int ano, String modelo, String cor){
        this.ano = ano;
        this.modelo = modelo;
        this.cor = cor;
    }

    public double quantoCusta(){
        return (ano > 2010? 50000:20000);
    }

    @Override
    public String toString(){
        return "ano = " + ano + " modelo = " + modelo + " cor = " + cor;
    }  
}
