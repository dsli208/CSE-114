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
public class BoxRec {
    public static void main(String[] args) {
        box(50);
    }
    public static void printNTimesRec(String s, int n) {
        //Base case: if (n == 0) this method will simply stop implementing itself
        if (n > 0) { //Recursive call
            System.out.print(s);
            printNTimesRec(s, n - 1);
        }
    }
    public static void box(int n) {
        printNTimesRec("-", n); //Print the top dashes
        System.out.println();
        printMiddle(n, 2);
        printNTimesRec("-", (n / 2));
        System.out.print("+");
        printNTimesRec("-", (n / 2));
        System.out.println();
        printMiddle(n, 2);
        printNTimesRec("-", n);
        System.out.println();
    }
    public static void printMiddle(int n, int i) {
        if (i <= n / 2) {
            System.out.print("|");
            printNTimesRec(" ", (n / 2) - 1);
            System.out.print("|");
            printNTimesRec(" ", (n / 2) - 1);
            System.out.println("|");
            printMiddle(n, i + 1);
        }
    }
}
