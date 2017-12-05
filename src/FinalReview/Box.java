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
public class Box {
    public static void boxRec(int n) {
        printNTimes("-", n);
        System.out.println();
        printMiddle(2, n);
        printNTimesRec("-", n / 2);
        System.out.print("+");
        printNTimesRec("-", n / 2);
        System.out.println();
        printMiddle(2, n);
        /*for (int i = 2; i <= n / 2; i++) {
            System.out.print("|");
            printNTimes(" ", (n / 2) - 1);
            System.out.print("|");
            printNTimes(" ", (n / 2) - 1);
            System.out.println("|");
        }*/
        printNTimesRec("-", n);
    }
    public static void printNTimes(String s, int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(s);
        }
    }
    public static void printNTimesRec(String s, int n) {
        if (n > 0) {
            System.out.print(s);
            printNTimesRec(s, n - 1);
        }
    }
    public static void main(String[] args) {
        boxRec(50);
    }
    public static void printMiddle(int i, int n) {
        if (i <= n / 2) {
            System.out.print("|");
            printNTimesRec(" ", n / 2 - 1);
            System.out.print("|");
            printNTimesRec(" ", n / 2 - 1);
        }
    }
}
