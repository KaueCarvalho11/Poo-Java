package modelagem.tentativa_2;

public class Controle{
    public static void main(String[]args){
        Veiculo v1 = new Veiculo(2);
        System.out.println(v1);
        v1.moverFrente();

        Aquatico a1 = new Aquatico(3, 3);
        System.out.println(a1);
        a1.moverFrente();

        Aviao av = new Aviao(50, 1, 1);
        System.out.println(av);
        av.moverFrente();
    }
}