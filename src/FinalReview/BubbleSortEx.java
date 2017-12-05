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
public class BubbleSortEx {
    public static void main(String[] args) {
        int[] a = {9, 5, 2, 6, 3, 8, 2, 5, 4};
        sort(a);
        printArray(a);
        int[] b = {9, 5, 2, 6, 3, 8, 2, 5, 4};
        recSort(b);
        printArray(b);
    }
    public static void sort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int min = a[i];
            int minIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < min) {
                    min = a[j];
                    minIndex = j;
                }
            }
            a[minIndex] = a[i];
            a[i] = min;
        }
    }
    public static void printArray(int[] a) {
        for (int i: a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    //Same thing, but with recursion
    public static void recSort(int[] a) {
        recSort(a, 0); //Start by invoking the first helper method
    }
    public static void recSort(int[] a, int i) {
        if (i < a.length - 1) { //Base case/recursive call, go through each position of the loop
            recSort(a, i, i + 1, a[i], i); //Invoke a "nested" recursive call to go through all the elements after i to find the lowest one to put at position i
            recSort(a, i + 1); //After the elements are swapped, go onto the next i index
        }
    }
    public static void recSort(int[] a, int i, int j, int min, int mIndex) {
        if (j >= a.length) { //Base case, to be executed at the end of the "loop" (swap numbers at the end)
            a[mIndex] = a[i];
            a[i] = min;
        }
        else { //Else, continue going on to see if we have any lower values
            if (a[j] < min) {
                min = a[j];
                mIndex = j;
            }
            recSort(a, i, j + 1, min, mIndex);
        }
    }
}
