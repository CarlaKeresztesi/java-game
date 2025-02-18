package org.example;

public class Card {
        private Suit suit;  //{"♥ Hearts♥", ♣ "Clubs♣", ♦ "Diamonds♦", ♠ "Spades♠"};
        private String symbol; //{ "2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        private int value;  //{2,3,4,5,6,7,8,9,10,11,12,13,14};

  public Card(Suit suit, String symbol, int value) { //constructor overloading
    this.suit = suit;
    this.symbol = symbol;
    this.value = value;
    }//end of constructor

    //Getters and setters
    public Suit getSuit() {
        return suit;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return symbol + " of " + suit;

    }


}//end of class definition




