
/**
 *
 * @author 'Gabriela Muniz e Gabriel Malta
 */
public class PrincipalPrilha {

    public static void main(String[] args) {
        Pilha p = new Pilha();
//        p.push(1);
//        p.push(2);
//        p.push(3);
        while (!p.isEmpty()) {
            int x = (int) p.pop();
            System.out.print(x + "");
        }
    }

}
