/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//David Li 110328771
package Homework4;
import java.util.Scanner;
/**
 *
 * @author dsli
 */
public class Pyramid {
    public static void main(String[] args ) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        //Loop for each row
        for (int i = 0; i < n; i++) {
            //Prints required amount of spaces each row
            for (int j = n - i; j > 0; j--) {
                System.out.print("  ");
            }
            //Prints numbers in increasing order starting with 1 (Math.pow(2, 0))
            for (int j = 0; j <= i; j++)
                System.out.print((int)Math.pow(2, j) + " ");
            //Prints numbers going from i - i and towards 1
            for (int j = i - 1; j >= 0; j--)
                System.out.print((int)Math.pow(2, j) + " ");
            System.out.println();
        }
    }
}
