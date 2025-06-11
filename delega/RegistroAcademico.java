package delega;

public class RegistroAcademico {
    private String nome;
    private int matricula;
    private String curso;

    public RegistroAcademico(String nome, int matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

    public String toString() {
        return " Nome = " + nome + " matrícula = " + matricula + " curso = " + curso + "\n";
    }
}