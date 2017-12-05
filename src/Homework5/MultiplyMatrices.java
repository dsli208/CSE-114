/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Homework5;
//David Li 110328771
/**
 *
 * @author dsli
 */
public class MultiplyMatrices {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}};
        int[][] b = {{2, 3}, {5, 6}, {8, 9}};
        int[][] c = multiplyMatrix(a, b);
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[][] multiplyMatrix(int[][] a, int[][] b) {
        //Condition for what happens if the input is invalid (rows in a does not equal columns in b)
        if (a[0].length != b.length) {
            System.out.println("You have inputted invalid matrices.  The program will now exit.");
            System.exit(0);
        }
        //Create the result matrix
        int[][] c = new int[a.length][b[0].length];
        //Multiplication process - the first two for loops are to progress through the result matrix c
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[0].length; j++) {
                //Now we nest another loop to progress through multiplying the two matrices
                for (int k = 0; k < b.length && k < a[0].length; k++)
                    c[i][j] += a[i][k] * b[k][j];
                //Note we didn't need two loops, just one loop!
                //This is because the position in the c matrix is dependent on the row in a and the column in b, which are both kept constant
                //We only need k to progress through these matrix parts, as again, they are KEPT CONSTANT.
            }
        }
        return c;
    }
}
