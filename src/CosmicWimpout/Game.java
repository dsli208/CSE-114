//David S. Li, 110328771
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 /*Coding issues to work on for this project: Factoring in the "Sun" dice, fixing the roll() method to account for wimping out and losing your points, changing players, implementing the driver class
Computer player
 */
package CosmicWimpout;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author dsli
 */
public class Game {

    boolean active;
    Scanner input = new Scanner(System.in);
    ArrayList diceRolls;
    int goal;
    int plays = 0;
    Player p1 = new HumanPlayer();
    Player p2 = new ComputerPlayer();
    Player activePlayer;

    public boolean getActive() {
        return active;
    }

    public Game() {
        active = true;
        System.out.println("Welcome to Cosmic Wimpout!");
        System.out.print("Enter a goal for this game: ");
        this.goal = input.nextInt();
        activePlayer = firstRoll();
        diceRolls = new ArrayList();
    }

    public void setPlayer() {
        activePlayer = (activePlayer.equals(p1)) ? p2 : p1;
        if (p2.getScore() >= goal) {
            System.out.println("Player 2 has won the game!");
            active = false;
            lastLick(p1);
        } else if (p1.getScore() >= goal) {
            active = false;
            System.out.println("Player 1 has won the game!");
            lastLick(p2);
        } else {
            System.out.println(((activePlayer.equals(p1)) ? "Player 1 " : "Player 2 ") + " is up!");
        }
    }

    public Player firstRoll() {
        int[] rolls = {2, 3, 4, 5, 6, 10};
        int roll1 = rolls[(int) (Math.random() * 6)];
        int roll2 = rolls[(int) (Math.random() * 6)];
        while (roll1 == roll2) {
            roll1 = rolls[(int) (Math.random() * 6)];
            roll2 = rolls[(int) (Math.random() * 6)];
        }
        System.out.println("Player 1 rolled " + roll1 + " and Player 2 rolled  " + roll2 + " on the first roll.");
        if (roll2 > roll1) {
            System.out.println("Player 2 is first");
            return p2;
        } else {
            System.out.println("Player 1 is first");
            return p1;
        }
    }

    public static int rollDice() {
        int[] rolls = {2, 3, 4, 5, 6, 10};
        return rolls[(int) (Math.random() * 6)];
    }

    public static int rollBlack() {
        int[] rolls = {2, 1, 4, 5, 6, 10};
        return rolls[(int) (Math.random() * 6)];
    }

    //roll() method for the first roll of each turn
    public void roll() {
        boolean hasSunDice = true;
        //clear the existing rolls first
        diceRolls.clear();
        boolean reRollNeeded = false;
        int sum = 0;
        //Roll the first four regular die
        for (int i = 0; i < 4; i++) {
            diceRolls.add(rollDice());
        }
        //Now roll the sun die
        diceRolls.add(rollBlack());
        //Print what you rolled
        for (int i = 0; i < diceRolls.size(); i++) {
            System.out.print(diceRolls.get(i) + " ");
        }
        System.out.println();
        //Count how many dice are equal - for each dice, find how many dice are equal to it
        for (int i = 0; i < diceRolls.size(); i++) {
            int equalElements = 0;
            for (int j = 0; j < diceRolls.size(); j++) {
                if (diceRolls.get(i) == diceRolls.get(j) || (int) diceRolls.get(j) == 1) {
                    equalElements++;
                }
            }
            //If there are five equal elements, it is a freight train
            if (equalElements == 5) {
                System.out.println("FREIGHT TRAIN!!!  5 " + (int)diceRolls.get(i) + "'s were rolled");
                if ((int) diceRolls.get(i) == 6) {
                    System.out.println("The player has won the game!");
                } else if ((int) diceRolls.get(i) == 10) {
                    System.out.println("Too many points!  You have been knocked out of the game");
                    System.exit(0);
                } else {
                    sum += ((int) diceRolls.get(i)) * 100;
                    reRollNeeded = true;
                }
            } //If there are three equal elements
            else if (equalElements >= 3) {
                reRollNeeded = true;
                System.out.println("FLASH!!!");
                System.out.println("Three " + diceRolls.get(i) + "'s were rolled");
                sum += ((int)diceRolls.get(i)) * 10;
                int elementsRemoved = 0;
                for (int j = 0; j < diceRolls.size(); j++) { //Remove matching elements, and make sure we only remove 3
                    if (j >= 0 && i >= 0) {
                        if ((diceRolls.get(j) == diceRolls.get(i) || (int)diceRolls.get(j) == 1) && j != i && elementsRemoved < 2) {
                            diceRolls.remove(j--);
                            if (i > 0) {
                                i--;
                            }
                            elementsRemoved++;
                            if (j == diceRolls.size() - 1) //If we remove the last die, assumed to be the sun die, we assume we do not have the sun die
                            {
                                hasSunDice = false;
                            }
                        }
                    }
                }
                //To ensure the counter does not get screwed up, we do not remove the index dice until the end of the the loop
                diceRolls.remove(i);
                break;
            }
        }
        //Remove any 5 or 10s (that are not in flashes) but add them to the sum before we do so
        for (int i = 0; i < diceRolls.size(); i++) {
            if ((int) diceRolls.get(i) == 5) {
                sum += 5;
                diceRolls.remove(i--);
            } else if (((int) diceRolls.get(i)) == 10) {
                sum += 10;
                diceRolls.remove(i--);
            }
        }
        System.out.println("Points scored on this roll: " + sum);
        //Gets the player in the game if they have scored at least 35 and they are not yet in the game
        if (sum >= 35 && activePlayer.isInGame() == false) {
            activePlayer.setInGame();
        }
        if (sum == 0) {
            System.out.println("Wimpout!");
            System.out.println("Your score stays at " + activePlayer.getScore());
            if (active == false && reRollNeeded == false) {
                //Simply end the "loop"
                System.out.println("In his last turn, " + ((activePlayer.equals(p1)) ? "Player 1 " : "Player 2 ") + " brought his final score to " + activePlayer.getScore());
            } else {
                setPlayer();
            }
        } /*else if (active == false && reRollNeeded == false) {
            //Simply end the "Loop"
        }*/ //On the first roll, if the player has not enough points to get in the game
        else if (activePlayer.isInGame() == false) {
            System.out.println("Sorry!  Not enough points to get in the game!");
            setPlayer();
        } else if (reRollNeeded == true) { //This is IF we need a reroll, therefore the below method will automatically be invoked
            roll(diceRolls, sum, hasSunDice);
        } else if (diceRolls.size() <= 0) {
            activePlayer.addScore(sum);
            System.out.println(((activePlayer.equals(p1)) ? "Player 1 " : "Player 2 ") + " ends their turn with " + activePlayer.getScore());
            if (active == false && reRollNeeded == false) {
                //Simply end the "loop"
                System.out.println("In his last turn, " + ((activePlayer.equals(p1)) ? "Player 1 " : "Player 2 ") + " brought his final score to " + activePlayer.getScore());
            } else {
                setPlayer();
            }
        } else { //If we don't need to reroll, therefore we will simply ask the player if he wants to or not
            System.out.println(((activePlayer.equals(p1)) ? "Player 1" : "Player 2") + " has currently accumulated " + sum + " points.");
            String s;
            if (activePlayer instanceof ComputerPlayer) {
                s = ((ComputerPlayer) activePlayer).respondToInput();
            } else {
                System.out.println("Would you like to roll again?  Y/N");
                s = input.next();
            }
            if (s.charAt(0) == 'Y' || s.charAt(0) == 'y') {
                roll(diceRolls, sum, hasSunDice);
            } else {
                System.out.println("You have ended your turn");
                activePlayer.addScore(sum);
                System.out.println("Your score is " + activePlayer.getScore());
                if (active == false && reRollNeeded == false) {
                    //End the loop, but print the score first
                    System.out.println("During the last lick, " + ((activePlayer.equals(p1)) ? "Player 1 " : "Player 2 ") + "brought his final score to " + activePlayer.getScore());
                } else {
                    setPlayer();
                }
            }

        }
    }

    /*public void roll() {
        diceRolls.clear();
        roll(diceRolls, 0, true);
    }*/
    public void roll(ArrayList a, int previousSum, boolean hasSunDice) {
        boolean newList = false;
        if (a.size() <= 0) {
            a.clear();
            newList = true;
        }
        boolean reRollNeeded = false;
        int sum = 0;
        if (newList == false) {
            for (int i = 0; i < a.size() - 1; i++) {
                int o = (int) a.get(i);
                //Ensures that rerolls do not fall on the same value
                while ((int) a.get(i) == o) {
                    a.set(i, (int) (Math.random() * 6));
                }
                a.set(i, rollDice());
            }
        } else {
            for (int i = 0; i < 4; i++) {
                a.add(rollDice());
            }
            a.add(rollBlack());
        }
        //We determine whether we have the sun die so as to determine whether to roll it or not
        if (hasSunDice == true && a.size() > 1) {
            a.set(a.size() - 1, rollBlack());
        } else {
            a.set(a.size() - 1, rollDice());
        }
        //Print the rolls
        for (int i = 0; i < a.size(); i++) {
            System.out.print(a.get(i) + " ");
        }
        System.out.println();
        //Determine if we have any equal elements
        for (int i = 0; i < a.size(); i++) {
            int equalelements = 0;
            for (int j = 0; j < a.size(); j++) {
                if (a.get(i) == a.get(j) || (int) a.get(i) == 1) {
                    equalelements++;
                }
            }
            //5 equal dice/freight train
            if (equalelements == 5) {
                System.out.println("FREIGHT TRAIN!!!  5 " + (int)a.get(i) + "'s were rolled");
                if (((int)a.get(i)) == 6) {
                    System.out.println("The player has won the game!");
                } else if (((int)a.get(i)) == 10) {
                    System.out.println("Too many points!  You have been knocked out of the game");
                    System.exit(0);
                } else {
                    sum += ((int)a.get(i)) * 100;
                    hasSunDice = true;
                    reRollNeeded = true;
                }
            } //FLASHES
            else if (equalelements >= 3) {
                System.out.println("FLASH!!!");
                System.out.println("Three " + a.get(i) + " 's were rolled");
                sum += (int) a.get(i) * 10;
                int elementsRemoved = 0;
                for (int j = 0; j < a.size(); j++) {
                    //The second part of the below if statement ensures that not too many elements are removed
                    if (j >= 0 && i >= 0) {
                        if ((a.get(j) == a.get(i)||(int)a.get(j) == 1) && j != i && elementsRemoved < 2) {
                            a.remove(j--);
                            if (i > 0) {
                                i--;
                            }
                            elementsRemoved++;
                            if (j == a.size() - 1) {
                                hasSunDice = false;
                            }
                        }
                    }
                }
                a.remove(i);
                reRollNeeded = true;
                break;
            }
        }
        //Note that if any of the above scenarios are met, all non-scoring dice (or all dice if a Freight Train) must be rerolled
        //Now count and remove all 5's and 10's
        for (int i = 0; i < a.size(); i++) {
            if ((int) a.get(i) == 5) {
                sum += 5;
                a.remove(i--);
            } else if (((int)a.get(i)) == 10) {
                sum += 10;
                a.remove(i--);
            }
        }
        System.out.println("Points scored on this roll: " + sum);
        //Wimpout if no points were scored on this roll
        if (sum == 0) {
            System.out.println("Wimpout!");
            System.out.println("Your score stays at " + activePlayer.getScore());
            if (active == false && reRollNeeded == false) {
                //Simply end the "loop"
                System.out.println("In his last turn, " + ((activePlayer.equals(p1)) ? "Player 1 " : "Player 2 ") + " brought his final score to " + activePlayer.getScore());
            } else {
                setPlayer();
            }
        } //Do we need to reroll?  If so, it will be automatically done here...
        else if (reRollNeeded == true) { //This is IF we need a reroll, therefore the below method will automatically be invoked
            roll(diceRolls, sum + previousSum, hasSunDice);
        } else if (a.size() <= 0) {
            activePlayer.addScore(sum + previousSum);
            System.out.println(((activePlayer.equals(p1)) ? "Player 1 " : "Player 2 ") + " ends their turn with " + activePlayer.getScore());
            if (active == false && reRollNeeded == false) {
                //Simply end the "loop"
                System.out.println("In his last turn, " + ((activePlayer.equals(p1)) ? "Player 1 " : "Player 2 ") + "brought his final score to " + activePlayer.getScore());
            } else {
                setPlayer();
            }
        } //Else, the player can choose at his/her discretion as to whether he/she wants to reroll
        else {
            System.out.println(((activePlayer.equals(p1)) ? "Player 1" : "Player 2") + " has currently accumulated " + (sum + previousSum) + " points.");
            String s;
            //Done with computer players
            if (activePlayer instanceof ComputerPlayer) {
                s = ((ComputerPlayer) activePlayer).respondToInput();
            } else { //Done with human players
                System.out.println("Would you like to roll again?  Y/N");
                s = input.next();
            }
            if (s.charAt(0) == 'Y' || s.charAt(0) == 'y') {
                roll(diceRolls, sum + previousSum, hasSunDice);
            } else {
                System.out.println("You have ended your turn");
                activePlayer.addScore(sum + previousSum);
                System.out.println("Your score is " + activePlayer.getScore());
                if (active == false && reRollNeeded == false) {
                    //Simply end the "loop"
                    System.out.println("In his last turn, " + ((activePlayer.equals(p1)) ? "Player 1 " : "Player 2 ") + " scored" + (sum + previousSum) + ", bringing his final score to " + activePlayer.getScore());
                } else {
                    setPlayer();
                }
            }
        }
    }

    //Last lick when a player reaches the winning total
    public void lastLick(Player p) {
        active = false;

        activePlayer = p;
        Player otherPlayer = p.equals(p1) ? p2 : p1;
        System.out.println("LAST LICK!" + ((activePlayer.equals(p1)) ? "Player 1" : "Player 2"));
        roll();

        if (activePlayer.getScore() > otherPlayer.getScore()) {
            System.out.println((p.equals(p1) ? "Player 1 " : "Player 2 ") + "WINS!!!");
        } else {
            System.out.println((p.equals(p1) ? "Player 2 " : "Player 1 ") + "WINS!!!");
        }
        System.out.println("Thanks for playing Cosmic Wimpout!");
        //System.exit(3);
    }
}

class DriverClass {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Game g = new Game();
        while (g.getActive()) {
            g.roll();
        }
    }
}
