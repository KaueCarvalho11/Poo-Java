package concessionaria;

public class AutomovelDemo {
    public static void main(String[]args){
        AutomovelLuxo a1 = new AutomovelLuxo(2020, "civic", "verde-limão", true, false, true, false);
        System.out.println(a1.quantoCusta());
        System.out.println(a1);
    }

}
