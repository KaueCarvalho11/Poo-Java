package empresa;

public class EmpresaDemo {
    public static void main(String[]args){
        Pessoa p1 = new Pessoa("Kauê", 123);
        System.out.println(p1);

        Funcionario p2 = new Funcionario("Jean", 17, 12);
        System.out.println(p2);

        ChefeDeDepartamento p3 = new ChefeDeDepartamento("Erick", 22, 2217, "ciencias");
        System.out.println(p3);
    }
}
