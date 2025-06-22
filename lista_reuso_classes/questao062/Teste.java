package lista_reuso_classes.questao062;

public class Teste{
    public static void main(String[]args){
        DataHora dh = new DataHora(12, 12, 2012, 3, 34, 56);
        System.out.println(dh);

        EventoDelegacao ed = new EventoDelegacao(22, 8, 2004, 9, 0 ,31, "Aniversário meu");
        System.out.println(ed);

        EventoHeranca eh = new EventoHeranca(18, 9, 2004, 0, 3, 44, "Finecap");
        System.out.println(eh);
    }
}