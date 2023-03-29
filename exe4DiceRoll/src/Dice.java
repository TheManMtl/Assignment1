/*
 * Ehsan KH. Motlagh
 * student ID: 2340457
 * */

import java.security.SecureRandom;

public class Dice {


    // gets dice number
    public int roll() {
        SecureRandom rnd = new SecureRandom();
        return (rnd.nextInt(6) + 1);
    }
}
