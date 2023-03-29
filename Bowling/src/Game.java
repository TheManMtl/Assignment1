/*
 * Ehsan KH. Motlagh
 * student ID: 2340457
 * */

import java.util.Random;

public class Game {
    private int frame;//stores current frame
    private int sets;// amount of sets
    private Bowler[] bowlers; // players

    private Bowler currentBowler; // current player
    private int framePoints;// current frame points

    //constructor
    public Game(Bowler[] bowlers) {
        this.bowlers = bowlers; // game starts with players
        sets = 10; // default set amount
    }


    //getters and setters
    public Bowler getCurrentBowler() {
        return currentBowler;
    }

    public void setCurrentBowler(Bowler currentBowler) {
        this.currentBowler = currentBowler;
    }

    public int getFrame() {
        return frame;
    }

    public void setFrame(int frame) {
        this.frame = frame;
    }

    public int getSets() {
        return sets;
    }

    public void setSets(int sets) {
        this.sets = sets;
    }

    public void setBowlers(Bowler[] bowlers) {
        this.bowlers = bowlers;
    }

    public Bowler[] getBowlers() {
        return bowlers;
    }

    public int getFramePoints() {
        return framePoints;
    }

    public void setFramePoints(int framePoints) {
        this.framePoints = framePoints;
    }

    // calling a frame to roll and storing total points of each player
    public void start() {

        rollFrame();
        int total = currentBowler.getPoints();
        total += framePoints;
        currentBowler.setPoints(total);
    }

    //rolls a frame of game with 2 shots
    public void rollFrame() {
        Random rnd = new Random();
        int pins = 11;//0 is considered as well in case any pins goes down
        int pinsDown1;
        int pinsDown2;

        pinsDown1 = rnd.nextInt(pins);
        if (pinsDown1 == 10) framePoints = 20;
        pins -= pinsDown1;
        pinsDown2 = rnd.nextInt(pins);
        framePoints = pinsDown1 + pinsDown2;
        if (framePoints == 10) framePoints = 15;
    }

    //finding the winner
    public Bowler winner(Bowler[] bowlers) {
        int max = bowlers[0].getPoints();
        currentBowler = bowlers[0];
        for (Bowler b : bowlers) {
            if (b.getPoints() > max) {
                max = b.getPoints();
                currentBowler = b;
            }
        }
        return currentBowler;
    }
}
