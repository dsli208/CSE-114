/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalReview;

/**
 *
 * @author dsli
 */
public class Cards {
    //Sorts the list of cards
    public static String[] sortCards(String[] s) {
        for (int i = 0; i < s.length - 1; i++) {
            String minCard = s[i];
            int minIndex = i;
            for (int j = i + 1; j < s.length; j++) {
                if (isGreaterThan(s[j], minCard)) {
                    minIndex = j;
                    minCard = s[j];
                }
            }
            //swap the cards - note we don't need a temp variable since we had already stored the minimum value card to a variable
            s[minIndex] = s[i];
            s[i] = minCard;
        }
        return s;
    }
    //Decides if a card is less than another (since we are using String objects and not primitive types this method becomes necessary)
    public static boolean isGreaterThan(String c1, String c2) {
        //First, compare the suit characters (note we are going C, H, J, S --> ALPHABETICAL ORDER)
        char suit1 = c1.charAt(c1.length() - 1);
        char suit2 = c2.charAt(c2.length() - 1);
        if (suit1 > suit2)
            return true;
        else if (suit1 < suit2)
            return false;
        else {
            int card1 = Integer.parseInt(c1.substring(0, c1.length() - 1));
            int card2 = Integer.parseInt(c2.substring(0, c2.length() - 1));
            if (card1 > card2)
                return true;
            else
                return false;
        }
    }
    //Simply print a String array
    public static void printArray(String[] s) {
        for (String card : s) {
            System.out.print(card + " ");
        }
    }
    
    //Now test the whole thing
    public static void main(String[] args) {
        String[] cards = {"4D", "3S", "6C", "KJ"};
        printArray(cards);
        System.out.println();
        printArray(sortCards(cards));
    }
}
