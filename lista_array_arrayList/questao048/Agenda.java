package lista_array_arrayList.questao048;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<EntradaEmAgenda> compromissos;

    public Agenda(){
        compromissos = new ArrayList<>();
    }

    public void adiciona(EntradaEmAgenda entrada){
        compromissos.add(entrada);
    }

    public void listaDia(int dia, int mes, int ano){
        for(EntradaEmAgenda e: compromissos){
            if(e.ehNoDia(dia, mes, ano)) System.out.println(e);
        }
    }
}
