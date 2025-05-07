package registro;

public class DemoRegistroAcademico{
    public static void main(String[]args){

    RegistroAcademico michael = new RegistroAcademico();

    michael.inicializaRegistroAcademico("Michael", 202311314, 123, 33);

    double mensalidade = michael.calculaMensalidade();

    System.out.println("Mensalidade 1 de Michael = R$" + mensalidade);

    michael.percentualDeCobrança = 0.75;

    mensalidade = michael.calculaMensalidade();

    System.out.println("Nova mensalidade = " + mensalidade);
    }
}