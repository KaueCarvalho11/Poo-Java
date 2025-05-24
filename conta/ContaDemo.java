package conta;

public class ContaDemo{
    public static void main(String[]args){
        ContaBancaria contaKaue = new ContaBancaria("Kauê", 12, "Especial");
        ContaBancaria contaErick = new ContaBancaria("Erick");

        System.out.print(contaKaue);
        System.out.print(contaErick);
    }
}