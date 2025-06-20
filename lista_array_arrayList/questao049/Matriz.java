package lista_array_arrayList.questao049;

import java.util.Scanner;

public class Matriz {
    private float mat[][];

    public Matriz(){
        mat = new float[2][2];
    }

    public void inicializa(){
        Scanner input = new Scanner(System.in);

        for(int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++){
                System.out.print("Matriz[" + i + "][" + j + "]: ");
                mat[i][j] = input.nextFloat();
            }
        }
        input.close();
    }

    public float determinante(){
        float determinante = (mat[0][0] * mat[1][1]) - (mat[0][1] * mat[1][0]);
        return determinante;
    }

    public void imprime(){
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                System.out.print(mat[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }
}
