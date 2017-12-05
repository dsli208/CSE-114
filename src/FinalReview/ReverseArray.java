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
public class ReverseArray {
    public static void main(String[] args) {
        int[] a = {9, 5, 2, 6, 3, 8, 2, 5, 4};
        a = reverse(a);
        printArray(a);
        int[] b = {9, 5, 2, 6, 3, 8, 2, 5, 4};
        printArray(recReverse(b));
    }
    public static int[] reverse(int[] a) {
        int[] b = new int[a.length];
        for (int i = 0, j = a.length - 1; i < a.length && j >= 0; i++, j--) {
            b[j] = a[i];
        }
        return b;
    }
    public static int[] recReverse(int[] a) {
        int[] b = new int[a.length];
        recReverse(a, b, 0, b.length - 1);
        return b;
    }
    public static void recReverse(int[] a, int[] b, int i, int j) {
        if (i < a.length && j >= 0) { //Recursive call/base case if (i >= a.length || j < 0) in which the method stops looping recursively, returning to the above method
            b[j] = a[i];
            recReverse(a, b, i + 1, j - 1);
        }
    }
    public static void printArray(int[] a) {
        for (int i: a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
