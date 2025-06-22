package lista_reuso_classes.questao062;

public class EventoHeranca extends DataHora{
    private String evento;

    public EventoHeranca(int dia, int mes, int ano, int hora, int minuto, int segundo, String evento){
        super(dia, mes, ano, hora, minuto, segundo);
        this.evento = evento;
    }

    public String toString(){
        return super.toString() + " evento = " + evento;
    }
}