/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab12;

import java.util.Scanner;

/**
 *
 * @author dsli
 */
public class SumColumn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the dimension of the matrix (one number): ");
        int matrixDimension = input.nextInt();
        double[][] a = new double[matrixDimension][matrixDimension];
        System.out.print("Enter the elements of your matrix: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = input.nextDouble();
            }
        }
        System.out.println("Your matrix below is: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < matrixDimension; i++) {
            System.out.println(sumColumn(a, i));
        }
    }
    
    public static double sumColumn(double[][] m, int c) {
        double sum = 0;
        for (int i = 0; i < m[c].length; i++) {
            sum += m[i][c];
        }
        return sum;
    }
}
