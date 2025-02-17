package org.example;

public class Player {
        private String name;
        private boolean isPlaying;

        public Player(String name) {//constructor
            this.name = name;
            this.isPlaying = false;//to be set when game starts
        }

         public String getName() {//getter
             return name;
        }

        public boolean declareSnap(String input) {
            return input.equalsIgnoreCase("snap");
        }

        public void setPlaying(boolean isPlaying) {
            this.isPlaying = isPlaying;
        }

        public boolean isPlaying() {
            return isPlaying;
        }

        //Determines current player based on turn state
        public static Player getCurrentPlayer(boolean isPlayerOneTurn, Player player1, Player player2) {
            return isPlayerOneTurn ? player1 : player2;
        }

}//end of Player class
