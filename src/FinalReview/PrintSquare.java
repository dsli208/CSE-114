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
public class PrintSquare {
    public static void main(String[] args) {
        printSquare(5);
    }
    public static void printSquare(int i) {
        printHorizontal(i);
        printSides(i - 2, i - 2);
        printHorizontal(i);
    }
    public static void printSquare(int n, int i) {
        
    }
    public static void printHorizontal(int i) {
        if (i > 0) {
           System.out.print("* ");
           printHorizontal(i - 1);
        }
        else {
            System.out.println();
        }
    }
    public static void printSpaces(int i) {
        if (i > 0) {
            System.out.print("  ");
            printSpaces(i - 1);
        }
    }
    public static void printSides(int i, int n) {
        if (i > 0) {
            System.out.print("* ");
            printSpaces(n);
            System.out.println("* ");
            printSides(i - 1, n);
        }
    }
}
