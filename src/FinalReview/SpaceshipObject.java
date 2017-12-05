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
public class SpaceshipObject {

    public static void main(String[] args) {
        printSpaceship(5);
    }

    public static void printSpaceship(int i) {
        printTop(i, 0);
        printChars('>', 2 * i + 1);
        for (int j = i - 1; j >= 0; j--) {
            printBottom(2 * j + 1);
        }
    }

    public static void printTop(int i, int j) { //j determines how many characters are printed each time this method invokes the printChars method, i is the limit
        if (j < i) { //Recursive function
            printChars('\\', 2 * j + 1);
            printTop(i, j + 1); //invokes the method recursively
        }
    }

    public static void printBottom(int i) {
        printChars('/', i);
    }

    public static void printChars(char c, int i) {
        if (i == 0) {
            System.out.println();
        } else {
            System.out.print(c);
            printChars(c, i - 1);
        }
    }
}