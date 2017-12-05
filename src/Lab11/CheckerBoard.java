/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab11;

/**
 *
 * @author dsli
 */
public class CheckerBoard {
    public static void main(String[] args) {
        //Create the checkerboard
        int[][] checkerBoard = new int[8][8];
        for (int i = 0; i < checkerBoard.length; i++) {
            for (int j = 0; j < checkerBoard[i].length; j++) {
                checkerBoard[i][j] = (int)(Math.random() * 2);
                System.out.print(checkerBoard[i][j] + " ");
            }
            System.out.println();
        }
        //Test to see if each row is valid
        for (int i = 0; i < checkerBoard.length; i++) {
            boolean isSameRow = true; //boolean value for determining if a row is the same thing
            for (int j = 1; j < checkerBoard[i].length; j++) {
                if (checkerBoard[i][j] != checkerBoard[i][j - 1]) //trigger condition if at least one element differs from the rest of the row
                    isSameRow = false;
            }
            if (isSameRow == true) //Print if a row is the same thing
                System.out.println("All " + checkerBoard[i][0] + "'s in row " + (i + 1));
        }
        
        //Test to see if each column is valid
        for (int i = 0; i < checkerBoard[0].length; i++) {
            boolean isSameColumn = true; // boolean value for determining if a column is all the same thing
            for (int j = 1; j < checkerBoard.length; j++) {
                if (checkerBoard[j][i] != checkerBoard[j - 1][i]) //trigger condition for different elements in the column
                    isSameColumn = false;
            }
            if (isSameColumn == true) //Print if a column is all the same thing
                System.out.println("All " + checkerBoard[0][i] + "'s in column " + (i + 1));
        }
        
        //Test to see if the major diagonal is valid
        boolean isSameMajorDiagonal = true;
        for (int i = 1, j = 1; i < checkerBoard.length && j < checkerBoard[0].length; i++, j++) {
            if (checkerBoard[i][j] != checkerBoard[i - 1][j - 1]) //Trip condition if one element is different
                isSameMajorDiagonal = false;
        }
        if (isSameMajorDiagonal == true)
            System.out.println("All " + checkerBoard[0][0] + "'s on the major diagonal.");
        
        //Test to see if the minor diagonal is valid
        boolean isSameMinorDiagonal = true;
        for (int i = checkerBoard.length - 2, j = 1; i >= 0 && j < checkerBoard[0].length; i--, j++) {
            if (checkerBoard[i][j] != checkerBoard[i + 1][j - 1]) //Trip condition if one element is different
                isSameMinorDiagonal = false;
        }
        if (isSameMinorDiagonal == true)
            System.out.println("All " + checkerBoard[checkerBoard.length - 1][0] + "'s on the major diagonal.");
    }
}
