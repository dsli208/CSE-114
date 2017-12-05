/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LectureNotes1to8;

import java.util.Scanner;

/**
 *
 * @author dsli
 */
public class ChangeMakerModified {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double price = input.nextDouble();
        System.out.print("From: ");
        double amount = input.nextDouble();
        double change = amount - price;
        if (price < 0) {
            System.out.println("You entered a negative input.");
            System.exit(1);
        }
        
        if (price > amount) {
            System.out.println("Not enough money.");
            System.exit(1);
        }
    }
}
