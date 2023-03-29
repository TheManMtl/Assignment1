/*
 * Ehsan KH. Motlagh
 * student ID: 2340457
 * */

import java.security.SecureRandom;
import java.util.Scanner;

public class Adder {
    private int numA;
    private int numB;
    private Player player;

    public Adder() {
        this.player = new Player();
    }

    public String toString() {
        return "Your score is: " + player.getPoints();
    }

    public boolean start(Scanner reader) {

        numA = generateNumber();
        numB = generateNumber();
        int sum = numA + numB;
        int tries = 3;
        int userGuess;
        System.out.printf("%d + %d = ", numA, numB);
        userGuess = reader.nextInt();
        tries--;
        if (userGuess == 999) return false;
        player.setResult(userGuess);

        while (tries != 0 && sum != player.getResult()) {
            tries--;
            System.out.print("Wrong Answer. Enter another answer:");
            player.setResult(reader.nextInt());
        }


        switch (tries+1) {
            case 3:
                player.setPoints(5);
                break;
            case 2:
                player.setPoints(3);
                break;
            case 1:
                player.setPoints(1);
                break;
            default:
                player.setPoints(0);
        }
        return true;
    }

    private int generateNumber() {
        return new SecureRandom().nextInt(20) + 1;
    }
}
