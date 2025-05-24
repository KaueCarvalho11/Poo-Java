package lista_criacao_classes_II.questao038;

public class DemoLampada {
    public static void main(String[] args){

        Lampada l1 = new Lampada();

        System.out.println(l1);

        l1.acende();
        System.out.println(l1);
        System.out.println(l1.estaLigada());

        l1.desliga();
        System.out.println(l1);
        System.out.println(l1.estaLigada());

        l1.acende();
        System.out.println(l1);
        System.out.println(l1.estaLigada());
    }
}
