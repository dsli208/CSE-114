/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab9;

import java.util.Scanner;

/**
 *
 * @author dsli
 */
public class DistinctNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inputArray = new int[10];
        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = input.nextInt();
        }
        int distinctNumbers = 0;
        int[] distinctArray = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            boolean newNumber = true;
            for (int j = i - 1; j >= 0; j--) {
                if (inputArray[i] == inputArray[j])
                    newNumber = false;
            }
            if (newNumber == true) {
                distinctArray[distinctNumbers] = inputArray[i];
                distinctNumbers++;
            }
        }
        int[] finalArray = new int[distinctNumbers];
        System.arraycopy(distinctArray, 0, finalArray, 0, distinctNumbers);
        System.out.print("The distinct numbers are: ");
        for (int i: finalArray) {
            System.out.print(i + " ");
        }
    }
}
