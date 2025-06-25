package stc;

import java.util.Stack;

public class Pilha {
    public static void main(String[]args){
        Stack<Number> pilha = new Stack<>();
        float numero = 12F;

        System.out.println(pilha);

        pilha.push(1);
        System.out.println(pilha);

        pilha.push(4.6);
        System.out.println(pilha);

        pilha.push(numero);
        System.out.println(pilha);

        pilha.pop();
        System.out.println(pilha);

        pilha.pop();
        System.out.println(pilha);

        pilha.pop();
        System.out.println(pilha);
    }
}
