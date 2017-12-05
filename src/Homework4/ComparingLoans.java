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
public class ComparingLoans {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Input for loan amount and number of years
        System.out.print("Enter loan amount: "); double loanAmount = input.nextDouble();
        System.out.print("Enter number of years: "); int years = input.nextInt();
        //First line, Interest Rate, Monthly Payment, Total Payment
        System.out.printf("%-15s\t%-15s\t%-15s\n", "Interest Rate", "Monthly Payment", "Total Payment");
        //For loop to print out monthly and total payments with increment of 0.125% (how to display % at the end of each interest rate
        for (double i = 5.0; i <= 8.0; i += 0.125) {
            double monthlyPayment = loanAmount * (i / 1200) / (1 - (1 / Math.pow(1 + (i / 1200), years * 12)));
            System.out.printf("%-15.3f\t%-15.2f\t%-15.2f\n", i, monthlyPayment, monthlyPayment * years * 12);
        }
    }
}
