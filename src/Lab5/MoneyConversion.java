/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab5;

import java.util.Scanner;

/**
 *
 * @author dsli
 */
public class MoneyConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the two currencies you are converting between: ");
        String currency1 = input.next(); String currency2 = input.next();
        System.out.print("Enter the exchange rate from " + currency1 + " and " + currency2 + ": ");
        double exchangeRate = input.nextDouble();
        System.out.print("Enter amount of " + "(" + currency1 + "/" + currency2 + "): ");
        double amount = input.nextDouble();
        System.out.print("Are you converting from " + currency1 + " to " + currency2 + "(0) or from " + currency2 + " to " + currency1 + " (1)? (Enter 0 or 1) ");
        int choice = input.nextInt();
        boolean run = false;
        while (run == false) {
            switch (choice) {
                case 0: System.out.println("The amount in RMB is " + (amount * exchangeRate)); run = true; break;
                case 1: System.out.println("The amount in USD is " + (amount / exchangeRate)); run = true; break;
                default: System.out.println("Invalid input.  Enter 0 or 1 for converting between currencies.");
            }
        }
    }
}
