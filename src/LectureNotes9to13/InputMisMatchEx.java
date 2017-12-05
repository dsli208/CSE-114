/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LectureNotes9to13;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author dsli
 */
public class InputMisMatchEx {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter an integer: ");
            int number = input.nextInt();
            System.out.println("The number entered is " + number);

        } catch (InputMismatchException ex) {
            System.out.println("Try again.  {" + "Incorrect input: an integer is required)");

        }

    }
}
