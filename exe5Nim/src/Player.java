/*
 * Ehsan KH. Motlagh
 * student ID: 2340457
 * */

import java.security.SecureRandom;
public class Player {

    private int stonesTaken;
    private SecureRandom rnd;

    public Player(){
        this.rnd = new SecureRandom();
        this.stonesTaken = rnd.nextInt(3)+1;
    }

    public int getStonesTaken() {
        return stonesTaken;
    }

    public void setStonesTaken(int stonesTaken) {
        this.stonesTaken = stonesTaken;
    }

    public SecureRandom getRnd() {
        return rnd;
    }

    public void setRnd(SecureRandom rnd) {
        this.rnd = rnd;
    }

    /*
    * number of stones player takes.
    * if remaining stones are greater than 3 method will generate random number between 1-3
    * if remaining stones are between 1-3 method will produce random number between remaining stones
    * */
    public void numberOfStones(int max){
        this.stonesTaken = (max > 3) ?  rnd.nextInt(3)+1 : rnd.nextInt(max)+1 ;
    }

}
