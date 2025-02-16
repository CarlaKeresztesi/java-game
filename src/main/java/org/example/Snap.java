package org.example;

import java.util.Scanner;

public class Snap extends CardGame {

    private Scanner scanner;
    private Card previousCard;

    public Snap() { //constructor overloading
        super(); //calling the constructor of the parent class - CardGame
        this.scanner = new Scanner(System.in); //a new Scanner obj created to take input from console
        shuffleDeck(); //calling this method from CardGame when the game starts
        previousCard = null; //as we are starting the game, there is no previous card so setting it to null
    }//end of constructor

    //Method to play Snap
    public void playSnap() {

        while (true) {
            System.out.println("Press Enter to deal a card");
            scanner.nextLine();//method of Scanner class that reads an entire line of text from console until the user
            //presses Enter

            Card currentCard = dealCard();
            System.out.println("The current card is: " + currentCard);

            if (previousCard != null && currentCard.getSymbol().equals(previousCard.getSymbol())) {
                System.out.println("Snap! Print the word 'snap' to win the game!");
                String userInput = scanner.nextLine(); //waits for user input
                if ("snap".equalsIgnoreCase(userInput)) { //check if the string is = userInput, ignoring case sensitivity
                    System.out.println("✨✨✨You won!!");
                    System.exit(0); //ends game if 'snap' typed correctly
                } else {
                    System.out.println("Wrong input. Game on!");
                }
            } else {
                System.out.println("No Snap! Game continues...");

                //update previousCard for the next turn:
                previousCard = currentCard; //store the current card as previous for next turn
            }
        }//end of while loop
    }//end of playSnap()
}//end of Snap class