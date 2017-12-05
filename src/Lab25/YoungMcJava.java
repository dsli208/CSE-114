/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab25;

/**
 *
 * @author dsli
 */
public class YoungMcJava {
    public static void main(String[] args) {
        printPattern(2);
    }
    public static void printPattern(int n) {
        printPattern(0, 0, n);
    }
    public static void printPattern(int i, int j, int n) { //where n is n from the previous method, i is row, and j is column
        if (j >= n) {
            System.out.println();
            printPattern(++i, 0, n);
        }
        else if (i >= n) {
        }
        else {
            if ((i + j) % 2 == 0)
                System.out.print(n + " ");
            else
                System.out.print((n - 1) + " ");
            printPattern(i, ++j, n);
        }
    }
    public static void printPattern(int i, int n) {
        
    }
}
