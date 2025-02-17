package org.example;

import java.util.Scanner;

public class Snap extends CardGame {
    private Card previousCard;
    private Player player1, player2;
    private boolean isPlayerOneTurn;
    private boolean gameOver;


    public Snap(Player player1, Player player2) { //constructor overloading
        super(); //calling the constructor of the parent class - CardGame
        this.player1 = player1;
        this.player2 = player2;
        shuffleDeck(); //calling this method from CardGame when the game starts
        previousCard = null; //as we are starting the game, there is no previous card so setting it to null
        gameOver = false;
        this.isPlayerOneTurn = true;

        System.out.println("\n\u2665  \u2663  \u2666  \u2660  \u2665  \u2663  \u2666  \u2660  \u2665  \u2663  \u2666  \u2660  \u2665  \u2663  \u2666  \u2660  \u2665  \u2663  \u2666  \u2660  \u2665  \u2663  \u2666  \u2660  \u2665  \u2663  \u2666  \u2660  \u2665  \u2663  \u2666  \u2660");

        System.out.println("\nHello, Friend!");

        System.out.println("\nWelcome to \u2665 \u2663 \u2666 \u2660 Snap \u2665 \u2663 \u2666 \u2660!");

    }//end of constructor

    //Method to play Snap
    public void playSnap() {

        while (!gameOver) {

            Player currentPlayer = Player.getCurrentPlayer(isPlayerOneTurn, player1, player2);
            currentPlayer.setPlaying(true);
            System.out.println("\n " + currentPlayer.getName() + " is playing!\uD83E\uDE84 Press Enter to deal a card");

            scanner.nextLine();//method of Scanner class that reads an entire line of text from console until the user
                                                                        //presses Enter
            if (getDeckOfCards().isEmpty()) {
                System.out.println("No more cards left in the deck! Using cards in hand.");
                shuffleDeck();//re-shuffle the discarded cards back into the deck
            }

            Card currentCard = dealCard();
            System.out.println("The current card is: " + currentCard);

            if (previousCard != null && currentCard.getSymbol().equals(previousCard.getSymbol())) {
                System.out.println("\n\uD83E\uDEF0Snap!\uD83E\uDEF0 " + currentPlayer.getName() + ", type 'snap' within 2 seconds to win the game!");

                long startTime = System.currentTimeMillis();//start timer
                String userInput = "";

                while (System.currentTimeMillis() - startTime <= 2000) { //waits for user to input text in 2secs
                    if (scanner.hasNextLine()) {
                        userInput = scanner.nextLine();
                        break;
                    }
                }

                if ((System.currentTimeMillis() - startTime) > 2000) {
                    System.out.println("\nToo slow!\uD83E\uDDA5 Game Over!\uD83D\uDED1");
                    promptPlayAgain();
                    return;
                } else if (currentPlayer.declareSnap(userInput)) {
                    System.out.println("✨✨✨ " + currentPlayer.getName() + " won\uD83E\uDD47\uD83C\uDFC6!!✨✨✨");
                    promptPlayAgain();
                    return;
                } else {
                    System.out.println("Incorrect input! Game Over!\uD83D\uDED1");
                    promptPlayAgain();
                    return;
                }

            } else {
                System.out.println("No Snap! Game continues... \uD83E\uDE84");

                //update previousCard for the next turn:
                previousCard = currentCard; //store the current card as previous for next turn
                isPlayerOneTurn = !isPlayerOneTurn; //switch to player2
            }

        }//end of while loop

        promptPlayAgain();

    }//end of playSnap()

    @Override
    protected void resetGame() {
    gameOver = false;
    previousCard = null;
    shuffleDeck();
    playSnap();
    }

}//end of Snap class