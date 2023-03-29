/*
 * Ehsan KH. Motlagh
 * student ID: 2340457
 * */

public class Player extends Person{

    private boolean isSoft; // represents if there is an Ace in the hand
    private int[] aceValuesSum; // stores sum of hand if there is an Ace
    private int thirdCard;
    public int getThirdCard() {
        return thirdCard;
    }
    public void setThirdCard(int thirdCard) {
        this.thirdCard = thirdCard;
    }
    public boolean isSoft() {
        return isSoft;
    }
    public void setIsSoft(boolean isSoft) {
        this.isSoft = isSoft;
    }
    public int[] getAceValuesSum() {
        return aceValuesSum;
    }
    public void setAceValuesSum(int[] aceValuesSum) {
        this.aceValuesSum = aceValuesSum;
    }



    //decides when there is an Ace in hand
   /* public int decide(int hitOrStand){
        if (hitOrStand==1)
    }*/



}
