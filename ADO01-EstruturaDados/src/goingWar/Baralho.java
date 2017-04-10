package goingWar;

import java.util.Random;

/**
 *
 * @author 'Gabriela Muniz e Gabriel Malta
 */
public class Baralho {

    private static boolean atingiuLimiteCartas(Object[] cartas, int numCarta) {
        int limite = 0;
        for (Object carta : cartas) {
            if (carta != null) {
                if ((int) carta == numCarta) {
                    limite++;
                }
            }
        }
        return limite == 2;
    }

    public static Object[] getBaralho() {
        Object[] baralho = new Object[26];
        Random r = new Random();
        int i = 0;
        int numCarta;
        while (i < baralho.length) {
            numCarta = r.nextInt(13);
            if (!atingiuLimiteCartas(baralho, numCarta)) {
                baralho[i] = numCarta;
                i++;
            }
        }
        return baralho;
    }
}
