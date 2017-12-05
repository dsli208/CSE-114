/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter18;

import java.util.Scanner;

/**
 *
 * @author dsli
 */
public class SortArray {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int[] a = mergeSort(new int[] {4, 3, 9, 5, 2, 6});
        print(a);
        //wait2();
    }
    //Custom created debugging method
    public static void wait2() {
        String s = "";
        System.out.print("Write 1 to continue: ");
        while (!s.equals("1"))
            s = input.nextLine();
    }
    public static int[] mergeSort(int[] a) {
        //base case
        if (a.length <= 1)
            return a;
        //split the array into 2 halves
        int[] left = new int[a.length / 2];
        //remember that if we don't get a whole number when dividing a.length by two, we could lose elements so a.length - left.length is better
        int[] right = new int[a.length - left.length];
        for (int i = 0; i < a.length; i++) {
            if (i < left.length)
                left[i] = a[i];
            else
                right[i - left.length] = a[i];
            /*left[i] = a[i];
            right[i] = a[i + left.length];*/
        }
        //sort each half
        left = mergeSort(left);
        right = mergeSort(right);
        //merge the sorted halves
        return merge(left, right);
    }
    
    public static int[] merge(int[] a, int[] b) {
        if (a.length == 0)
            return b;
        if (b.length == 0)
            return a;
        //BOTH OF THE ABOVE ARE BASE CASES
        //Below is a statement that relies on the array being sorted by the method above this one
        if (a[0] < b[0]) {
            int[] tempA = new int[a.length - 1];
            for (int i =0; i < a.length - 1; i++) {
                tempA[i] = a[i + 1];
            }
            int[] mergeResult = merge(tempA, b);
            int[] result = new int[a.length + b.length];
            result[0] = a[0];
            for (int i = 1; i < result.length; i++) {
                result[i] = mergeResult[i - 1];
            }
            return result;
        }
        else {
            int[] tempB = new int[b.length - 1];
            for (int i =0; i < b.length - 1; i++) {
                tempB[i] = b[i + 1];
            }
            int[] mergeResult = merge(a, tempB);
            int[] result = new int[a.length + b.length];
            result[0] = b[0];
            for (int i = 1; i < result.length; i++) {
                result[i] = mergeResult[i - 1];
            }
            return result;
        }
    }
    //Test method
    static void print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
