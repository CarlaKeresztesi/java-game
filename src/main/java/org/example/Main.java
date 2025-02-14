package org.example;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("\u2665  \u2663  \u2666  \u2660  \u2665  \u2663  \u2666  \u2660");

        System.out.println("Hello, Friend!");

        System.out.println("Welcome to \u2665 \u2663 \u2666 \u2660 Snap \u2665 \u2663 \u2666 \u2660!");

        CardGame myGame = new CardGame("Snap");

        ArrayList<Card> deck = myGame.getDeckOfCards(); //calling the method in CardGame to get a deck of cards

        System.out.println("The deck contains: " + deck.size() + " cards.");  // Print the game name
//***********************************************************************************************************

        CardGame game = new CardGame("Snap!");

        System.out.println(game.dealCard());





    }//end of main
}