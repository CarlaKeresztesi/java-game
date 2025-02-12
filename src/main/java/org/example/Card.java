package org.example;

public class Card { //making fields private so they can't be modified from outside the class
        private String suit;  //{"\u2665Heart", \u2663 "Club", \u2666 "Diamond", \u2660 "Spade"};
        private String symbol; //{ "2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        private int value;  //{2,3,4,5,6,7,8,9,10,11,12,13,14};

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

    @Override //we Override the Object - parent class - to use a customised Card obj representation
    public String toString() { //toString() returns a String representation of an Object,
        return symbol + " of " + suit;  //to describe the card in a readable way
    }


    }//end of class definition


-   [ ]
-   [ ]
-   [ ]
-   [ ]


