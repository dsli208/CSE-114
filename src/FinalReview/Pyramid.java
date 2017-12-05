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
public class Pyramid {
    public static void main(String[] args) {
        pyramidLoops(8);
        System.out.println("\n");
        pyramidRec(8);
    }
    public static void pyramidLoops(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = (n - i); j > 0; j--) {
                System.out.print("  ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print(j + " ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void printRec(String s, int n) {
        if (n > 0) {
            System.out.print(s);
            printRec(s, n - 1);
        }
    }
    public static void pyramidRec(int n) {
        pyramidRec(1, n);
    }
    public static void pyramidRec(int i, int n) {
        if (i < n) {
            //print n - i spaces
            printRec("  ", n - i);
            //print i, i - 1, ..., 1
            pyramidRecHelper1(i);
            //print 2, 3, ..... i
            pyramidRecHelper2(2, i);
            //proceed to the next line
            System.out.println();
            pyramidRec(i + 1, n);
        }
    }
    public static void pyramidRecHelper1(int j) {
        if (j > 0) {
            System.out.print(j + " ");
            pyramidRecHelper1(j - 1);
        }
    }
    public static void pyramidRecHelper2(int j, int i) {
        if (j <= i) {
            System.out.print(j + " ");
            pyramidRecHelper2(j + 1, i);
        }
    }
}
