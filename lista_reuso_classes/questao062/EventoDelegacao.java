package lista_reuso_classes.questao062;

public class EventoDelegacao {
    private String evento;
    private DataHora infoEvento;

    public EventoDelegacao(int dia, int mes, int ano, int hora, int minuto, int segundo, String evento){
        infoEvento = new DataHora(dia, mes, ano, hora, minuto, segundo);
        this.evento = evento;
    }

    public String toString(){
        return infoEvento + " " + evento;   
    }
}
