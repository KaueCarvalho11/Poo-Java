package lista_reuso_classes.questao061;

public class Equipamento{
    private String fio;
    private int voltagem;

    public void setFio(String fio){
        this.fio = fio;
    }

    public String getFio(){
        return fio;
    }

    public void setVoltagem(int voltagem){
        this.voltagem = voltagem;
    }

    public int getVoltagem(){
        return voltagem;
    }

    public String toString(){
        return " fio = " + fio + " voltagem = " + voltagem;
    }
}