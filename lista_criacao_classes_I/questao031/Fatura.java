package lista_criacao_classes_I.questao031;

import java.text.DecimalFormat;

public class Fatura {
    int id;
    String descricao;
    int quantidadeComprada;
    double precoUnidade;

    Fatura(int id, String descricao, int quantidadeComprada, double precoUnidade){
        this.id = id;
        this.descricao = descricao;
        this.quantidadeComprada = (quantidadeComprada<=0 ? 0: quantidadeComprada);
        this.precoUnidade = (precoUnidade<=0 ? 0: precoUnidade);
    }

    public void exibe(){ 
        DecimalFormat df = new DecimalFormat("#.00");
       
        System.out.println("Número de identificação: " + id);
        System.out.println("Descrição: " + descricao);
        System.out.println("Quantidade comprada: " + quantidadeComprada);
        System.out.println("Preço da unidade: " +  precoUnidade);
        System.out.println("Valor da fatura: R$" + df.format(CalculaTotal()));
    }

    public double CalculaTotal(){
        return (quantidadeComprada * precoUnidade);
    }
}
