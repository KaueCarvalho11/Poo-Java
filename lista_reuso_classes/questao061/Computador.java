package lista_reuso_classes.questao061;

public class Computador extends Equipamento{
    private String tela;
    private String mouse;


    public void setTela(String tela){
        this.tela = tela;
    }

    public String getTela(){
        return tela;
    }

    public void setMouse(String mouse){
        this.mouse = mouse;
    }

    public String getMouse(){
        return mouse;
    }

    public String toString(){
        return super.toString() + " tela = " +  tela + " mouse = " + mouse;
    }
}