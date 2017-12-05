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
public class Binary2Hex {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a binary string: ");
        String s = input.next();
        System.out.println(binaryToHex(s));
    }

    public static String binaryToHex(String binaryValue) {
        for (int i = 0; i < binaryValue.length(); i++) {
            if (binaryValue.charAt(i) < '0' || binaryValue.charAt(i) > '1') {
                return "Not a valid binary String.";
            }
        }
        String hexValue = "";
        int i = binaryValue.length();
        while (i >= 0) {
            String subBinary = "";
            int sum = 0;
            if ((i - 4) > 0) {
                subBinary = binaryValue.substring((i - 4), i);
            }
            else
                subBinary = binaryValue.substring(0, i);
            for (int j = 0, k = subBinary.length() - 1; j < subBinary.length() && k >= 0; j++, k--) {
                sum += (int)(Math.pow(2, j)) * (subBinary.charAt(k) - 48);
            }
            switch (sum) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9: hexValue = sum + hexValue; break;
                case 10: hexValue = 'A' + hexValue; break;
                case 11: hexValue = 'B' + hexValue; break;
                case 12: hexValue = 'C' + hexValue; break;
                case 13: hexValue = 'D' + hexValue; break;
                case 14: hexValue = 'E' + hexValue; break;
                case 15: hexValue = 'F' + hexValue; break;
            }
            i -= 4;
        }
        return hexValue;
    }
}
