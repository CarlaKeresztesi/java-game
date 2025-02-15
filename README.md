# Snap card game

A fun and interactive game built with Java! This project showcases object-oriented programming principles, game logic, 
and user interaction.



# How to run

1. Clone the repository using Bash or the terminal emulator in your IntelliJ IDEA:

   git clone https://github.com/CarlaKeresztesi/java-game.git

2. Navigate to the project folder using the cd command

3. Open the project in IntelliJ IDEA - 

## Rules

● By pressing Enter in the command line, the user takes their turn.

● Each turn, a new card is dealt from the deck.

● The game continues until two cards in a row have the same symbol, at which point the “player” has 2 seconds to 
submit the word “snap” in order to win (and the game ends). If they don’t type it in time, they lose and the game ends.


## Project Requisites
(**Stage 1** and **Stage 2** are the building blocks for any card game.)

-   [x] print greeting and welcome message;

### **Stage 1**

-   [x] create a deck of cards using classes, ArrayLists and methods; 
-   [x] create CardGame class;
-   [x] ArrayList<Card> for the deckOfCards that contains all 52 cards;
-   [x] the above will populate when game is constructed;
-   [x] use CardGame in the constructor;
-   [x] getDeck() method that lists out the cards in the deck;

-   [x] create Card class;
-   [x] has a String suit - use the Unicode characters of heart♥(\u2665), club♣(\u2663), diamond♦ (\u2666) and 
 spade ♠ (\u2660);
-   [x] has a String symbol (2,3,4,5,6,7,8,9,10,J,Q,K,A);
-   [x] has an int value (2,3,4,5,6,7,8,9,10,11,12,13,14);
-   [x] has a toString() method that describes the class;

### **Stage 2** - core functionality

-   [x] card dealCard() - takes the card from the top of the deck and returns it;
-   [x] ArrayList<Card> sortDeckInNumberOrder() - sorts the deck in number order and stores
    the new shuffled deck back into the deckOfCards attribute;
-   [x] ArrayList<Card> sortDeckIntoSuits() - sorts the deck into suits and stores the new
    shuffled deck back into the deckOfCards attribute;
-   [x] ArrayList<Card> shuffleDeck() - shuffles the deck into a random order and stores the new shuffled deck back into
    the deckOfCards attribute;

### **Stage 3**

-   [ ] create a class for Snap that extends CardGame.  This class should use the methods defined above, as well as 
some new ones, to enable the user to play the game "Snap" according to the following rules:
-   [ ] by pressing ENTER in the command line, the user takes their turn;
-   [ ] each turn, a new card is dealt from the deck;
-   [ ] the game continues until two cards in a row have the same symbol, at which point the “player” wins and 
the game ends.
-   [ ] create constructor method for Snap class;
-   [ ] add scanner for user input;
-   [ ]

### **Stage 4**

-   [ ] create a Player class;
-   [ ] enable the snap game to be two players, with the users taking it in turns to go;
-   [ ] if the snap occurs on the user's turn, they win;
-   [ ] add a timer so that when there is a snap opportunity, the player has 2 seconds to submit the word “snap” in 
order to win. If they don’t type it in time, they lose.








