package banco;

import java.util.ArrayList;

public class Extrato{
    private double saldo;
    private ArrayList<Double> transacoes;

    public Extrato(){
    saldo = 0;
    transacoes = new ArrayList<>();
    }

    public void transacao(double valor){
        if(saldo + valor >= 0){
            saldo += valor;
            transacoes.add(valor);
        }
    }

    public String toString(){
        String str = "";
        for(Double s: transacoes){
            str += s + "\t";
        }
        return "Saldo = R$" + saldo + "\nTransações: " + str;
    }
}