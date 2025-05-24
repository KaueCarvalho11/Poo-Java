package prova;

public class Avaliacao{
    private int nota;

    public Avaliacao(int nota){
        this.nota = nota;
    }

    public void setNota(int nota){
        if(nota >= 0 && nota <= 100){
            this.nota = nota;
        }
    }

    public String getNota(){
        if(nota >= 90){
            return ("A");
        }

        if(nota >= 80){
            return ("B");
        }
        return ("F");
    }
}