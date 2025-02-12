package org.example;

import java.util.ArrayList;

public class CardGame { //defined the instance vars - what we need for our deck of cards
        protected ArrayList<Card> deckOfCards; //a List of Arrays that will store Card objts - can be accessed by subcla
        private String name; //stores name of game

    public CardGame(String name) { //constructor
        this.name = name;
        deckOfCards = new ArrayList<>();} //a new empty ArrList<Card> - when game starts, deck is ready to be filled


}//end of class definition



