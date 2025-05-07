package registro;

public class DemoRegistroAcademico{
    public static void main(String[]args){

    RegistroAcademico michael = new RegistroAcademico();

    michael.inicializaRegistroAcademico("Michael", 202311314, 123, 33);

    double mensalidade = michael.calculaMensalidade();

    System.out.println("Mensalidade de Michael = R$" + mensalidade);
    }
}