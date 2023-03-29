/*
 * Ehsan KH. Motlagh
 * student ID: 2340457
 * */

public class Person {
    private int[] bothCards;
    private int sumHands;

    public int getSumTwoHands() {
        return bothCards[0]+bothCards[1];
    }

    public int getSumHands() {
        return sumHands;
    }

    public void setSumHands(int sumHands) {
        this.sumHands = sumHands;
    }

    public int[] getBothCards() {
        return bothCards;
    }

    public void setBothCards(int[] bothCards) {
        this.bothCards = bothCards;
    }
}
