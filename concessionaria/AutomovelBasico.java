package concessionaria;

public class AutomovelBasico extends Automovel {
    private boolean airbag;
    private boolean radio;

    public AutomovelBasico(int ano, String modelo, String cor, boolean airbag, boolean radio){
        super(ano, modelo, cor);
        this.airbag = airbag;
        this.radio = radio;
    }

    public double quantoCusta(){
        double custo = super.quantoCusta();
        if(airbag == true) custo += 15000;
        if(radio == true) custo+= 5000;
        return custo;
    }

    @Override
    public String toString(){
        return super.toString() + " airbag = " + airbag + " radio = " + radio;
    }

}
