
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
        dados = new Object[10];
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

    //Insere valor na base
    public void inserirBase(Object valor) {
        if (!isEmpty()) {
            dados[0] = valor;
        }
    }

    //Devolve o valor remanescente da base
    public Object valorBase() {
        return dados[0];
    }
    
    //Metodo para verificar se ainda ha 2 ou mais cartas para continuar jogando.
    public boolean verificarCartas(){
        if (topo < 1) {
            return false;
        }else{
            return true;
        }
    }
}
