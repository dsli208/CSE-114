/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab6;

import java.util.Scanner;

/**
 *
 * @author dsli
 */
public class TimeZones {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the time zone for the first participant (with GMT offset): ");
        int firstZone = input.nextInt();
        System.out.print("Enter the time zone for the second participant (with GMT offset): ");
        int secondZone = input.nextInt();
        int timeDifference = secondZone - firstZone;
        System.out.print("Enter the first participants meeting time (including AM or PM): ");
        int firstTime = input.nextInt();
        String ampm = input.next();
        if (!(ampm.equals("AM")) && !(ampm.equals("PM"))) {
            System.out.println("Invalid time input.  You must use 'AM' or 'PM' in your time input.");
            System.exit(1);
        }
        System.out.println("The first participant meeting time is: " + firstTime + ampm);
        System.out.print("The second participant meeeting time is: " + ((firstTime + timeDifference + 12) % 12));
        if (timeDifference < 0) {
            System.out.println((ampm.equals("AM")) ? "PM" : "AM");
        }
        else
            System.out.println(ampm);
    }
}
