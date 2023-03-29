/*
 * Ehsan KH. Motlagh
 * student ID: 2340457
 * */

public class Bowler {
    private String name; // name of player
    private int points; // stores total points

    public Bowler(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
