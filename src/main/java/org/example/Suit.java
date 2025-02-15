package org.example;

public enum Suit {
    HEARTS("\u2665"),
    CLUBS("\u2663"),
    DIAMONDS("\u2666"),
    SPADES("\u2660");

    private final String symbol;

    Suit(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return symbol;
    }



}
