public class Desenho{
    private FiguraGeometrica atributo1;
    private FiguraGeometrica atributo2;
    private double x;
    private double y;

    public Desenho(FiguraGeometrica atributo1, FiguraGeometrica atributo2, double x, double y){
        this.atributo1 = atributo1;
        this.atributo2 = atributo2;
        this.x = x;
        this.y = y;
    }

    public void apresenta(){
        System.out.println(" Coordenada x = " + x + " coordenada y =" + y);
        System.out.println("Descrição da figura 1: ");
        atributo1.descricao();
        System.out.println("Descrição da figura 2: ");
        atributo2.descricao();
    }
}