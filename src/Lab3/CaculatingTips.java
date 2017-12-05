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
public class CaculatingTips {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an amount: ");
        double amount = input.nextDouble();
        double tip;
        if (amount < 30)
            tip = 5;
        else
            tip = amount * 0.15;
        double total = amount + tip;
        System.out.print("The gratuity is $");
        System.out.printf("%.2f", tip);
        System.out.print(" and the total amount is $");
        System.out.printf("%.2f\n", total);
        System.out.printf("The tip is $%.2f and the total is $%.2f", tip, total);
    }
}
