/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab7;

import java.util.Scanner;

/**
 *
 * @author dsli
 */
public class ConversionsMenu {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("A – convert pounds to kilos");
            System.out.println("B – convert kilos to pounds\nC – convert kilometers to miles\nD – convert miles to kilometers\nE - exit");
            System.out.print("Enter a letter choice: ");
            String s = input.next();
            char c = Character.toUpperCase(s.charAt(0));
            switch (c) {
                case 'A':
                    System.out.print("Enter pounds: ");
                    double pounds = input.nextDouble();
                    System.out.println(pounds + " pounds is equal to " + poundsToKilos(pounds) + " kilograms.");
                    break;
                case 'B':
                    System.out.print("Enter kilograms: ");
                    double kilos = input.nextDouble();
                    System.out.println(kilos + " kilograms is equal to " + kilosToPounds(kilos) + " pounds.");
                    break;
                case 'C':
                    System.out.print("Enter kilometers: ");
                    double kilometers = input.nextDouble();
                    System.out.println(kilometers + " kilometers is equal to " + kilosToMiles(kilometers) + " miles.");
                    break;
                case 'D':
                    System.out.print("Enter miles: ");
                    double miles = input.nextDouble();
                    System.out.println(miles + " miles is equal to " + milesToKilos(miles) + " kilometers.");
                    break;
                case 'E':
                    System.out.println("Thank you!");
                    System.exit(0);
                default:
                    System.out.println("That input is invalid.  Enter A - E.");
            }
        }

    }

    public static double poundsToKilos(double pounds) {
        return (pounds / 2.2);
    }

    public static double kilosToPounds(double kilos) {
        return (kilos * 2.2);
    }

    public static double kilosToMiles(double kilos) {
        return (kilos / 1.609);
    }

    public static double milesToKilos(double miles) {
        return (miles * 1.609);
    }
}
