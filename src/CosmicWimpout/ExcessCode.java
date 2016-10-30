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
public class ExcessCode {
    /*int rollNumber1 = (int)(Math.random() * 6 + 1);
        int rollNumber2 = (int)(Math.random() * 6 + 1);
        int rollNumber3 = (int)(Math.random() * 6 + 1);
        int rollNumber4 = (int)(Math.random() * 6 + 1);
        int rollNumber5 = (int)(Math.random() * 6 + 1);
        int[] rolls = {rollNumber1, rollNumber2, rollNumber3, rollNumber4, rollNumber5};*/
    /*boolean fiveInARow = true;
        for (int i = 1; i < rolls.length; i++) {
            if (rolls[i] != rolls[i - 1])
                fiveInARow = false;
        }
        boolean threeInARow = false;
        int matchIndex = 0;
        for (int i = 0; i < 3; i++) {
            int matches = 1;
            for (int j = i + 1; j < rolls.length; j++) {
                if (rolls[j] == rolls[i])
                    matches++;
            }
            if (matches == 3) {
                threeInARow = true;
                matchIndex = i;
            }
        }
        if (fiveInARow == true) {
            System.out.println("Freight train!");
            fiveStraight(rolls[matchIndex]);
        }
        else if (threeInARow == true) {
            System.out.println("FLASH!!!");
            activePlayer.addScore(10 * matchIndex);
        }*/
    /*int[] rolls = new int[6];
        for (int i = 0; i < 5; i++) {
            rolls[i] = rollDice();
        }
        rolls[5] = rollBlack();
        for (int i = 0; i < rolls.length; i++) {
            int equalRolls = 0;
            for (int j = 0; j < rolls.length; j++) {
                if (rolls[j] == rolls[i])
                    equalRolls++;
            }
            if (equalRolls == 5) {
                fiveStraight(i);
                break;
            }
            else if (equalRolls == 3) {
                threeInARow(i, rolls);
                break;
            }
        }*/
    
        /*for (int i = 0; i < rolls.length; i++) {
            if (rolls[i] == 5 || rolls[i] == 10)
                sum += rolls[i];
        }*/
    /*
    public int fiveStraight(int i) {
        switch (i) {
            case 6:
                System.out.println("Game won!");
                break;
            case 10:
                System.out.println("Game lost!");
                break;
        }
        return 100 * i;
    }

    public void threeInARow(int i, int[] rolls) {
        int score = i * 10;
        for (int n = 0; n < rolls.length; n++) {
            if (n == rolls.length - 1 && rolls[n] != i) {
                while (rolls[n] != i) {
                    rolls[n] = rollBlack();
                }
            } else if (rolls[n] != i) {
                while (rolls[n] != i) {
                    rolls[n] = rollDice();
                }
            }
        }
    }
}
*/
}
