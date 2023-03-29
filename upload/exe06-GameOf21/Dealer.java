/*
 * Ehsan KH. Motlagh
 * student ID: 2340457
 * */

import java.security.SecureRandom;

public class Dealer extends Person {
    /*
     * dealing:
     *
     * 1-10 = represents same number
     * J,Q,K = 10
     *
     * */
    public int deal() {
        SecureRandom card = new SecureRandom();
        int cardValue = card.nextInt(13) + 1;
        return cardValue < 10 ? cardValue : 10;
    }
}
