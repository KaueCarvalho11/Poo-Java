package concessionaria;

public class AutomovelLuxo extends AutomovelBasico{
    private boolean arCondicionado;
    private boolean direcaoHidraulica;

    public AutomovelLuxo(int ano, String modelo, String cor, boolean airbag, boolean radio, boolean arCondicionado, boolean direcaoHidraulica){
        super(ano, modelo, cor, airbag, radio);
        this.arCondicionado = arCondicionado;
        this.direcaoHidraulica = direcaoHidraulica;
    }

    public double quantoCusta(){
        double custo = super.quantoCusta();
        if(arCondicionado) custo += 1000;
        if(direcaoHidraulica) custo += 500;
        return custo;
    }

    @Override
    public String toString(){
        return super.toString() + " Ar condicionado =  " + arCondicionado + " Direção hidráulica = " + direcaoHidraulica + " Preço = " + quantoCusta();
    }
}
