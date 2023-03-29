/*
 * Ehsan KH. Motlagh
 * student ID: 2340457
 *
 * 56m
 * */
import java.security.SecureRandom;
import java.util.Scanner;
public class Nim2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Player ai = new Player();
        SecureRandom rnd = new SecureRandom();
        int remainingStones = rnd.nextInt(15) + 15;

        //when false it is computer
        boolean takeTurn = true;

        System.out.println(remainingStones + " stones to starts with");

        while (remainingStones > 0) {

            if (takeTurn) {//player section
                System.out.print("How many stones you take: ");
                int in = reader.nextInt();
                if (in >= 1 && in <= 3) {
                    if (in <= remainingStones) {
                        remainingStones -= in;
                        takeTurn = false;

                        System.out.println("Player 1 takes " + in + " stone.");
                        if (remainingStones == 0) {
                            System.out.println("Player 1 loses!");
                        }
                    } else
                        System.out.println("Remaining Stones are less than you are willing to take.");
                } else
                    System.out.println("Allowed amount is between 1-3");
            } else {// computer section
                takeTurn = true;
                ai.numberOfStones(remainingStones);
                remainingStones -= ai.getStonesTaken();

                System.out.println("Computer takes " + ai.getStonesTaken() + " stone.");
                if (remainingStones == 0) {
                    System.out.println("Computer loses!");
                }
            }
            System.out.println(remainingStones + " Stones left.");
        }
        reader.close();
    }

}
