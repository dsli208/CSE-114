/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3;

import java.util.Scanner;

/**
 *
 * @author dsli
 */
public class ChangeMaker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an amount: ");
        double amount = input.nextDouble();
        System.out.print("Enter the total price: ");
        double price = input.nextDouble();
        double change = Math.abs(price - amount);
        System.out.printf("%s%.2f\n", "Change: $", change);
        int totalAmount = (int)(change * 100);
        int rem = totalAmount;
        int twentyBills = 0, tenBills = 0, fiveBills = 0, oneBills = 0, quarters = 0, dimes = 0, nickels = 0, pennies = 0;
        twentyBills = rem / 2000;
        rem = rem % 2000;
        tenBills = rem / 1000;
        rem = rem % 1000;
        fiveBills = rem / 500;
        rem = rem % 500;
        oneBills = rem / 100;
        rem = rem % 100;
        quarters = rem / 25;
        rem = rem % 25;
        dimes = rem / 10;
        rem = rem % 10;
        nickels = rem / 5;
        rem = rem % 5;
        pennies = rem;
        System.out.println("There are " + twentyBills + " $20 bills, " + tenBills + " $10 bills, " + fiveBills + " $5 bills, " + oneBills + " $1 bills, " + quarters + " quarters, " + dimes + " dimes, " + nickels + " nickels, and " + pennies + " pennies.");
    }
}
