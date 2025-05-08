package lista_introducao_java.questao015;

public class Perfeito {
    public static void main(String[]args){
        int numero = 2;
        int divisor = 0;
        int contador = 0;

        do{
            divisor = 0;
            for(int i = 1; i < numero; i++){

            if(numero % i == 0){
                divisor += i;
            }
        }
            if(divisor == numero){
                System.out.println(numero);    
                contador++;
            }
            numero ++;

        }while (contador!=4);
    }
}
