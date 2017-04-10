package desafioPilha;


/**
 *
 * @author 'Gabriela Muniz e Gabriel Malta
 */
public class PrincipalPrilha {

    public static void main(String[] args) {
        Pilha p = new Pilha();
        Object[] descartados = new Object[50];
        int contador = 0;

        //Preencher o vetor
        for (int i = 1; i <= 50; i++) {
            p.push(i);
        }

        while (p.verificarCartas()) {
            int cartaTopo = (int) p.pop();
            descartados[contador] = cartaTopo;
            contador++;
            int cartaSeguinte = (int) p.pop();
             p.inserirBase(cartaSeguinte);
        }
       
        for (int i = 0; i < descartados.length; i++) {
            if (descartados[i] != null) {
                System.out.println((i+1)+" - "+"Carta Descartada: "+ descartados[i]);
            }
        }
        
        System.out.println("Ultima Carta remanescente: "+ p.valorBase());
    }

}