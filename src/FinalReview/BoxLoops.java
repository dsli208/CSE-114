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
public class BoxLoops {
    public static void printNTimes(String s, int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(s);
        }
    }
    public static void box(int n) {
        printNTimes("-", n);
        System.out.println();
        for (int i = 2; i <= n / 2; i++) {
            System.out.print("|");
            printNTimes(" ", (n / 2) - 1);
            System.out.print("|");
            printNTimes(" ", (n / 2) - 1);
            System.out.println("|");
        }
        printNTimes("-", n / 2);
        System.out.print("+");
        printNTimes("-", n / 2);
        System.out.println();
        for (int i = 2; i <= n / 2; i++) {
            System.out.print("|");
            printNTimes(" ", (n / 2) - 1);
            System.out.print("|");
            printNTimes(" ", (n / 2) - 1);
            System.out.println("|");
        }
        printNTimes("-", n);
    }
    public static void main(String[] args) {
        box(55);
    }
}
