/*
 * Ehsan KH. Motlagh
 * student ID: 2340457
 * */

import java.util.Scanner;

public class Game {

    private Player player;
    private Dealer dealer;

    public Game(Player player, Dealer dealer) {
        this.player = player;
        this.dealer = dealer;
    }

    public int start(Scanner reader) {

        int[] dealerHand = new int[2];
        int[] playerHand = new int[2];
        int aceIndex = -1; // place of ace in hand

        //deal two cards one by one
        for (int i = 0; i < dealerHand.length; i++) {
            dealerHand[i] = dealer.deal();
            playerHand[i] = dealer.deal();
            if (playerHand[i] == 1) {
                player.setIsSoft(true);
                aceIndex = i; // knowing the ace position
            }
        }
        //setting hands
        dealer.setBothCards(dealerHand);
        player.setBothCards(playerHand);

        // setting sum of hands
        dealer.setSumHands(dealer.getSumTwoHands());
        player.setSumHands(player.getSumTwoHands());

        if (player.isSoft()) {

            int[] valuesAce = new int[2];
            //adding ace value to other hand value by knowing the ace position
            valuesAce[0] = aceIndex == 0 ? 1 + player.getBothCards()[1] : 1 + player.getBothCards()[0];
            valuesAce[1] = aceIndex == 1 ? 11 + player.getBothCards()[0] : 11 + player.getBothCards()[1];

            player.setAceValuesSum(valuesAce);
            System.out.printf("Player cards are %d , %d \n", player.getBothCards()[0], player.getBothCards()[1]);
            System.out.printf("Player 1 sum of hand is: %d or %d\n", player.getAceValuesSum()[0]
                    , player.getAceValuesSum()[1]);
        } else {
            int sum = player.getSumHands();
            System.out.printf("Player cards are %d , %d \n", player.getBothCards()[0], player.getBothCards()[1]);
            System.out.printf("Player 1 sum of hand is: %d \n", sum);
        }
        //Scanner reader = new Scanner(System.in);
        System.out.print("Player 1 HIt(1) or Stand(2): ");
        int hitOrStand = reader.nextInt();
        while (hitOrStand != 1 && hitOrStand != 2) {
            System.out.print("Wrong entry please enter 1 for Hit, and 2 for Stand: ");
            hitOrStand = reader.nextInt();
        }

        if (hitOrStand == 1) { // player requests 1 more card by entering 1
            player.setThirdCard(dealer.deal());
            System.out.printf("Third card is: %d\n", player.getThirdCard());
            int aceValLower;
            if (player.getThirdCard() == 1) { // if card is ace sum with the lower value
                aceValLower = Math.min(player.getAceValuesSum()[0], player.getAceValuesSum()[1]);
                player.setSumHands(player.getSumTwoHands() + aceValLower);
            } else { //card is not ace normal sum
                player.setSumHands(player.getSumHands() + player.getThirdCard());
            }
        }
        /*
         * 1 dealer is the winner
         * 2 player is the winner
         * 0 game is tie
         * */
        if (player.isSoft()) player.setSumHands(Math.max(player.getAceValuesSum()[0], player.getAceValuesSum()[1]));
        if (player.getSumHands() > 21) return 1; // dealer is winner
        if (dealer.getSumTwoHands() == player.getSumHands()) return 0;
        int winner = dealer.getSumTwoHands() > player.getSumHands() ? 1 : 2;

        System.out.printf("Dealer hand is %d, and player hand is %d \n",
                dealer.getSumTwoHands(), player.getSumHands());
        return winner;
    }
}
