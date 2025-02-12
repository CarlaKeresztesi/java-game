package org.example;

public class Card {
        private String suit; //making fields private so they can't be modified from outside the class
        private String symbol;
        private int value;

  public Card(String suit, String symbol, int value) { //constructor overloading
    this.suit = suit;
    this.symbol = symbol;
    this.value = value;
    }//end of constructor

    //Getters and setters
    public String getSuit() {
        return suit;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getValue() {
        return value;
    }



}//end of class definition




