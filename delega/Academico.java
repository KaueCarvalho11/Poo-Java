package delega;

public class Academico {
    public static void main(String[] args) {
        RegistroAcademico r1 = new RegistroAcademico("Kauê", 123, "TI");
        System.out.print(r1);

        RegistroAcademicoPosGraduacao r2 = new RegistroAcademicoPosGraduacao("Jean", 345, "CET", "titulohh", "glaydson");
        System.out.print(r2);

        RegistroAcademicoPosGraduacao r3 = new RegistroAcademicoPosGraduacao(r1, "titulo", "reuds");
        System.out.print(r3);
    }
}
