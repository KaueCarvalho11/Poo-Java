package classe;

public class Data{
    private int dia;
    private int mes;
    private int ano;

    public boolean dataEhValida(){
        return ((dia > 0 && dia <= 30) && (mes > 0 && mes <=12) &&(ano >= 0));
    }

    public void inicializa(int d, int m, int a){
        dia = d;
        mes = m;
        ano = a;    
    }

    public void mostraData(){
        System.out.print(dia + "/" + mes + "/" +  ano);
    }
}
