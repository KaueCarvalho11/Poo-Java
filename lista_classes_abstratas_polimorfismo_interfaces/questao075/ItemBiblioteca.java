interface ItemBiblioteca{
    int maximoDiasParaEmprestimo = 14;

    public boolean estaEmprestado();
    public void empresta();
    public void devolve();
    public String localizacao();
    public String descricao();

}