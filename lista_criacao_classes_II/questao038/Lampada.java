package lista_criacao_classes_II.questao038;

import lista_criacao_classes_II.questao037.Contador; 

public class Lampada{
    private String estadoDaLampada;
    private int contador;
    Contador c1 = new Contador();
    
    public Lampada(){
        estadoDaLampada = "Desligada";
        contador = 0;
    }

    public void acende(){
        estadoDaLampada = "Ligada";
        c1.incrementar();  
    }

    public void desliga(){
        estadoDaLampada = "Desligada";
    }

    public boolean estaLigada(){
        if(estadoDaLampada == "Ligada"){
            return true;
        }
        return false;
    }

    public String toString(){
        return "\nEstado da lampada: " + estadoDaLampada + " Quantas vezes a lâmpada foi ligada: " + c1.toString();
    }
}