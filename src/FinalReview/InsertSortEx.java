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
public class InsertSortEx {
    public static void main(String[] args) {
        printArray(sort(new int[] {9, 5, 2, 6, 3, 8, 2, 5, 4}));
    }
    public static void printArray(int[] a) {
        for (int i: a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static int[] sort(int[] a) {
        int[] b = new int[a.length];
        System.arraycopy(a, 0, b, 0, a.length);
        /*for (int i = 0; i < a.length; i++) {
            int value = a[i];
            int properIndex = i;
            for (int j = 0; j < i; j++) {
                if (b[j] < value) {
                    properIndex = j;
                }
            }
            for (int j = properIndex; j < a.length - 1; j++) {
                b[j + 1] = b[j];
            }
            b[properIndex] = value;
        }*/
        for (int i = 0; i < b.length; i++) {
            for (int j = i; j > 0; j--) {
                int current = b[j];
                if (b[j] < b[j - 1]) {
                    b[j] = b[j - 1];
                    b[j -1] = current;
                }
            }
        }
        return b;
    }
}
