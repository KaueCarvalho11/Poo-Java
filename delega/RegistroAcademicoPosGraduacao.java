package delega;

public class RegistroAcademicoPosGraduacao {
    private RegistroAcademico academico;
    private String tituloTese;
    private String orientador;

    public RegistroAcademicoPosGraduacao(String nome, int matricula, String curso, String tituloTese, String orientador) {

        this.academico = new RegistroAcademico(nome, matricula, curso);
        this.tituloTese = tituloTese;
        this.orientador = orientador;
    }

    public RegistroAcademicoPosGraduacao(RegistroAcademico academico, String tituloTese, String orientador) {

        this.academico = academico;
        this.tituloTese = tituloTese;
        this.orientador = orientador;
    }

    public String toString(){
        return academico.toString() + " " + "tese = " + tituloTese + " orientador = " + orientador + "\n";
    }
}
