package lista_criacao_classes_II.questao041;

public class RegistroAcademico {
    private String nome;
    private int matricula;
    private int codigoCurso;
    private double percentualDeCobranca;
    private static int numeroDeMatriculas;

    public RegistroAcademico(String nome, int codigoCurso, double percentualDeCobranca){
    numeroDeMatriculas++;
    this.nome = nome;
    this.matricula = numeroDeMatriculas;
    this.codigoCurso = codigoCurso;
    this.percentualDeCobranca = percentualDeCobranca;
  }
    public double calculaMensalidade(){
        return 100 * codigoCurso * percentualDeCobranca;
    }

    public String toString(){
        return "\nNome: " + nome + " matricula: " + matricula + " codigoCurso: " + codigoCurso + " percentual de cobrança: " + percentualDeCobranca + " numero de matriculas: " + numeroDeMatriculas;
    }
}
