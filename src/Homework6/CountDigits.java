//David Li, 110328771
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Homework6;

import java.util.Scanner;

/**
 *
 * @author dsli
 */
public class CountDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.nextLine();
        int[] countOfDigits = count(s);
        for (int i = 0; i < countOfDigits.length; i++) {
            System.out.println("There are " + countOfDigits[i] + " " + i + "'s in the String.");
        }
    }
    public static int[] count(String s) {
        int[] a = new int[10];
        for (int i = 0; i < s.length(); i++) {
            switch(s.charAt(i)) {
                case '0': a[0]++; break;
                case '1': a[1]++; break;
                case '2': a[2]++; break;
                case '3': a[3]++; break;
                case '4': a[4]++; break;
                case '5': a[5]++; break;
                case '6': a[6]++; break;
                case '7': a[7]++; break;
                case '8': a[8]++; break;
                case '9': a[9]++; break;
            }
        }
        return a;
    }
}
