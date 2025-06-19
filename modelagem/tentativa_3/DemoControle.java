package modelagem.tentativa_3;

public class DemoControle{
    public static void main(String[]args){
        Controle universal = new Controle();
        Aviao boing = new Aviao(40, 12, 10);
        Barco canoa = new Barco(3, 400, 5);
        Carro Astra = new Carro(4, 4, "Mery Jane");
        Carro vazio = new Carro();

        System.out.print(boing);
        universal.moverFrente(boing);
        
        System.out.print(canoa);
        universal.moverFrente(canoa);

        System.out.print(Astra);
        universal.moverFrente(Astra);
        
        System.out.print(vazio);
    }
}
