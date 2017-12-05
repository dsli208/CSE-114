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
public class TicTacToeBoard {
    public static void main(String[] args) {
        int[][] board = new int[3][3];
        //Create and print the game board
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = (int)(Math.random() * 2);
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        //Now test to see if columns have the same thing
        for (int i = 0; i < board[0].length; i++) {
            boolean sameColumn = true;
            for (int j = 1; j < board.length; j++) {
                if (board[j][i] != board[j - 1][i])
                    sameColumn = false;
            }
            if (sameColumn == true)
                System.out.println("All " + board[0][i] + "'s in column " + i);
        }
        //Test rows
        for (int i = 0; i < board.length; i++) {
            boolean sameRow = true;
            for (int j = 1; j < board[i].length; j++) {
                if (board[i][j] != board[i][j - 1])
                    sameRow = false;
            }
            if (sameRow == true)
                System.out.println("All " + board[i][0] + "'s in row " + i);
        }
        //Test major diagonal
        boolean sameMajorDiagonal = true;
        for (int i = 1, j = 1; i < board.length && j < board[i].length; i++, j++) {
            if (board[i][j] != board[i - 1][j - 1])
                sameMajorDiagonal = false;
        }
        if (sameMajorDiagonal == true)
            System.out.println("All " + board[0][0] + "'s on the major diagonal.");
        
        //Test minor diagonal
        boolean sameMinorDiagonal = true;
        for (int i = board.length - 2, j = 1; i >= 0 && j < board[i].length; i--, j++) {
            if (board[i][j] != board[i + 1][j - 1])
                sameMinorDiagonal = false;
        }
        if (sameMinorDiagonal == true)
            System.out.println("All " + board[board.length - 1][0] + "'s on the minor diagonal.");
    }
}
