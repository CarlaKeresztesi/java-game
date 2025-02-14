package org.example;

import java.util.ArrayList;

public class CardGame { //defined the instance vars - what we need for our deck of cards
        protected ArrayList<Card> deckOfCards; //a List of Arrays that will store Card objts - can be accessed by subcla
        private String name; //storing name of game

    public CardGame(String name) { //constructor
        this.name = name;
        deckOfCards = new ArrayList<>(); //a new empty ArrList<Card> - when game starts, deck is ready to be filled
        createDeck(); //filling the deck with cards-> so all of these ensure that a CardGame is initial. w a full deck
}

//Create the deck of 52 cards - loops through suits and symbols to create them
private void createDeck() {//can only be used inside this class and doesn't return anything
    String[] suits = {"\u2665", "\u2663", "\u2666", "\u2660"}; //Hearts, Clubs, Diamonds, Spades
    String[] symbols = { "2","3","4","5","6","7","8","9","10","J","Q","K","A"}; //ranks of a standard deck of cards
    int[] values = {2,3,4,5,6,7,8,9,10,11,12,13,14}; //numerical values of cards

    for (int i = 0; i < suits.length; i++) { //to loop through suits
        for (int j = 0; j < symbols.length; j++) { //to loop through symbols
            deckOfCards.add(new Card(suits[i], symbols[j], values[j])); //adds an instance obj of the Card class
        }                            //by calling the constructor of card to set the values for each field, then
    }                                  //add each card to the deck
}

    public ArrayList<Card> getDeckOfCards() {//will return an ArrayList of Card objects = a list of cards
        return deckOfCards; //using get to retrieve the value of a private instance variable
    } //Encapsulation - deckOfCards is protected - can only be accessed directly within the CardGame class
  //To allow other parts of the program to get the deck (without modifying it directly), a getter method like getDeck().
    // By using a getter method - controlled access to the deckOfCards, while keeping it encapsulated inside the class.

    //Deal a card from the deck
   public Card dealCard() {
        if(!deckOfCards.isEmpty()) {
            return deckOfCards.removeFirst();//removes and returns the top one
        } else { //if empty
            throw new IllegalStateException("The deck is empty! Game Over!");
               }
   }

   //Sort deck in number order










}//end of class definition



