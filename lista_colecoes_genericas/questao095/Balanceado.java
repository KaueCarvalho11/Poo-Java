import java.util.Stack;

public class Balanceado {
    public static void main(String[] args) {
        Stack<String> pilha = new Stack<>();
        String parenteses = "(())";
        String vetor[] = parenteses.split("");

        for (String v : vetor) {
            if (v.equals("(")) {
                pilha.push(v);
            } else {
                if (pilha.isEmpty()) {
                    System.out.println("Desbalanceada");
                    return;
                } else
                    pilha.pop();
            }
        }

        if (pilha.isEmpty()) {
            System.out.println("Balanceada");
        } else
            System.out.println("Desbalanceada");
    }
}