/*
 * Ehsan KH. Motlagh
 * student ID: 2340457
 *
 * 95m
 * */

public class DRPlayer {
    private int StartingScore;
    private int totalPoints;
    private int pointsToRisk;
    private int highOrLow;


    public int getStartingScore() {
        return StartingScore;
    }

    public void setStartingScore(int startingScore) {
        StartingScore = startingScore;
    }

    public int getPointsToRisk() {
        return pointsToRisk;
    }

    public void setPointsToRisk(int pointsToRisk) {
        this.pointsToRisk = pointsToRisk;
    }

    public int getHighOrLow() {
        return highOrLow;
    }

    public void setHighOrLow(int highOrLow) {
        this.highOrLow = highOrLow;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(int totalPoints) {
        this.totalPoints = totalPoints;
    }

    /*
     * diceSum: sum of rolled dices.
     * return: 1 High -- 0 low
     * */
    public void gameRule(int diceSum) {
        if (diceSum >= 2 && diceSum <= 6) this.highOrLow = 0;
        else this.highOrLow = 1;
    }
}
