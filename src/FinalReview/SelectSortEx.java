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
public class SelectSortEx {
    public static int[] selectSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            //find the min
            int min = a[i];
            int minIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < min) {
                    minIndex = j;
                    min = a[j];
                }
            }
            //swap
            if (minIndex != i) {
                a[minIndex] = a[i];
                a[i] = min;
            }
        }
        return a;
    }
    public static void main(String[] args) {
        int[] result = selectSort(new int[] {4,67,43,67,32,7});
        for (int i: result) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
