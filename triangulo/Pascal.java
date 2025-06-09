package triangulo;

public class Pascal {
    private int tri[][];

    public void criaTriangulo(int valor) {

        tri = new int[valor][];

        for (int i = 0; i < tri.length; i++) {
            tri[i] = new int[i + 2];
            for (int j = 0; j < tri[i].length; j++) {
                if (j == 0 || j == tri[i].length - 1) {
                    tri[i][j] = 1;
                } else {
                    tri[i][j] = (tri[i - 1][j]) + tri[i - 1][j - 1];
                }
            }
        }
    }

    public String toString() {
        String str = "";
        for (int i = 0; i < tri.length; i++) {
            for (int j = 0; j < tri[i].length; j++) {
                str += tri[i][j] + "\t";
            }
            str += "\n";
        }

        return str;
    }
}