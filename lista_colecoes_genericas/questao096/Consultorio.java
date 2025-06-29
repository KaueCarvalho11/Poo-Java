import java.util.Queue;
import java.util.PriorityQueue;
import java.util.LinkedList;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Comparator;

public class Consultorio {
    Queue<Paciente> comum = new LinkedList<>();
    PriorityQueue<Paciente> prioritaria = new PriorityQueue<>(Comparator.comparingInt(Paciente::getIdade).reversed());

    public void construirFila(){
        for(int i = 0; i < 80; i+=4){
            int rg = ThreadLocalRandom.current().nextInt(10000000, 100000000);
            int idade = ThreadLocalRandom.current().nextInt(0, 116);
            Paciente p = new Paciente(rg, idade);

            if(p.getIdade() > 60){
                prioritaria.add(p);
                System.out.println("paciente prioritário adicionado: " + p);
            } 
            else{
                comum.add(p);
                System.out.println("Paciente adicionado a fila comum: " + p);
            }
        }
    }

    public void atendimento(){
        for(int i = 0; i < 100; i+=5){
            if(!prioritaria.isEmpty()){
                System.out.println(prioritaria.poll());
            }
            else{
                System.out.println(comum.poll());
            } 
        }
    }
} 
