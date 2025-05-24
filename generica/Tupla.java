package generica;

public class Tupla <F, S>{
    private F primeiro;
    private S segundo;

    public Tupla(F primeiro, S segundo){
        this.primeiro = primeiro;
        this.segundo = segundo;
    }

    public F getPrimeiro(){
        return primeiro;
    }

    public F setPrimeiro(F primeiro){
        return this.primeiro = primeiro;
    }

    public S getSegundo(){
        return segundo;
    }

    public S setSegundo(S segundo){
        return this.segundo = segundo;
    }

    public String toString(){
        return "\nPrimeiro = " + primeiro + " Segundo = " + segundo;  
    }
}