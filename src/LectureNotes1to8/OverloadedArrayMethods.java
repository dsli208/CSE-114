/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LectureNotes1to8;

import java.util.Arrays;

/**
 *
 * @author dsli
 */
public class OverloadedArrayMethods {

    public static void main(String[] args) {
        System.out.println(median(new double[]{3.5, 1.2, 7.8, 2.4}));
        System.out.println(median(new int[]{5, 7, 78, 4, 2 ,5, 9}));
    }

    public static double median(double[] array) {
        //Sort
        Arrays.sort(array);
        return array[array.length / 2];
    }

    public static int median(int[] array) {
        //Selection sort
        for (int i = 0; i < array.length - 1; i++) {
            int min = array[i];
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
        /*for (int i: array) {
            System.out.print(i + " ");
        }*/
        System.out.println();
        //return the median
        return array[array.length / 2];
    }
}
