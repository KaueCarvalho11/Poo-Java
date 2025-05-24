package data;

public class Dia{
    int dia;

    public Dia(int dia){
        this.dia =  dia;
    }

    public void setDia(int dia){
        if(dia >= 1 && dia <=31){
            this.dia = dia;
        }
    }

    public int getDia(){
        return dia;
    }
}