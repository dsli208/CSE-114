/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab7;
//Do I determine the average of the absolute values of numbers, or numbers as-is?

import java.util.Scanner;

/**
 *
 * @author dsli
 */
public class CountingNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Declare variables, positive and negative number counts, along with variables for sum, total numbers inputed (both used to calculate average) and variable to be used for input
        int sum = 0;
        int inputNumber = 0;
        int newNumber = 0;
        int positives = 0;
        int negatives = 0;
        do {
            System.out.print("Enter a number: ");
            newNumber = input.nextInt();
            if (newNumber != 0) { //condition that increases variables, ONLY if input is valid to keep loop running
                sum += newNumber;
                inputNumber++;
                //determines whether to increase count of positive/negative numbers
                if (newNumber < 0)
                    negatives++;
                else
                    positives++;
            }
        } while (newNumber != 0);
        //Compute average, and display it along with positive and negative numbers
        double average = ((double)sum) / inputNumber;
        if (inputNumber == 0) {
            System.out.println("No inputs were read.");
            System.exit(0);
        }
        System.out.println("The average is " + average + ".  There were " + positives + " positive numbers and " + negatives + " negative numbers added.");
    }
}
