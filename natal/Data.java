package natal;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public boolean dataEhvalida(){
        return(dia >= 1 && dia <= 31 && mes <= 12 && ano > 0);
    }

    public Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public static Data natal(int ano){
        if(ano > 0){
            Data dNatal = new Data(25, 12, ano);
            return dNatal;
        }
        return null;
    }

    public String toString(){
        return "dia: " + dia + " mes: " + mes + " ano: " + ano;
    }

}