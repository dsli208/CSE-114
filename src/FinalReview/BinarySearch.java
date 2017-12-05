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
public class BinarySearch {
    public static void main(String[] args) {
        
    }
    public static int binarySearch(int[] a, int key) {
        return recBinarySearch(a, 0, a.length, key);
    }
    public static int recBinarySearch(int[] a, int low, int high, int key) {
        if (low > high) {
            //This means we have gone through out the list
            return -1;
        }
        int mid = (low + high) / 2;
        if (key == a[mid]) {
            return mid;
        }
        //else partition the list based on where key is found
        else {
            if (key < a[mid]) {
                return recBinarySearch(a, low, mid - 1, key); //we know that mid is not equal to key, so get rid of it to not waste any more time
            }
            else
                return recBinarySearch(a, mid + 1, high, key);
        }
    }
}
