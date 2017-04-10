package goingWar;

/**
 *
 * @author 'Gabriela Muniz e Gabriel Malta
 */
public class goingWarPrincipal {

    public static void main(String[] args) {
        // ehGuerra será alterada para TRUE quando houver empate
        boolean ehGuerra = false;

        // deve contabilizar a quantidade de jogadas válidas realizadas
        int qtdeJogadas = 0;

        //variáveis que irão armazenar as cartas retiradas do monte de cada jogador
        Object cartaJogador1, cartaJogador2;

        // monte reservado para cartas separadas durante os empates
        Fila monteGuerra = new Fila();

        Fila monteJogador1 = new Fila();
        Fila monteJogador2 = new Fila();

        // gerar baralho em ordem aleatória
        for (Object carta : Baralho.getBaralho()) {
            monteJogador1.enqueue(carta);
        }
        
        // gerar baralho em ordem aleatória
        for (Object carta : Baralho.getBaralho()) {
            monteJogador2.enqueue(carta);
        }

        while (!monteJogador1.isEmpty() && !monteJogador2.isEmpty()) {
            if (qtdeJogadas > 50000) {
                break;
            }

            cartaJogador1 = monteJogador1.dequeue();
            cartaJogador2 = monteJogador2.dequeue();

            // após um empate deve retirar mais uma carta de cada jogador
            if (ehGuerra) {
                monteGuerra.enqueue(monteJogador1.dequeue());
                monteGuerra.enqueue(monteJogador2.dequeue());
            }

            if (cartaJogador1 != null && cartaJogador2 != null) {
                if (comparaCartas(cartaJogador1, cartaJogador2)) {
                    monteJogador1.enqueue(cartaJogador1);
                    monteJogador1.enqueue(cartaJogador2);

                    if (ehGuerra) {
                        ehGuerra = zerarMonteGuerra(monteGuerra, monteJogador1);
                    }
                } else if (comparaCartas(cartaJogador2, cartaJogador1)) {
                    monteJogador2.enqueue(cartaJogador1);
                    monteJogador2.enqueue(cartaJogador2);

                    if (ehGuerra) {
                        ehGuerra = zerarMonteGuerra(monteGuerra, monteJogador2);
                    }
                } else {
                    //em caso de empate será declarado "guerra"
                    ehGuerra = true;
                    monteGuerra.enqueue(cartaJogador1);
                    monteGuerra.enqueue(cartaJogador2);
                }
                qtdeJogadas++;
            }
        }

        if (qtdeJogadas >= 50000) {
            System.out.println("Limite de jogadas atingido!");
        } else {

            if (monteJogador1.isEmpty()) {
                System.out.println("Jogador 2 venceu!");
            }
            if (monteJogador2.isEmpty()) {
                System.out.println("Jogador 1 venceu!");
            }
        }
    }

    static boolean comparaCartas(Object carta1, Object carta2) {
        return (int) carta1 > (int) carta2;
    }

    static boolean zerarMonteGuerra(Fila monteGuerra, Fila monteJogador) {
        while (!monteGuerra.isEmpty()) {
            monteJogador.enqueue(monteGuerra.dequeue());
        }

        // retorna falso para encerrar a guerra
        return false;
    }
}
