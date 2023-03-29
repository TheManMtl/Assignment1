/*
 * Ehsan KH. Motlagh
 * student ID: 2340457
 * */

import java.util.Scanner;

public class DiceRollDemo {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        //Dices
        Dice diceA = new Dice();
        Dice diceB = new Dice();

        //Player
        DRPlayer player = new DRPlayer();
        player.setStartingScore(1000);

        int currentScore = player.getStartingScore(); // accumulates total score
        int myCall; // low or high
        int dicesSum; //sum two dice
        int risk; // points to risk

        System.out.println("You have " + currentScore + " points.");
        do {
            System.out.print("How many points do you want to risk? (-1 to quit) ");
            risk = reader.nextInt();
            if (risk == -1) break; // quit app if -1 entered
            else player.setPointsToRisk(risk);
            System.out.print("Make a call (0 for low, 1 for high): ");
            myCall = reader.nextInt();
            dicesSum = diceA.roll() + diceB.roll();

            //game rule sets the high or low
            player.gameRule(dicesSum);

            System.out.println("You rolled: " + dicesSum);
            if (dicesSum == 7 || myCall != player.getHighOrLow())
                currentScore -= player.getPointsToRisk();

            else if (myCall == player.getHighOrLow())
                currentScore += (player.getPointsToRisk() * 2);

            System.out.println("You now have " + currentScore + " Points");

        } while (true);

        reader.close();
    }

}
