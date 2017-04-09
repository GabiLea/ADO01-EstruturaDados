
/**
 *
 * @author 'Gabriela Muniz e Gabriel Malta
 */
public class Pilha {

    // atributos
    private Object[] dados;
    private int topo;
// Construtor - Cria uma pilha vazia

    public Pilha() {
        dados = new Object[50];
        topo = -1;
    }

    // métodos
    public boolean isFull() {
        return (topo == dados.length - 1);
    }

    public boolean isEmpty() {
        return (topo == -1);
    }

    public void push(Object x) {
        if (!isFull()) {
            topo++;
            dados[topo] = x;
        } else {
            System.out.println("Pilha Cheia");
        }
    }

    public Object pop() {
        if (!isEmpty()) {
            Object x = dados[topo];
            topo--;
            return x;
        } else {
            System.out.println("Pilha Vazia");
            return null;
        }
    }

    public Object top() {
        if (!isEmpty()) {
            return dados[topo];
        } else {
            System.out.println("Pilha Vazia");
            return null;
        }
    }
}
