package lista_reuso_classes.questao065;

public class Main{
    public static void main(String[]args){
        Funcionario f1 = new Funcionario("Kaue", 1520);
        System.out.println(f1);
        System.out.println(f1.ganhoAnual());
        f1.aumentarSalario(20);
        System.out.println(f1.ganhoAnual());
        System.out.println(f1);

        Assistente a1 = new Assistente("Jean", 60, 123);
        System.out.println(a1);
        a1.setNumeroMatricula(321);
        System.out.println(a1.getNumeroMatricula());

        Tecnico t1 = new Tecnico("Erick", 80, 456, 30 );
        System.out.println(t1);
        System.out.println(t1.ganhoAnual());

        Administrativo adm = new Administrativo("Foguetes", 1, 987, "noite");
        System.out.println(adm);
        System.out.println(adm.ganhoAnual());

        Administrativo admin = new Administrativo("Bob", 10, 674, "dia");
        System.out.println(admin);
        System.out.println(admin.ganhoAnual());
    }
}