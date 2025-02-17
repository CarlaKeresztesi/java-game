package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import org.example.Card;

public class CardGame { //defines the instance vars - what we need for our deck of cards
    protected ArrayList<Card> deckOfCards; //a List of Arrays that will store Card objts - can be accessed by subclass

    public CardGame() { //constructor
        deckOfCards = new ArrayList<>(); //a new empty ArrList<Card> - when game starts, deck is ready to be filled
        createDeck(); //filling the deck with cards-> so all of these ensure that a CardGame is initial. w a full deck
    }

    //Create the deck of 52 cards - loops through suits and symbols to create them
    private void createDeck() {//can only be used inside this class and doesn't return anything
        Suit[] suits = {Suit.HEARTS, Suit.CLUBS, Suit.DIAMONDS, Suit.SPADES};// decl and init an array of Suit(enum) objects
        String[] symbols = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        int[] values = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14}; //numerical values of cards

        for (int i = 0; i < suits.length; i++) { //to loop through suits
            for (int j = 0; j < symbols.length; j++) { //to loop through symbols
                deckOfCards.add(new Card(suits[i], symbols[j], values[j])); //adds an instance obj of the Card class
            }                            //by calling the constructor of card to set the values for each field, then
        }                                  //add each card to the deck
    }

    public ArrayList<Card> getDeckOfCards() {//will return an ArrayList of Card objects = a list of cards
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
        deckOfCards.sort((a, b) -> a.getValue() - b.getValue());  //sorting based on numerical value
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








}//end of class definition