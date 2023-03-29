/*
 * Ehsan KH. Motlagh
 * student ID: 2340457
 * */

import java.util.Scanner;
public class Demo {

    public static void main(String[] args) {

        //game
        Dealer dealer = new Dealer();
        Player player = new Player();
        Game game = new Game(player, dealer);
        Scanner reader = new Scanner(System.in);
        char statusGame;
        do {
            int winner = game.start(reader);
            if (winner == 1)
                System.out.println("Dealer is winner");
            else if (winner == 2)
                System.out.println("player is winner");
            else
                System.out.println("game is tie");

            System.out.print("(s)top or any key to continue: ");

            statusGame = reader.next().charAt(0);
        } while (statusGame != 's');//s will stop the game

        reader.close();
    }
}
