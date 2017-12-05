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
public class ISBN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a ISBN number(at most 9 digits): ");
        String isbnInput = input.next();
        //Below are two means, an if statement and a for loop for determining if the input is a valid ISBN number
        if (isbnInput.length() > 9) {
            System.out.println("Invalid input.  The ISBN number should be 9 digits or less.");
            System.exit(0);
            }
        for (int i = 0; i < isbnInput.length(); i++) {
            if (isbnInput.charAt(i) < '0' || isbnInput.charAt(i) > '9') {
                System.out.println("Invalid input.  The ISBN number should only consist of digits.");
                System.exit(0);
            }
        }
        int numberOfZeroes = 9 - isbnInput.length();
        System.out.print("The correct ISBN number is: ");
        String zeroes = "";
        for (int i = 0; i < numberOfZeroes; i++) {
            zeroes += "0";
        }
        String isbnRaw = (zeroes + isbnInput); //isbnRaw is the variable for the String consisting of zeroes and the ISBN input, minus the checksum digit
        //Substrings with each digit
        int d1 = Integer.parseInt(isbnRaw.substring(0,1));
        int d2 = Integer.parseInt(isbnRaw.substring(1,2));
        int d3 = Integer.parseInt(isbnRaw.substring(2,3));
        int d4 = Integer.parseInt(isbnRaw.substring(3,4));
        int d5 = Integer.parseInt(isbnRaw.substring(4,5));
        int d6 = Integer.parseInt(isbnRaw.substring(5,6));
        int d7 = Integer.parseInt(isbnRaw.substring(6, 7));
        int d8 = Integer.parseInt(isbnRaw.substring(7,8));
        int d9 = Integer.parseInt(isbnRaw.substring(8, 9));
        int checksum = ((d1 * 1) + (d2 * 2) + (d3 * 3) + (d4 * 4) + (d5 * 5) + (d6 * 6) + (d7 * 7) + (d8 * 8) + (d9 * 9)) % 11;
        String checksumDigit = ((checksum == 10) ? "X" : checksum + "");
        String isbn = isbnRaw + checksumDigit;
        System.out.println(isbn);
    }
}
