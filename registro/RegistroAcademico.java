package registro;

public class RegistroAcademico{
    private String nome;
    private int matricula;
    private int codigoCurso;
    private double percentualDeCobrança;

    public void inicializaRegistroAcademico(String n, int mat, int cod, double c){
        nome = n;
        matricula = mat;
        codigoCurso = cod;
        percentualDeCobrança = c;
    }

    public double calculaMensalidade(){
        return 100 * codigoCurso * percentualDeCobrança;
    }
}