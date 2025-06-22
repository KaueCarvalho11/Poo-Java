package lista_reuso_classes.questao062;

public class DataHora{
    private int dia;
    private int mes;
    private int ano;
    private int hora;
    private int minuto;
    private int segundo;

    public DataHora(int dia, int mes, int ano, int hora, int minuto, int segundo){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public String toString(){
        return " dia = " + dia + " mes = " + mes + " ano = " + ano + " hora = " + hora +  " minuto = " + minuto + " segundo = " + segundo;
    }
}