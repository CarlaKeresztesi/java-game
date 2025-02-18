package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import org.example.Card;
import java.util.Scanner;

public abstract class CardGame {
    protected ArrayList<Card> deckOfCards;
    protected Scanner scanner = new Scanner(System.in);

    public CardGame() { //constructor
        deckOfCards = new ArrayList<>();
        createDeck();
    }//end of constructor

    //Create the deck of 52 cards - loops through suits and symbols to create them
    private void createDeck() {
        Suit[] suits = {Suit.HEARTS, Suit.CLUBS, Suit.DIAMONDS, Suit.SPADES};
        String[] symbols = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        int[] values = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};

        for (int i = 0; i < suits.length; i++) { // loop through suits
            for (int j = 0; j < symbols.length; j++) { // loop through symbols
                deckOfCards.add(new Card(suits[i], symbols[j], values[j]));
            }
        }
    }

    public ArrayList<Card> getDeckOfCards() {
        return deckOfCards;
    }

    //Deal a card from the deck
    public Card dealCard() {
        if (!deckOfCards.isEmpty()) {
            return deckOfCards.removeFirst();//removes and returns the top one
        } else { //if empty
            throw new IllegalStateException("The deck is empty!");
            // OR System.out.println("The deck is empty!");
            //    return null;
        }
    }

    //Sort deck in number order - using lambda function
    public void sortDeckInNumberOrder() {
        deckOfCards.sort((a, b) -> a.getValue() - b.getValue());
        // deckOfCards.sort(Comparator.comparingInt(Card::getValue));

    }

    //Sort deck into suits - using method references and comparator
    public void sortDeckIntoSuits() {
        deckOfCards.sort(Comparator.comparing(Card::getSuit).thenComparingInt(Card::getValue));
    }

    //Shuffle the deck - using the root interface of Java collection classes
    public void shuffleDeck() {
        Collections.shuffle(deckOfCards);
    }

    //Deck printing method
    public void printDeck() {
        for(Card card : deckOfCards) {
            System.out.println(deckOfCards);
        }
    }

    //Prompt method - to ask user to play again - if game over or win
    protected void promptPlayAgain() {
        System.out.println("\nWould you like to play again?\uD83D\uDE00 \nType 'yes' to restart or 'exit' to quit.");
        String response = scanner.nextLine().trim().toLowerCase();
        if (response.equals("yes")) {
            resetGame();
        } else {
            System.out.println("Thanks for playing! Bye Bye! \uD83D\uDC4B");
            scanner.close();
            System.exit(0);
        }

    }//end of promptPlayAgain()

    //Reset method
    protected abstract void resetGame();

}//end of class definition