/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Homework5;
//David Li 110328771

/**
 *
 * @author dsli
 */
public class CouponCollector {

    public static void main(String[] args) {
        //Declare and initialize int variable for number of picks, then String arrays for possible suits and cards
        int picks = 0;
        String[] suits = {"Spades", "Hearts", "Clubs", "Diamonds"};
        String[] cards = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        //Initialize string arrays for the 4 picked cards and their suits
        String[] pickedSuits = new String[4];
        String[] pickedCards = new String[4];
        //Pick the initial four cards
        for (int i = 0; i < 4; i++) {
            pickedSuits[i] = suits[(int) (Math.random() * suits.length)];
            pickedCards[i] = cards[(int) (Math.random() * cards.length)];
            picks++;
        }
        //Initial condition that starts the below while loop
        boolean validStack = false;
        //While loop that ensures that for different suits are picked, does not end until the pickedSuits array has four different suits
        while (validStack == false) {
            //Boolean variable that determines if the elements in pickedSuits are all different (if they are, the loop ends, if not the loop continues)
            boolean differentSuits = true;
            //For loop to go through the pickedSuits array
            for (int i = 0; i < pickedSuits.length; i++) {
                //At each element, go through the elements before it to see if they are the same
                for (int j = i - 1; j >= 0; j--) {
                    //If a previous element is the same as element i, then the loop WILL repeat in addition to...
                    //replacing the previous card at i in both arrays with a new, randomly picked card
                    if (pickedSuits[i].equals(pickedSuits[j])) {
                        differentSuits = false;
                        pickedSuits[i] = suits[(int)(Math.random() * suits.length)];
                        pickedCards[i] = cards[(int)(Math.random() * cards.length)];
                        picks++;
                    }
                }
            }
            //If the pickedSuits elements were all different, this loop will now exit
            if (differentSuits == true)
                validStack = true;
        }
        //Display each card, its suit, and finally, the number of picks.
        for (int i = 0; i < 4; i++) {
            System.out.println(pickedCards[i] + " of " + pickedSuits[i]);
        }
        System.out.println("Number of picks: " + picks);
    }
}
