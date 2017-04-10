package goingWar;

/**
 *
 * @author 'Gabriela Muniz e Gabriel Malta
 */
public class Fila {

    private Object[] dados;
    private int inicio;
    private int fim;

    public Fila() {
        dados = new Object[51];
        inicio = 0;
        fim = 0;
    }

    public boolean isFull() {
        return (fim + 1) % dados.length == inicio;
    }

    public boolean isEmpty() {
        return (inicio == fim);
    }

    public void enqueue(Object x) {
        if (!isFull()) {
            dados[fim] = x;
            fim++;
            if (fim == dados.length) {
                fim = 0;
            }
        }
    }

    public Object dequeue() {
        if (!isEmpty()) {
            Object x = dados[inicio];
            inicio++;
            if (inicio == dados.length) {
                inicio = 0;
            }
            return x;
        }
        return null;
    }
}