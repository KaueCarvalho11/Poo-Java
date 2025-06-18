package lista_array_arrayList.questao049;

public class Matriz {
    private float mat[][];

    public Matriz(){
        mat = new float[2][2];
    }

    public float Determinante(){
        float determinante = (mat[0][0] * mat[1][1]) - (mat[0][1] * mat[1][0]);
        return determinante;
    }
}
