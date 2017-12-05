/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1;
//David Li, 110328771

import java.util.Scanner;

/**
 *
 * @author dsli
 */
public class ChangeMaker {

    public static void main(String[] args) {
        while (true) {
            Scanner input = new Scanner(System.in);
            int change, rem, quarters, dimes, nickels, pennies;
            System.out.print("Enter the amount of change: ");
            change = input.nextInt();
            rem = change;
            quarters = rem / 25;
            rem = rem % 25;
            dimes = rem / 10;
            rem = rem % 10;
            nickels = rem / 5;
            pennies = rem % 5;
            System.out.println("There are " + quarters + " quarters.");
            System.out.println("There are " + dimes + " dimes.");
            System.out.println("There are " + nickels + " nickels.");
            System.out.println("There are " + pennies + " pennies.");
        }
    }
}
