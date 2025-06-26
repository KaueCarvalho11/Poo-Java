package fifo;

import java.util.PriorityQueue;

public class Heap{
    public static void main(String[]args){
        PriorityQueue<Double> fila = new PriorityQueue<>();

        fila.offer(7.0);
        System.out.println(fila);

        fila.offer(3.0);
        System.out.println(fila);

        fila.offer(5.0);
        System.out.println(fila);

        fila.offer(1.0);
        System.out.println(fila);

        fila.offer(9.0);
        System.out.println(fila);

        fila.poll();
        System.out.println(fila);

        fila.poll();
        System.out.println(fila);
        
        fila.poll();
        System.out.println(fila);

        fila.poll();
        System.out.println(fila);

        fila.poll();
        System.out.println(fila);
    }
}