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
public class SortString {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.next();
        String sorted = sort(s);
        System.out.println(sorted);
    }

    public static String sort(String s) {
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length - 1; i++) {
            char min = c[i];
            int minIndex = i;
            for (int j = i + 1; j < c.length; j++) {
                if (c[j] < min) {
                    min = c[j];
                    minIndex = j;
                }
            }
            char temp = c[i];
            c[i] = min;
            c[minIndex] = temp;
        }
        String sorted = new String(c);
        return sorted;
    }
}
