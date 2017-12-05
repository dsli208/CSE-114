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
public class TwoDimensionalArray1 {
    public static void main(String[] args) {
        double[][] m = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        double sum2column = sumColumn(m, 1);
    }
    public static double sumColumn(double[][] m, int c) {
        int sum = 0;
        for (int i = 0; i < m[c].length; i++) {
            sum += m[i][c];
        }
        return sum;
    }
}
