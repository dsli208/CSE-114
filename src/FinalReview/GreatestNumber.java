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
public class GreatestNumber {
    public static void main(String[] args) {
        int[] a = {9, 5, 2, 6, 3, 8, 2, 5, 4};
        System.out.println(recGreatestNum(a));
    }
    public static void printArray(int[] a) {
        for (int i: a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static int recGreatestNum(int[] a) {
        return recGreatestNum(a, a[0], 0);
    }
    public static int recGreatestNum(int[] a, int max, int i) {
        if (i >= a.length) //return max after going through the whole array
            return max;
        else {
            if (a[i] > max) { //set max if the element at a[i] is greater than the previous max
                max = a[i];
            }
            return recGreatestNum(a, max, i + 1); //if we still have elements to evaluate, we take the new max (if it was changed) and evaluate the
            //element at index i + 1 in the same array a
        }
    }
}
