/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab4;

import java.util.Scanner;

/**
 *
 * @author dsli
 */
public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the month and year: ");
        int month = input.nextInt(); int year = input.nextInt();
        int days = 0;
        switch (month) {
            case 1: days = 31; break;
            case 2: days = (year % 4 == 0) ? 29 : 28; break;
            case 3: days = 31; break;
            case 4: days = 30; break;
            case 5: days = 31; break;
            case 6: days = 30; break;
            case 7: days = 31; break;
            case 8: days = 31; break;
            case 9: days = 30; break;
            case 10: days = 31; break;
            case 11: days = 30; break;
            case 12: days = 31; break;
            default: System.out.println("Invalid input.  Run the program again and try again."); System.exit(0);
        }
        System.out.println(month + " " + year + " has " + days + " days.");
    }
}
