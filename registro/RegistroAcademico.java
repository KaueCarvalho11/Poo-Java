package registro;

public class RegistroAcademico{
    String nome;
    int matricula;
    int codigoCurso;
    double percentualDeCobrança;

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