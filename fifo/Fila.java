package fifo;

import java.util.Queue;
import java.util.LinkedList;

public class Fila{
    public static void main(String[]args){
        Queue<Double> fila = new LinkedList<>();

        fila.offer(12.0);
        System.out.println(fila);

        fila.offer(50.0);
        System.out.println(fila);

        fila.offer(5.0);
        System.out.println(fila);

        fila.poll();
        System.out.println(fila);

        fila.poll();
        System.out.println(fila);

        fila.poll();
        System.out.println(fila);
    }
}