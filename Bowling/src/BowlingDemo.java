/*
 * Ehsan KH. Motlagh
 * student ID: 2340457
 * */

import java.util.Scanner;

public class BowlingDemo {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.print("How many bowlers willing to play? (max 5) ");
        int players = reader.nextInt();
        if (players >= 1 && players < 6) {// max players allowed: 5, min:1
            String name;

            Bowler[] bowlers = new Bowler[players];// players amount is created

            //creating bowlers with name
            for (int i = 0; i < players; i++) {
                System.out.printf("Enter player %d name: ", (i + 1));
                name = reader.next();
                bowlers[i] = new Bowler(name);
            }

            System.out.println("Thank you and good luck!");
            System.out.println("Press any key to start the game");
            reader.next();

            // create game with 10 sets
            Game game = new Game(bowlers);
            for (int set = 0; set < game.getSets(); set++) {//will play as long as sets are done(by default is 10)
                game.setFrame(set + 1); // current frame
                for (Bowler bowler : bowlers) {
                    game.setCurrentBowler(bowler);
                    game.start();
                    System.out.printf("%s Frame %d score: %d\n" +
                                    "total score: %d\n"
                            , bowler.getName()
                            , game.getFrame()
                            , game.getFramePoints()
                            , bowler.getPoints());
                }
            }

            //Announce the winner
            Bowler winner = game.winner(bowlers);
            System.out.println("FINAL RESULTS");
            System.out.printf("%s score: %d", winner.getName(), winner.getPoints());

        } else {
            System.out.println("Not allowed. come back again!");
        }
        reader.close();
    }
}
