package tabuleiro;

public class Dama {
    private char matriz[][]; 

    public Dama(){
        matriz = new char[8][8];
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = '.';
            }
        }
    }

    public void inicializaPreta(){      
        for(int i = 0; i < 3; i++){
            for(int j = i % 2; j < matriz[i].length; j +=2){
                matriz[i][j] = 'o';
            }
        }
    }

    public void inicializaBranca(){
        for(int i = 5; i < matriz.length; i++){
            for(int j = i % 2; j < matriz[i].length; j+=2){
                matriz[i][j] = 'x';
            }
        }
    }

    public String toString(){
        String str = "";
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                str += matriz[i][j] + " ";
            }
            str += "\n";
        }
        return str;
    }
}