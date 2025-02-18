<h1 align="center">♠️♥️♦️♣️ Snap card game ♠️♥️♦️♣️</h1>


## Overview

&nbsp;&nbsp;&nbsp;&nbsp; Snap is a fun and interactive game built with Java, demonstrating the key object-oriented programming
(OOP) principles, <br> efficient game logic, and user input handling. It serves as an excellent showcase of Java expertise,
including class inheritance, <br> array manipulation and real-time user interaction.


## Features

* **Object-Oriented Design:** utilizes classes such as Card, CardGame, Player, Snap, to encapsulate behaviour and structure.
* **Deck Management:** Implements methods for sorting, shuffling and dealing mechanics.
* **Interactive Gameplay:** Players take turns drawing cards and must react quickly to win.
* **Timed Input:** Introduces a two second reaction window for players to declare "snap" when matching cards appear.
* **Two-Player Mode:** Enhances the game by allowing competitive play between two participants.


## ▶️How to run

1. **Clone the repository** with Bash or the terminal emulator in your IntelliJ IDEA, using the command:

   **git clone https://github.com/CarlaKeresztesi/java-game.git**

2. **Navigate to the project folder** using the cd command: **cd java-game**

3. **Open the project in IntelliJ IDEA**

4. **Set up Java SDK:**
      * Ensure your SDK is set to a valid Java version (like 21.0.6)
      * If necessary, add your installed JDK.

5. **Run the Game:**
      * Locate the **Main** method in your Java IDE;
      * Click the green **Run** button (triangle icon) in IntelliJ.
6.  **Play!**
      * Follow the console prompts to draw cards and play <ins>Snap!</ins> 



## 📜Game Rules

● Players take turns by pressing Enter in the command line.

● Each turn, a new card is dealt from the deck.

● If two consecutive cards match in symbol, the “player” has 2 seconds to submit the word “snap” in order to win (and the game <br> ends). If they don’t type it in time, they lose and the game ends.


## 🧬Project Structure

This project is divided into multiple stages, each adding complexity and functionality.

(**Stage 1** and **Stage 2** are the building blocks for any card game.)

### **Stage 1**

-   [x] create CardGame class;  
-   [x] create a deck of cards using classes, ArrayLists and methods;
-   [x] ArrayList<Card> for the deckOfCards that contains all 52 cards, <br>
this will populate when game is constructed;
-   [x] use CardGame in the constructor;
-   [x] getDeck() method that lists out the cards in the deck;
-   [x] create Card class;
-   [x] has a String suit - use the Unicode characters of Heart♥, Club♣, Diamond♦ and Spade ♠;
-   [x] has a String symbol (2,3,4,5,6,7,8,9,10,J,Q,K,A);
-   [x] has an int value (2,3,4,5,6,7,8,9,10,11,12,13,14);
-   [x] has a toString() method that describes the class;

### **Stage 2** 

-   [x] card dealCard() - takes the card from the top of the deck and returns it;
-   [x] ArrayList<Card> sortDeckInNumberOrder() - sorts the deck in number order and stores
    the new shuffled deck back into the deckOfCards attribute;
-   [x] ArrayList<Card> sortDeckIntoSuits() - sorts the deck into suits and stores the new
    shuffled deck back into the deckOfCards attribute;
-   [x] ArrayList<Card> shuffleDeck() - shuffles the deck into a random order and stores the new shuffled deck back into
    the deckOfCards attribute;

### **Stage 3**

-   [x] create a class for Snap that extends CardGame.  This class should use the methods defined above, as well as <br>
some new ones, to enable the user to play the game "Snap" according to the following rules:
-   [x] by pressing ENTER in the command line, the user takes their turn;
-   [x] each turn, a new card is dealt from the deck;
-   [x] the game continues until two cards in a row have the same symbol, at which point the “player” wins if they type <br>
'snap' and the game ends. If user doesn't type 'snap', game continues.
-   [x] create constructor method for Snap class;
-   [x] add greeting and welcome message;
-   [x] add scanner within constructor of Snap for user input;
-   [x] call shuffleDeck() within constructor of Snap;
-   [x] initialize previousCard to null at every start of the game; 
-   [x] call scanner to read userInput, ignoring case sensitivity.


### **Stage 4**

-   [x] create a Player class;
-   [x] enable the snap game to be two players, with the users taking it in turns to go;
-   [x] if the snap occurs on the user's turn, they win;
-   [x] add a timer so that when there is a snap opportunity, the player has 2 seconds to submit the word “snap” in 
order to win. <br> If they don’t type it in time, they lose.


## 🪄Future Enhancements

* **GUI Implementation:** Replace console-based interactions with a graphical user interface.
* **Score-keeping:** Track wins and display leader-boards.


## 💻Technologies Used

* **Java 21** (or compatible version)
* **IntelliJ IDEA** (recommended IDE)
* **OOP Principles** (Abstraction, Encapsulation, Polymorphism and Inheritance)
* **Collections Framework** (ArrayLists for deck management)


## 🤝Contributions and Feedback 

Contributions and feedback are welcome! Hope you enjoy the game as much as I did working on it!


<p align="center">
  <img src="signature.png" alt="signature" width="150"/>
</p>


