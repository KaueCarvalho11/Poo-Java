package lista_reuso_classes.questao061;

public class TestaEquipamento{
    public static void main(String[]args){
        Equipamento e1 = new Equipamento();
        e1.setFio("Vermelho");
        e1.setVoltagem(220);
        System.out.println(e1);

        Computador c1 = new Computador();
        c1.setFio("Azul");
        c1.setVoltagem(340);
        c1.setTela("SyncMaster");
        c1.setMouse("Rato");
        System.out.println(c1);
    }
}
