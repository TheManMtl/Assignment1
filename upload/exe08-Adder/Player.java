/*
 * Ehsan KH. Motlagh
 * student ID: 2340457
 * */

public class Player {

    private int result;
    private int points;

    public int getPoints() {
        return points;
    }



    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    //accumulating points
    public void setPoints(int points) {
        this.points += points;
    }
}
