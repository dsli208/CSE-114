/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab11;

import java.util.Scanner;

/**
 *
 * @author dsli
 */
public class TicTacToeGame {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Create the Tic-Tac-Toe board
        char[][] ticTacToeBoard = new char[3][3];
        for (int i = 0; i < ticTacToeBoard.length; i++) {
            for (int j = 0; j < ticTacToeBoard[i].length; j++) {
                ticTacToeBoard[i][j] = ' ';
            }
        }
        int turns = 0;
        boolean activeGame = true;
        while (activeGame) {
            for (int i = 0; i < ticTacToeBoard.length; i++) {
                for (int j = 0; j < ticTacToeBoard[i].length; j++) {
                    System.out.print("| " + ticTacToeBoard[i][j] + " ");
                }
                System.out.println("|");
            }
            System.out.println("Your turn, player " + ((turns % 2 == 0 ? "X." : "O.")));
            System.out.print("Enter the row in the board (0-2): ");
            int row = input.nextInt();

            System.out.print("Enter the column in the board (0-2): ");
            int column = input.nextInt();

            //segment of code that determines if the preceding input is valid
            if (row > 2 || row < 0) {
                System.out.println("Row must be between 0-2.");
                continue;
            } else if (column > 2 || column < 0) {
                System.out.println("Column must be between 0-2.");
                continue;
            } else if (ticTacToeBoard[row][column] != ' ') {
                System.out.println("This spot on the board is already taken.");
                continue;
            } else {
                if (turns % 2 == 0) {
                    ticTacToeBoard[row][column] = 'X';
                } else {
                    ticTacToeBoard[row][column] = 'O';
                }
                turns++;
            }

            //Determine if there is a winner at the end of each turn
            //Row
            for (int i = 0; i < ticTacToeBoard.length; i++) {
                boolean allSame = true;
                for (int j = 1; j < ticTacToeBoard[i].length; j++) {
                    if (ticTacToeBoard[i][j - 1] == ' ') {
                        allSame = false;
                    }
                    if (ticTacToeBoard[i][j] != ticTacToeBoard[i][j - 1]) {
                        allSame = false;
                    }
                }
                if (allSame == true) {
                    activeGame = false;
                    System.out.println("All " + ticTacToeBoard[i][0] + "'s on row " + i + ".  Player " + (((turns - 1) % 2 == 0) ? "X " : "O ") + "wins.");
                    break;
                }
            }
            //Column

            for (int i = 0; i < ticTacToeBoard[0].length; i++) {
                boolean allSame = true;
                for (int j = 1; j < ticTacToeBoard.length; j++) {
                    if (ticTacToeBoard[j - 1][i] == ' ')
                        allSame = false;
                    if (ticTacToeBoard[j][i] != ticTacToeBoard[j - 1][i]) {
                        allSame = false;
                    }
                }
                if (allSame == true) {
                    activeGame = false;
                    System.out.println("All " + ticTacToeBoard[0][i] + "'s in column " + i + ".  Player " + (((turns - 1) % 2 == 0) ? "X " : "O ") + "wins.");
                    break;
                }
            }
            //Diagonals - first major then minor
            boolean allSameMajorDiagonal = true;
            for (int i = 1, j = 1; i < ticTacToeBoard.length && j < ticTacToeBoard[0].length; i++, j++) {
                if (ticTacToeBoard[i][j] != ticTacToeBoard[i - 1][j - 1]) {
                    allSameMajorDiagonal = false;
                }
                if (ticTacToeBoard[i - 1][j - 1] == ' ')
                    allSameMajorDiagonal = false;
            }
            if (allSameMajorDiagonal == true) {
                System.out.println("All " + ticTacToeBoard[0][0] + "'s on the major diagonal.  Player " + (((turns - 1) % 2 == 0) ? "X " : "O ") + "wins.");
                activeGame = false;
            }
            boolean allSameMinorDiagonal = true;
            for (int i = ticTacToeBoard.length - 2, j = 1; i >= 0 && j < ticTacToeBoard[0].length; i--, j++) {
                if (ticTacToeBoard[i][j] != ticTacToeBoard[i + 1][j - 1]) {
                    allSameMinorDiagonal = false;
                }
                if (ticTacToeBoard[i + 1][j - 1] == ' ')
                    allSameMinorDiagonal = false;
            }
            if (allSameMinorDiagonal == true) {
                System.out.println("All " + ticTacToeBoard[ticTacToeBoard.length - 1][0] + "'s on the minor diagonal.  Player " + (((turns - 1) % 2 == 0) ? "X " : "O ") + "wins.");
            }
        }
    }
}
