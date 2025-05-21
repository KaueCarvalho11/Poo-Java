package evento;

public class EventoAcademico{
    private String nomeDoEvento;
    private String localDoEvento;
    private int numeroDeParticipantes;

    EventoAcademico(String nomeDoEvento, String localDoEvento, int numeroDeParticipantes){
        this.nomeDoEvento = nomeDoEvento;
        this.localDoEvento = localDoEvento;
        this.numeroDeParticipantes = numeroDeParticipantes;
    }

    public void mostraEvento(){
        System.out.println("Nome do evento = " + nomeDoEvento);
        System.out.println("Local do evento = " + localDoEvento);
        System.out.println("Numero de participantes = " + numeroDeParticipantes);
    }
}