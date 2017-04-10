
/**
 *
 * @author 'Gabriela Muniz e Gabriel Malta
 */
public class PrincipalPrilha {

    public static void main(String[] args) {
        Pilha p = new Pilha();
        while (!p.isEmpty()) {
            int x = (int) p.pop();
            System.out.print(x + "");
        }
    }

}
