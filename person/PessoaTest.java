package person;

public class PessoaTest{
    public static void main(String[]args){
        Pessoa marcelo = new Pessoa("marcelo", 170);

        System.out.println(marcelo);

        marcelo.setAltura(0);

        System.out.println(marcelo.getAltura());

        marcelo.setAltura(12);
        System.out.println(marcelo.getAltura());

        marcelo.setNome("Jonas Esticado");

        System.out.print(marcelo);
    }
}