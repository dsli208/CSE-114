//David S. Li, 110328771
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CosmicWimpout;

/**
 *
 * @author dsli
 */
public class Player {
    //The Player's score
    private int score = 0;
    //Has the player scored at least 35 on one of his first rolls?
    private boolean inGame = false;
    
    public boolean isInGame() {
        return inGame;
    }
    public void addScore(int i) {
        score += i;
    }
    /*public void addScore(int[] rolls) {
        if (score == -35) {
            setInGame();
        }
        else {
            double total = 0;
            for (int i: rolls) {
                total += i;
            }
            score += total;
        }
    }*/
    //return the player's score
    public int getScore() {
        return score;
    }
    public void setInGame() {
       /* int totalPoints = 0;
        for (int i: rolls) {
            totalPoints += i;
        }*/
        /*if (totalPoints >= 35) {
            if (inGame == false) {
                score = 0;
                inGame = true;
                System.out.println("The human player has entered the game!");
            }
        }*/
        if (inGame == false) {
            inGame = true;
            System.out.println("You have now entered the game!");
        }
    }
}
