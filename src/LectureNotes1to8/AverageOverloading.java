/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LectureNotes1to8;

/**
 *
 * @author dsli
 */
public class AverageOverloading {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5, 6, 7};
        double intAverage = average(a);
        System.out.println("The average of the int array a is " + intAverage);
        System.out.println("The average of the double array b is " + average(new double[]{1.2, 4.6, 3.5, 2.7, 3.7, 3,4}));
    }
    public static double average(int[] array) {
        double sum = 0;
        for (int value: array)
            sum += value;
        return sum / array.length;
    }
    
    public static double average(double[] array) {
        double sum = 0;
        for (double d : array)
            sum += d;
        return sum / array.length;
    }
}
