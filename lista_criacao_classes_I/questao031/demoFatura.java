package lista_criacao_classes_I.questao031;

public class demoFatura {
    public static void main(String[]args){

    Fatura cliente = new Fatura(123, "Fatura do mês", 45, 12);

    cliente.exibe();
    }
}
