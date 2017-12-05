/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter18;

/**
 *
 * @author dsli
 */
public class SortArrayLoops {
    public static void main(String[] args) {
        
    }
    public static int[] merge(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        int leftIndex = 0;
        int rightIndex = 0;
        int leftLimit = a.length;
        int rightLimit = b.length;
        int counter = 0;
        while(leftIndex < a.length && rightIndex < b.length) {
            if (a[leftIndex] < b[rightIndex])
                result[counter++] = a[leftIndex++];
            else
                result[counter++] = b[rightIndex++];
        }
        while (leftIndex < a.length)
            result[counter++] = a[leftIndex++];
        while (rightIndex < b.length)
            result[counter++] = b[rightIndex++];
        return result;
    }
}
