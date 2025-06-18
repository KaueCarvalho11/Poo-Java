package lista_array_arrayList.questao048;

public class AgendaDemo {
    public static void main(String[]args){
        Agenda compromissos = new Agenda();

        EntradaEmAgenda e1 = new EntradaEmAgenda(12, 22, 8, 2004, "yes");
        EntradaEmAgenda e2 = new EntradaEmAgenda(13, 18, 9, 2004, "no");

        compromissos.adiciona(e1);
        compromissos.adiciona(e2);

        compromissos.listaDia(22, 8, 2004);
        compromissos.listaDia(12, 12, 2012);
    }

}
